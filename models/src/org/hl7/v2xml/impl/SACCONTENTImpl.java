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

import org.hl7.v2xml.SAC10CONTENT;
import org.hl7.v2xml.SAC11CONTENT;
import org.hl7.v2xml.SAC12CONTENT;
import org.hl7.v2xml.SAC13CONTENT;
import org.hl7.v2xml.SAC14CONTENT;
import org.hl7.v2xml.SAC15CONTENT;
import org.hl7.v2xml.SAC16CONTENT;
import org.hl7.v2xml.SAC17CONTENT;
import org.hl7.v2xml.SAC18CONTENT;
import org.hl7.v2xml.SAC19CONTENT;
import org.hl7.v2xml.SAC1CONTENT;
import org.hl7.v2xml.SAC20CONTENT;
import org.hl7.v2xml.SAC21CONTENT;
import org.hl7.v2xml.SAC22CONTENT;
import org.hl7.v2xml.SAC23CONTENT;
import org.hl7.v2xml.SAC24CONTENT;
import org.hl7.v2xml.SAC25CONTENT;
import org.hl7.v2xml.SAC26CONTENT;
import org.hl7.v2xml.SAC27CONTENT;
import org.hl7.v2xml.SAC28CONTENT;
import org.hl7.v2xml.SAC29CONTENT;
import org.hl7.v2xml.SAC2CONTENT;
import org.hl7.v2xml.SAC30CONTENT;
import org.hl7.v2xml.SAC31CONTENT;
import org.hl7.v2xml.SAC32CONTENT;
import org.hl7.v2xml.SAC33CONTENT;
import org.hl7.v2xml.SAC34CONTENT;
import org.hl7.v2xml.SAC35CONTENT;
import org.hl7.v2xml.SAC36CONTENT;
import org.hl7.v2xml.SAC37CONTENT;
import org.hl7.v2xml.SAC38CONTENT;
import org.hl7.v2xml.SAC39CONTENT;
import org.hl7.v2xml.SAC3CONTENT;
import org.hl7.v2xml.SAC40CONTENT;
import org.hl7.v2xml.SAC41CONTENT;
import org.hl7.v2xml.SAC42CONTENT;
import org.hl7.v2xml.SAC43CONTENT;
import org.hl7.v2xml.SAC44CONTENT;
import org.hl7.v2xml.SAC4CONTENT;
import org.hl7.v2xml.SAC5CONTENT;
import org.hl7.v2xml.SAC6CONTENT;
import org.hl7.v2xml.SAC7CONTENT;
import org.hl7.v2xml.SAC8CONTENT;
import org.hl7.v2xml.SAC9CONTENT;
import org.hl7.v2xml.SACCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SACCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC1 <em>SAC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC2 <em>SAC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC3 <em>SAC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC4 <em>SAC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC5 <em>SAC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC6 <em>SAC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC7 <em>SAC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC8 <em>SAC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC9 <em>SAC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC10 <em>SAC10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC11 <em>SAC11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC12 <em>SAC12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC13 <em>SAC13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC14 <em>SAC14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC15 <em>SAC15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC16 <em>SAC16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC17 <em>SAC17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC18 <em>SAC18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC19 <em>SAC19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC20 <em>SAC20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC21 <em>SAC21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC22 <em>SAC22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC23 <em>SAC23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC24 <em>SAC24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC25 <em>SAC25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC26 <em>SAC26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC27 <em>SAC27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC28 <em>SAC28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC29 <em>SAC29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC30 <em>SAC30</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC31 <em>SAC31</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC32 <em>SAC32</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC33 <em>SAC33</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC34 <em>SAC34</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC35 <em>SAC35</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC36 <em>SAC36</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC37 <em>SAC37</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC38 <em>SAC38</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC39 <em>SAC39</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC40 <em>SAC40</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC41 <em>SAC41</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC42 <em>SAC42</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC43 <em>SAC43</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getSAC44 <em>SAC44</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SACCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SACCONTENTImpl extends EObjectImpl implements SACCONTENT {
	/**
	 * The cached value of the '{@link #getSAC1() <em>SAC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC1()
	 * @generated
	 * @ordered
	 */
	protected SAC1CONTENT sAC1;

	/**
	 * The cached value of the '{@link #getSAC2() <em>SAC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC2()
	 * @generated
	 * @ordered
	 */
	protected SAC2CONTENT sAC2;

	/**
	 * The cached value of the '{@link #getSAC3() <em>SAC3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC3()
	 * @generated
	 * @ordered
	 */
	protected SAC3CONTENT sAC3;

	/**
	 * The cached value of the '{@link #getSAC4() <em>SAC4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC4()
	 * @generated
	 * @ordered
	 */
	protected SAC4CONTENT sAC4;

	/**
	 * The cached value of the '{@link #getSAC5() <em>SAC5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC5()
	 * @generated
	 * @ordered
	 */
	protected SAC5CONTENT sAC5;

	/**
	 * The cached value of the '{@link #getSAC6() <em>SAC6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC6()
	 * @generated
	 * @ordered
	 */
	protected SAC6CONTENT sAC6;

	/**
	 * The cached value of the '{@link #getSAC7() <em>SAC7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC7()
	 * @generated
	 * @ordered
	 */
	protected SAC7CONTENT sAC7;

	/**
	 * The cached value of the '{@link #getSAC8() <em>SAC8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC8()
	 * @generated
	 * @ordered
	 */
	protected SAC8CONTENT sAC8;

	/**
	 * The cached value of the '{@link #getSAC9() <em>SAC9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC9()
	 * @generated
	 * @ordered
	 */
	protected SAC9CONTENT sAC9;

	/**
	 * The cached value of the '{@link #getSAC10() <em>SAC10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC10()
	 * @generated
	 * @ordered
	 */
	protected SAC10CONTENT sAC10;

	/**
	 * The cached value of the '{@link #getSAC11() <em>SAC11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC11()
	 * @generated
	 * @ordered
	 */
	protected SAC11CONTENT sAC11;

	/**
	 * The cached value of the '{@link #getSAC12() <em>SAC12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC12()
	 * @generated
	 * @ordered
	 */
	protected SAC12CONTENT sAC12;

	/**
	 * The cached value of the '{@link #getSAC13() <em>SAC13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC13()
	 * @generated
	 * @ordered
	 */
	protected SAC13CONTENT sAC13;

	/**
	 * The cached value of the '{@link #getSAC14() <em>SAC14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC14()
	 * @generated
	 * @ordered
	 */
	protected SAC14CONTENT sAC14;

	/**
	 * The cached value of the '{@link #getSAC15() <em>SAC15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC15()
	 * @generated
	 * @ordered
	 */
	protected EList<SAC15CONTENT> sAC15;

	/**
	 * The cached value of the '{@link #getSAC16() <em>SAC16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC16()
	 * @generated
	 * @ordered
	 */
	protected SAC16CONTENT sAC16;

	/**
	 * The cached value of the '{@link #getSAC17() <em>SAC17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC17()
	 * @generated
	 * @ordered
	 */
	protected SAC17CONTENT sAC17;

	/**
	 * The cached value of the '{@link #getSAC18() <em>SAC18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC18()
	 * @generated
	 * @ordered
	 */
	protected SAC18CONTENT sAC18;

	/**
	 * The cached value of the '{@link #getSAC19() <em>SAC19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC19()
	 * @generated
	 * @ordered
	 */
	protected SAC19CONTENT sAC19;

	/**
	 * The cached value of the '{@link #getSAC20() <em>SAC20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC20()
	 * @generated
	 * @ordered
	 */
	protected SAC20CONTENT sAC20;

	/**
	 * The cached value of the '{@link #getSAC21() <em>SAC21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC21()
	 * @generated
	 * @ordered
	 */
	protected SAC21CONTENT sAC21;

	/**
	 * The cached value of the '{@link #getSAC22() <em>SAC22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC22()
	 * @generated
	 * @ordered
	 */
	protected SAC22CONTENT sAC22;

	/**
	 * The cached value of the '{@link #getSAC23() <em>SAC23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC23()
	 * @generated
	 * @ordered
	 */
	protected SAC23CONTENT sAC23;

	/**
	 * The cached value of the '{@link #getSAC24() <em>SAC24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC24()
	 * @generated
	 * @ordered
	 */
	protected SAC24CONTENT sAC24;

	/**
	 * The cached value of the '{@link #getSAC25() <em>SAC25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC25()
	 * @generated
	 * @ordered
	 */
	protected SAC25CONTENT sAC25;

	/**
	 * The cached value of the '{@link #getSAC26() <em>SAC26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC26()
	 * @generated
	 * @ordered
	 */
	protected SAC26CONTENT sAC26;

	/**
	 * The cached value of the '{@link #getSAC27() <em>SAC27</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC27()
	 * @generated
	 * @ordered
	 */
	protected EList<SAC27CONTENT> sAC27;

	/**
	 * The cached value of the '{@link #getSAC28() <em>SAC28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC28()
	 * @generated
	 * @ordered
	 */
	protected SAC28CONTENT sAC28;

	/**
	 * The cached value of the '{@link #getSAC29() <em>SAC29</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC29()
	 * @generated
	 * @ordered
	 */
	protected SAC29CONTENT sAC29;

	/**
	 * The cached value of the '{@link #getSAC30() <em>SAC30</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC30()
	 * @generated
	 * @ordered
	 */
	protected SAC30CONTENT sAC30;

	/**
	 * The cached value of the '{@link #getSAC31() <em>SAC31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC31()
	 * @generated
	 * @ordered
	 */
	protected SAC31CONTENT sAC31;

	/**
	 * The cached value of the '{@link #getSAC32() <em>SAC32</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC32()
	 * @generated
	 * @ordered
	 */
	protected SAC32CONTENT sAC32;

	/**
	 * The cached value of the '{@link #getSAC33() <em>SAC33</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC33()
	 * @generated
	 * @ordered
	 */
	protected SAC33CONTENT sAC33;

	/**
	 * The cached value of the '{@link #getSAC34() <em>SAC34</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC34()
	 * @generated
	 * @ordered
	 */
	protected SAC34CONTENT sAC34;

	/**
	 * The cached value of the '{@link #getSAC35() <em>SAC35</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC35()
	 * @generated
	 * @ordered
	 */
	protected SAC35CONTENT sAC35;

	/**
	 * The cached value of the '{@link #getSAC36() <em>SAC36</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC36()
	 * @generated
	 * @ordered
	 */
	protected SAC36CONTENT sAC36;

	/**
	 * The cached value of the '{@link #getSAC37() <em>SAC37</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC37()
	 * @generated
	 * @ordered
	 */
	protected SAC37CONTENT sAC37;

	/**
	 * The cached value of the '{@link #getSAC38() <em>SAC38</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC38()
	 * @generated
	 * @ordered
	 */
	protected SAC38CONTENT sAC38;

	/**
	 * The cached value of the '{@link #getSAC39() <em>SAC39</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC39()
	 * @generated
	 * @ordered
	 */
	protected SAC39CONTENT sAC39;

	/**
	 * The cached value of the '{@link #getSAC40() <em>SAC40</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC40()
	 * @generated
	 * @ordered
	 */
	protected EList<SAC40CONTENT> sAC40;

	/**
	 * The cached value of the '{@link #getSAC41() <em>SAC41</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC41()
	 * @generated
	 * @ordered
	 */
	protected EList<SAC41CONTENT> sAC41;

	/**
	 * The cached value of the '{@link #getSAC42() <em>SAC42</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC42()
	 * @generated
	 * @ordered
	 */
	protected SAC42CONTENT sAC42;

	/**
	 * The cached value of the '{@link #getSAC43() <em>SAC43</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC43()
	 * @generated
	 * @ordered
	 */
	protected EList<SAC43CONTENT> sAC43;

	/**
	 * The cached value of the '{@link #getSAC44() <em>SAC44</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC44()
	 * @generated
	 * @ordered
	 */
	protected EList<SAC44CONTENT> sAC44;

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
	protected SACCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getSACCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC1CONTENT getSAC1() {
		return sAC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC1(SAC1CONTENT newSAC1, NotificationChain msgs) {
		SAC1CONTENT oldSAC1 = sAC1;
		sAC1 = newSAC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC1, oldSAC1, newSAC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC1(SAC1CONTENT newSAC1) {
		if (newSAC1 != sAC1) {
			NotificationChain msgs = null;
			if (sAC1 != null)
				msgs = ((InternalEObject)sAC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC1, null, msgs);
			if (newSAC1 != null)
				msgs = ((InternalEObject)newSAC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC1, null, msgs);
			msgs = basicSetSAC1(newSAC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC1, newSAC1, newSAC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC2CONTENT getSAC2() {
		return sAC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC2(SAC2CONTENT newSAC2, NotificationChain msgs) {
		SAC2CONTENT oldSAC2 = sAC2;
		sAC2 = newSAC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC2, oldSAC2, newSAC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC2(SAC2CONTENT newSAC2) {
		if (newSAC2 != sAC2) {
			NotificationChain msgs = null;
			if (sAC2 != null)
				msgs = ((InternalEObject)sAC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC2, null, msgs);
			if (newSAC2 != null)
				msgs = ((InternalEObject)newSAC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC2, null, msgs);
			msgs = basicSetSAC2(newSAC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC2, newSAC2, newSAC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC3CONTENT getSAC3() {
		return sAC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC3(SAC3CONTENT newSAC3, NotificationChain msgs) {
		SAC3CONTENT oldSAC3 = sAC3;
		sAC3 = newSAC3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC3, oldSAC3, newSAC3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC3(SAC3CONTENT newSAC3) {
		if (newSAC3 != sAC3) {
			NotificationChain msgs = null;
			if (sAC3 != null)
				msgs = ((InternalEObject)sAC3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC3, null, msgs);
			if (newSAC3 != null)
				msgs = ((InternalEObject)newSAC3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC3, null, msgs);
			msgs = basicSetSAC3(newSAC3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC3, newSAC3, newSAC3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC4CONTENT getSAC4() {
		return sAC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC4(SAC4CONTENT newSAC4, NotificationChain msgs) {
		SAC4CONTENT oldSAC4 = sAC4;
		sAC4 = newSAC4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC4, oldSAC4, newSAC4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC4(SAC4CONTENT newSAC4) {
		if (newSAC4 != sAC4) {
			NotificationChain msgs = null;
			if (sAC4 != null)
				msgs = ((InternalEObject)sAC4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC4, null, msgs);
			if (newSAC4 != null)
				msgs = ((InternalEObject)newSAC4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC4, null, msgs);
			msgs = basicSetSAC4(newSAC4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC4, newSAC4, newSAC4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC5CONTENT getSAC5() {
		return sAC5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC5(SAC5CONTENT newSAC5, NotificationChain msgs) {
		SAC5CONTENT oldSAC5 = sAC5;
		sAC5 = newSAC5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC5, oldSAC5, newSAC5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC5(SAC5CONTENT newSAC5) {
		if (newSAC5 != sAC5) {
			NotificationChain msgs = null;
			if (sAC5 != null)
				msgs = ((InternalEObject)sAC5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC5, null, msgs);
			if (newSAC5 != null)
				msgs = ((InternalEObject)newSAC5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC5, null, msgs);
			msgs = basicSetSAC5(newSAC5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC5, newSAC5, newSAC5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC6CONTENT getSAC6() {
		return sAC6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC6(SAC6CONTENT newSAC6, NotificationChain msgs) {
		SAC6CONTENT oldSAC6 = sAC6;
		sAC6 = newSAC6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC6, oldSAC6, newSAC6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC6(SAC6CONTENT newSAC6) {
		if (newSAC6 != sAC6) {
			NotificationChain msgs = null;
			if (sAC6 != null)
				msgs = ((InternalEObject)sAC6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC6, null, msgs);
			if (newSAC6 != null)
				msgs = ((InternalEObject)newSAC6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC6, null, msgs);
			msgs = basicSetSAC6(newSAC6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC6, newSAC6, newSAC6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC7CONTENT getSAC7() {
		return sAC7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC7(SAC7CONTENT newSAC7, NotificationChain msgs) {
		SAC7CONTENT oldSAC7 = sAC7;
		sAC7 = newSAC7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC7, oldSAC7, newSAC7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC7(SAC7CONTENT newSAC7) {
		if (newSAC7 != sAC7) {
			NotificationChain msgs = null;
			if (sAC7 != null)
				msgs = ((InternalEObject)sAC7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC7, null, msgs);
			if (newSAC7 != null)
				msgs = ((InternalEObject)newSAC7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC7, null, msgs);
			msgs = basicSetSAC7(newSAC7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC7, newSAC7, newSAC7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC8CONTENT getSAC8() {
		return sAC8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC8(SAC8CONTENT newSAC8, NotificationChain msgs) {
		SAC8CONTENT oldSAC8 = sAC8;
		sAC8 = newSAC8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC8, oldSAC8, newSAC8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC8(SAC8CONTENT newSAC8) {
		if (newSAC8 != sAC8) {
			NotificationChain msgs = null;
			if (sAC8 != null)
				msgs = ((InternalEObject)sAC8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC8, null, msgs);
			if (newSAC8 != null)
				msgs = ((InternalEObject)newSAC8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC8, null, msgs);
			msgs = basicSetSAC8(newSAC8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC8, newSAC8, newSAC8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC9CONTENT getSAC9() {
		return sAC9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC9(SAC9CONTENT newSAC9, NotificationChain msgs) {
		SAC9CONTENT oldSAC9 = sAC9;
		sAC9 = newSAC9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC9, oldSAC9, newSAC9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC9(SAC9CONTENT newSAC9) {
		if (newSAC9 != sAC9) {
			NotificationChain msgs = null;
			if (sAC9 != null)
				msgs = ((InternalEObject)sAC9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC9, null, msgs);
			if (newSAC9 != null)
				msgs = ((InternalEObject)newSAC9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC9, null, msgs);
			msgs = basicSetSAC9(newSAC9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC9, newSAC9, newSAC9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC10CONTENT getSAC10() {
		return sAC10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC10(SAC10CONTENT newSAC10, NotificationChain msgs) {
		SAC10CONTENT oldSAC10 = sAC10;
		sAC10 = newSAC10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC10, oldSAC10, newSAC10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC10(SAC10CONTENT newSAC10) {
		if (newSAC10 != sAC10) {
			NotificationChain msgs = null;
			if (sAC10 != null)
				msgs = ((InternalEObject)sAC10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC10, null, msgs);
			if (newSAC10 != null)
				msgs = ((InternalEObject)newSAC10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC10, null, msgs);
			msgs = basicSetSAC10(newSAC10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC10, newSAC10, newSAC10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC11CONTENT getSAC11() {
		return sAC11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC11(SAC11CONTENT newSAC11, NotificationChain msgs) {
		SAC11CONTENT oldSAC11 = sAC11;
		sAC11 = newSAC11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC11, oldSAC11, newSAC11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC11(SAC11CONTENT newSAC11) {
		if (newSAC11 != sAC11) {
			NotificationChain msgs = null;
			if (sAC11 != null)
				msgs = ((InternalEObject)sAC11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC11, null, msgs);
			if (newSAC11 != null)
				msgs = ((InternalEObject)newSAC11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC11, null, msgs);
			msgs = basicSetSAC11(newSAC11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC11, newSAC11, newSAC11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC12CONTENT getSAC12() {
		return sAC12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC12(SAC12CONTENT newSAC12, NotificationChain msgs) {
		SAC12CONTENT oldSAC12 = sAC12;
		sAC12 = newSAC12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC12, oldSAC12, newSAC12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC12(SAC12CONTENT newSAC12) {
		if (newSAC12 != sAC12) {
			NotificationChain msgs = null;
			if (sAC12 != null)
				msgs = ((InternalEObject)sAC12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC12, null, msgs);
			if (newSAC12 != null)
				msgs = ((InternalEObject)newSAC12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC12, null, msgs);
			msgs = basicSetSAC12(newSAC12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC12, newSAC12, newSAC12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC13CONTENT getSAC13() {
		return sAC13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC13(SAC13CONTENT newSAC13, NotificationChain msgs) {
		SAC13CONTENT oldSAC13 = sAC13;
		sAC13 = newSAC13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC13, oldSAC13, newSAC13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC13(SAC13CONTENT newSAC13) {
		if (newSAC13 != sAC13) {
			NotificationChain msgs = null;
			if (sAC13 != null)
				msgs = ((InternalEObject)sAC13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC13, null, msgs);
			if (newSAC13 != null)
				msgs = ((InternalEObject)newSAC13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC13, null, msgs);
			msgs = basicSetSAC13(newSAC13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC13, newSAC13, newSAC13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC14CONTENT getSAC14() {
		return sAC14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC14(SAC14CONTENT newSAC14, NotificationChain msgs) {
		SAC14CONTENT oldSAC14 = sAC14;
		sAC14 = newSAC14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC14, oldSAC14, newSAC14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC14(SAC14CONTENT newSAC14) {
		if (newSAC14 != sAC14) {
			NotificationChain msgs = null;
			if (sAC14 != null)
				msgs = ((InternalEObject)sAC14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC14, null, msgs);
			if (newSAC14 != null)
				msgs = ((InternalEObject)newSAC14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC14, null, msgs);
			msgs = basicSetSAC14(newSAC14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC14, newSAC14, newSAC14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SAC15CONTENT> getSAC15() {
		if (sAC15 == null) {
			sAC15 = new EObjectContainmentEList<SAC15CONTENT>(SAC15CONTENT.class, this, V2xmlPackage.SACCONTENT__SAC15);
		}
		return sAC15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC16CONTENT getSAC16() {
		return sAC16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC16(SAC16CONTENT newSAC16, NotificationChain msgs) {
		SAC16CONTENT oldSAC16 = sAC16;
		sAC16 = newSAC16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC16, oldSAC16, newSAC16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC16(SAC16CONTENT newSAC16) {
		if (newSAC16 != sAC16) {
			NotificationChain msgs = null;
			if (sAC16 != null)
				msgs = ((InternalEObject)sAC16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC16, null, msgs);
			if (newSAC16 != null)
				msgs = ((InternalEObject)newSAC16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC16, null, msgs);
			msgs = basicSetSAC16(newSAC16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC16, newSAC16, newSAC16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC17CONTENT getSAC17() {
		return sAC17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC17(SAC17CONTENT newSAC17, NotificationChain msgs) {
		SAC17CONTENT oldSAC17 = sAC17;
		sAC17 = newSAC17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC17, oldSAC17, newSAC17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC17(SAC17CONTENT newSAC17) {
		if (newSAC17 != sAC17) {
			NotificationChain msgs = null;
			if (sAC17 != null)
				msgs = ((InternalEObject)sAC17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC17, null, msgs);
			if (newSAC17 != null)
				msgs = ((InternalEObject)newSAC17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC17, null, msgs);
			msgs = basicSetSAC17(newSAC17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC17, newSAC17, newSAC17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC18CONTENT getSAC18() {
		return sAC18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC18(SAC18CONTENT newSAC18, NotificationChain msgs) {
		SAC18CONTENT oldSAC18 = sAC18;
		sAC18 = newSAC18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC18, oldSAC18, newSAC18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC18(SAC18CONTENT newSAC18) {
		if (newSAC18 != sAC18) {
			NotificationChain msgs = null;
			if (sAC18 != null)
				msgs = ((InternalEObject)sAC18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC18, null, msgs);
			if (newSAC18 != null)
				msgs = ((InternalEObject)newSAC18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC18, null, msgs);
			msgs = basicSetSAC18(newSAC18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC18, newSAC18, newSAC18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC19CONTENT getSAC19() {
		return sAC19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC19(SAC19CONTENT newSAC19, NotificationChain msgs) {
		SAC19CONTENT oldSAC19 = sAC19;
		sAC19 = newSAC19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC19, oldSAC19, newSAC19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC19(SAC19CONTENT newSAC19) {
		if (newSAC19 != sAC19) {
			NotificationChain msgs = null;
			if (sAC19 != null)
				msgs = ((InternalEObject)sAC19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC19, null, msgs);
			if (newSAC19 != null)
				msgs = ((InternalEObject)newSAC19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC19, null, msgs);
			msgs = basicSetSAC19(newSAC19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC19, newSAC19, newSAC19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC20CONTENT getSAC20() {
		return sAC20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC20(SAC20CONTENT newSAC20, NotificationChain msgs) {
		SAC20CONTENT oldSAC20 = sAC20;
		sAC20 = newSAC20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC20, oldSAC20, newSAC20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC20(SAC20CONTENT newSAC20) {
		if (newSAC20 != sAC20) {
			NotificationChain msgs = null;
			if (sAC20 != null)
				msgs = ((InternalEObject)sAC20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC20, null, msgs);
			if (newSAC20 != null)
				msgs = ((InternalEObject)newSAC20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC20, null, msgs);
			msgs = basicSetSAC20(newSAC20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC20, newSAC20, newSAC20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC21CONTENT getSAC21() {
		return sAC21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC21(SAC21CONTENT newSAC21, NotificationChain msgs) {
		SAC21CONTENT oldSAC21 = sAC21;
		sAC21 = newSAC21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC21, oldSAC21, newSAC21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC21(SAC21CONTENT newSAC21) {
		if (newSAC21 != sAC21) {
			NotificationChain msgs = null;
			if (sAC21 != null)
				msgs = ((InternalEObject)sAC21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC21, null, msgs);
			if (newSAC21 != null)
				msgs = ((InternalEObject)newSAC21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC21, null, msgs);
			msgs = basicSetSAC21(newSAC21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC21, newSAC21, newSAC21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC22CONTENT getSAC22() {
		return sAC22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC22(SAC22CONTENT newSAC22, NotificationChain msgs) {
		SAC22CONTENT oldSAC22 = sAC22;
		sAC22 = newSAC22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC22, oldSAC22, newSAC22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC22(SAC22CONTENT newSAC22) {
		if (newSAC22 != sAC22) {
			NotificationChain msgs = null;
			if (sAC22 != null)
				msgs = ((InternalEObject)sAC22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC22, null, msgs);
			if (newSAC22 != null)
				msgs = ((InternalEObject)newSAC22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC22, null, msgs);
			msgs = basicSetSAC22(newSAC22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC22, newSAC22, newSAC22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC23CONTENT getSAC23() {
		return sAC23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC23(SAC23CONTENT newSAC23, NotificationChain msgs) {
		SAC23CONTENT oldSAC23 = sAC23;
		sAC23 = newSAC23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC23, oldSAC23, newSAC23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC23(SAC23CONTENT newSAC23) {
		if (newSAC23 != sAC23) {
			NotificationChain msgs = null;
			if (sAC23 != null)
				msgs = ((InternalEObject)sAC23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC23, null, msgs);
			if (newSAC23 != null)
				msgs = ((InternalEObject)newSAC23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC23, null, msgs);
			msgs = basicSetSAC23(newSAC23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC23, newSAC23, newSAC23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC24CONTENT getSAC24() {
		return sAC24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC24(SAC24CONTENT newSAC24, NotificationChain msgs) {
		SAC24CONTENT oldSAC24 = sAC24;
		sAC24 = newSAC24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC24, oldSAC24, newSAC24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC24(SAC24CONTENT newSAC24) {
		if (newSAC24 != sAC24) {
			NotificationChain msgs = null;
			if (sAC24 != null)
				msgs = ((InternalEObject)sAC24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC24, null, msgs);
			if (newSAC24 != null)
				msgs = ((InternalEObject)newSAC24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC24, null, msgs);
			msgs = basicSetSAC24(newSAC24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC24, newSAC24, newSAC24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC25CONTENT getSAC25() {
		return sAC25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC25(SAC25CONTENT newSAC25, NotificationChain msgs) {
		SAC25CONTENT oldSAC25 = sAC25;
		sAC25 = newSAC25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC25, oldSAC25, newSAC25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC25(SAC25CONTENT newSAC25) {
		if (newSAC25 != sAC25) {
			NotificationChain msgs = null;
			if (sAC25 != null)
				msgs = ((InternalEObject)sAC25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC25, null, msgs);
			if (newSAC25 != null)
				msgs = ((InternalEObject)newSAC25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC25, null, msgs);
			msgs = basicSetSAC25(newSAC25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC25, newSAC25, newSAC25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC26CONTENT getSAC26() {
		return sAC26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC26(SAC26CONTENT newSAC26, NotificationChain msgs) {
		SAC26CONTENT oldSAC26 = sAC26;
		sAC26 = newSAC26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC26, oldSAC26, newSAC26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC26(SAC26CONTENT newSAC26) {
		if (newSAC26 != sAC26) {
			NotificationChain msgs = null;
			if (sAC26 != null)
				msgs = ((InternalEObject)sAC26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC26, null, msgs);
			if (newSAC26 != null)
				msgs = ((InternalEObject)newSAC26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC26, null, msgs);
			msgs = basicSetSAC26(newSAC26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC26, newSAC26, newSAC26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SAC27CONTENT> getSAC27() {
		if (sAC27 == null) {
			sAC27 = new EObjectContainmentEList<SAC27CONTENT>(SAC27CONTENT.class, this, V2xmlPackage.SACCONTENT__SAC27);
		}
		return sAC27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC28CONTENT getSAC28() {
		return sAC28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC28(SAC28CONTENT newSAC28, NotificationChain msgs) {
		SAC28CONTENT oldSAC28 = sAC28;
		sAC28 = newSAC28;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC28, oldSAC28, newSAC28);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC28(SAC28CONTENT newSAC28) {
		if (newSAC28 != sAC28) {
			NotificationChain msgs = null;
			if (sAC28 != null)
				msgs = ((InternalEObject)sAC28).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC28, null, msgs);
			if (newSAC28 != null)
				msgs = ((InternalEObject)newSAC28).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC28, null, msgs);
			msgs = basicSetSAC28(newSAC28, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC28, newSAC28, newSAC28));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC29CONTENT getSAC29() {
		return sAC29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC29(SAC29CONTENT newSAC29, NotificationChain msgs) {
		SAC29CONTENT oldSAC29 = sAC29;
		sAC29 = newSAC29;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC29, oldSAC29, newSAC29);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC29(SAC29CONTENT newSAC29) {
		if (newSAC29 != sAC29) {
			NotificationChain msgs = null;
			if (sAC29 != null)
				msgs = ((InternalEObject)sAC29).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC29, null, msgs);
			if (newSAC29 != null)
				msgs = ((InternalEObject)newSAC29).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC29, null, msgs);
			msgs = basicSetSAC29(newSAC29, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC29, newSAC29, newSAC29));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC30CONTENT getSAC30() {
		return sAC30;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC30(SAC30CONTENT newSAC30, NotificationChain msgs) {
		SAC30CONTENT oldSAC30 = sAC30;
		sAC30 = newSAC30;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC30, oldSAC30, newSAC30);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC30(SAC30CONTENT newSAC30) {
		if (newSAC30 != sAC30) {
			NotificationChain msgs = null;
			if (sAC30 != null)
				msgs = ((InternalEObject)sAC30).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC30, null, msgs);
			if (newSAC30 != null)
				msgs = ((InternalEObject)newSAC30).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC30, null, msgs);
			msgs = basicSetSAC30(newSAC30, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC30, newSAC30, newSAC30));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC31CONTENT getSAC31() {
		return sAC31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC31(SAC31CONTENT newSAC31, NotificationChain msgs) {
		SAC31CONTENT oldSAC31 = sAC31;
		sAC31 = newSAC31;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC31, oldSAC31, newSAC31);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC31(SAC31CONTENT newSAC31) {
		if (newSAC31 != sAC31) {
			NotificationChain msgs = null;
			if (sAC31 != null)
				msgs = ((InternalEObject)sAC31).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC31, null, msgs);
			if (newSAC31 != null)
				msgs = ((InternalEObject)newSAC31).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC31, null, msgs);
			msgs = basicSetSAC31(newSAC31, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC31, newSAC31, newSAC31));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC32CONTENT getSAC32() {
		return sAC32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC32(SAC32CONTENT newSAC32, NotificationChain msgs) {
		SAC32CONTENT oldSAC32 = sAC32;
		sAC32 = newSAC32;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC32, oldSAC32, newSAC32);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC32(SAC32CONTENT newSAC32) {
		if (newSAC32 != sAC32) {
			NotificationChain msgs = null;
			if (sAC32 != null)
				msgs = ((InternalEObject)sAC32).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC32, null, msgs);
			if (newSAC32 != null)
				msgs = ((InternalEObject)newSAC32).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC32, null, msgs);
			msgs = basicSetSAC32(newSAC32, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC32, newSAC32, newSAC32));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC33CONTENT getSAC33() {
		return sAC33;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC33(SAC33CONTENT newSAC33, NotificationChain msgs) {
		SAC33CONTENT oldSAC33 = sAC33;
		sAC33 = newSAC33;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC33, oldSAC33, newSAC33);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC33(SAC33CONTENT newSAC33) {
		if (newSAC33 != sAC33) {
			NotificationChain msgs = null;
			if (sAC33 != null)
				msgs = ((InternalEObject)sAC33).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC33, null, msgs);
			if (newSAC33 != null)
				msgs = ((InternalEObject)newSAC33).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC33, null, msgs);
			msgs = basicSetSAC33(newSAC33, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC33, newSAC33, newSAC33));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC34CONTENT getSAC34() {
		return sAC34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC34(SAC34CONTENT newSAC34, NotificationChain msgs) {
		SAC34CONTENT oldSAC34 = sAC34;
		sAC34 = newSAC34;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC34, oldSAC34, newSAC34);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC34(SAC34CONTENT newSAC34) {
		if (newSAC34 != sAC34) {
			NotificationChain msgs = null;
			if (sAC34 != null)
				msgs = ((InternalEObject)sAC34).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC34, null, msgs);
			if (newSAC34 != null)
				msgs = ((InternalEObject)newSAC34).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC34, null, msgs);
			msgs = basicSetSAC34(newSAC34, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC34, newSAC34, newSAC34));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC35CONTENT getSAC35() {
		return sAC35;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC35(SAC35CONTENT newSAC35, NotificationChain msgs) {
		SAC35CONTENT oldSAC35 = sAC35;
		sAC35 = newSAC35;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC35, oldSAC35, newSAC35);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC35(SAC35CONTENT newSAC35) {
		if (newSAC35 != sAC35) {
			NotificationChain msgs = null;
			if (sAC35 != null)
				msgs = ((InternalEObject)sAC35).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC35, null, msgs);
			if (newSAC35 != null)
				msgs = ((InternalEObject)newSAC35).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC35, null, msgs);
			msgs = basicSetSAC35(newSAC35, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC35, newSAC35, newSAC35));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC36CONTENT getSAC36() {
		return sAC36;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC36(SAC36CONTENT newSAC36, NotificationChain msgs) {
		SAC36CONTENT oldSAC36 = sAC36;
		sAC36 = newSAC36;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC36, oldSAC36, newSAC36);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC36(SAC36CONTENT newSAC36) {
		if (newSAC36 != sAC36) {
			NotificationChain msgs = null;
			if (sAC36 != null)
				msgs = ((InternalEObject)sAC36).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC36, null, msgs);
			if (newSAC36 != null)
				msgs = ((InternalEObject)newSAC36).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC36, null, msgs);
			msgs = basicSetSAC36(newSAC36, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC36, newSAC36, newSAC36));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC37CONTENT getSAC37() {
		return sAC37;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC37(SAC37CONTENT newSAC37, NotificationChain msgs) {
		SAC37CONTENT oldSAC37 = sAC37;
		sAC37 = newSAC37;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC37, oldSAC37, newSAC37);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC37(SAC37CONTENT newSAC37) {
		if (newSAC37 != sAC37) {
			NotificationChain msgs = null;
			if (sAC37 != null)
				msgs = ((InternalEObject)sAC37).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC37, null, msgs);
			if (newSAC37 != null)
				msgs = ((InternalEObject)newSAC37).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC37, null, msgs);
			msgs = basicSetSAC37(newSAC37, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC37, newSAC37, newSAC37));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC38CONTENT getSAC38() {
		return sAC38;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC38(SAC38CONTENT newSAC38, NotificationChain msgs) {
		SAC38CONTENT oldSAC38 = sAC38;
		sAC38 = newSAC38;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC38, oldSAC38, newSAC38);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC38(SAC38CONTENT newSAC38) {
		if (newSAC38 != sAC38) {
			NotificationChain msgs = null;
			if (sAC38 != null)
				msgs = ((InternalEObject)sAC38).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC38, null, msgs);
			if (newSAC38 != null)
				msgs = ((InternalEObject)newSAC38).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC38, null, msgs);
			msgs = basicSetSAC38(newSAC38, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC38, newSAC38, newSAC38));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC39CONTENT getSAC39() {
		return sAC39;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC39(SAC39CONTENT newSAC39, NotificationChain msgs) {
		SAC39CONTENT oldSAC39 = sAC39;
		sAC39 = newSAC39;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC39, oldSAC39, newSAC39);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC39(SAC39CONTENT newSAC39) {
		if (newSAC39 != sAC39) {
			NotificationChain msgs = null;
			if (sAC39 != null)
				msgs = ((InternalEObject)sAC39).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC39, null, msgs);
			if (newSAC39 != null)
				msgs = ((InternalEObject)newSAC39).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC39, null, msgs);
			msgs = basicSetSAC39(newSAC39, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC39, newSAC39, newSAC39));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SAC40CONTENT> getSAC40() {
		if (sAC40 == null) {
			sAC40 = new EObjectContainmentEList<SAC40CONTENT>(SAC40CONTENT.class, this, V2xmlPackage.SACCONTENT__SAC40);
		}
		return sAC40;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SAC41CONTENT> getSAC41() {
		if (sAC41 == null) {
			sAC41 = new EObjectContainmentEList<SAC41CONTENT>(SAC41CONTENT.class, this, V2xmlPackage.SACCONTENT__SAC41);
		}
		return sAC41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAC42CONTENT getSAC42() {
		return sAC42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAC42(SAC42CONTENT newSAC42, NotificationChain msgs) {
		SAC42CONTENT oldSAC42 = sAC42;
		sAC42 = newSAC42;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC42, oldSAC42, newSAC42);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAC42(SAC42CONTENT newSAC42) {
		if (newSAC42 != sAC42) {
			NotificationChain msgs = null;
			if (sAC42 != null)
				msgs = ((InternalEObject)sAC42).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC42, null, msgs);
			if (newSAC42 != null)
				msgs = ((InternalEObject)newSAC42).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SACCONTENT__SAC42, null, msgs);
			msgs = basicSetSAC42(newSAC42, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SACCONTENT__SAC42, newSAC42, newSAC42));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SAC43CONTENT> getSAC43() {
		if (sAC43 == null) {
			sAC43 = new EObjectContainmentEList<SAC43CONTENT>(SAC43CONTENT.class, this, V2xmlPackage.SACCONTENT__SAC43);
		}
		return sAC43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SAC44CONTENT> getSAC44() {
		if (sAC44 == null) {
			sAC44 = new EObjectContainmentEList<SAC44CONTENT>(SAC44CONTENT.class, this, V2xmlPackage.SACCONTENT__SAC44);
		}
		return sAC44;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.SACCONTENT__ANY);
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
			case V2xmlPackage.SACCONTENT__SAC1:
				return basicSetSAC1(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC2:
				return basicSetSAC2(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC3:
				return basicSetSAC3(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC4:
				return basicSetSAC4(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC5:
				return basicSetSAC5(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC6:
				return basicSetSAC6(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC7:
				return basicSetSAC7(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC8:
				return basicSetSAC8(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC9:
				return basicSetSAC9(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC10:
				return basicSetSAC10(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC11:
				return basicSetSAC11(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC12:
				return basicSetSAC12(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC13:
				return basicSetSAC13(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC14:
				return basicSetSAC14(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC15:
				return ((InternalEList<?>)getSAC15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SACCONTENT__SAC16:
				return basicSetSAC16(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC17:
				return basicSetSAC17(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC18:
				return basicSetSAC18(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC19:
				return basicSetSAC19(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC20:
				return basicSetSAC20(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC21:
				return basicSetSAC21(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC22:
				return basicSetSAC22(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC23:
				return basicSetSAC23(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC24:
				return basicSetSAC24(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC25:
				return basicSetSAC25(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC26:
				return basicSetSAC26(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC27:
				return ((InternalEList<?>)getSAC27()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SACCONTENT__SAC28:
				return basicSetSAC28(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC29:
				return basicSetSAC29(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC30:
				return basicSetSAC30(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC31:
				return basicSetSAC31(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC32:
				return basicSetSAC32(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC33:
				return basicSetSAC33(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC34:
				return basicSetSAC34(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC35:
				return basicSetSAC35(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC36:
				return basicSetSAC36(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC37:
				return basicSetSAC37(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC38:
				return basicSetSAC38(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC39:
				return basicSetSAC39(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC40:
				return ((InternalEList<?>)getSAC40()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SACCONTENT__SAC41:
				return ((InternalEList<?>)getSAC41()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SACCONTENT__SAC42:
				return basicSetSAC42(null, msgs);
			case V2xmlPackage.SACCONTENT__SAC43:
				return ((InternalEList<?>)getSAC43()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SACCONTENT__SAC44:
				return ((InternalEList<?>)getSAC44()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SACCONTENT__ANY:
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
			case V2xmlPackage.SACCONTENT__SAC1:
				return getSAC1();
			case V2xmlPackage.SACCONTENT__SAC2:
				return getSAC2();
			case V2xmlPackage.SACCONTENT__SAC3:
				return getSAC3();
			case V2xmlPackage.SACCONTENT__SAC4:
				return getSAC4();
			case V2xmlPackage.SACCONTENT__SAC5:
				return getSAC5();
			case V2xmlPackage.SACCONTENT__SAC6:
				return getSAC6();
			case V2xmlPackage.SACCONTENT__SAC7:
				return getSAC7();
			case V2xmlPackage.SACCONTENT__SAC8:
				return getSAC8();
			case V2xmlPackage.SACCONTENT__SAC9:
				return getSAC9();
			case V2xmlPackage.SACCONTENT__SAC10:
				return getSAC10();
			case V2xmlPackage.SACCONTENT__SAC11:
				return getSAC11();
			case V2xmlPackage.SACCONTENT__SAC12:
				return getSAC12();
			case V2xmlPackage.SACCONTENT__SAC13:
				return getSAC13();
			case V2xmlPackage.SACCONTENT__SAC14:
				return getSAC14();
			case V2xmlPackage.SACCONTENT__SAC15:
				return getSAC15();
			case V2xmlPackage.SACCONTENT__SAC16:
				return getSAC16();
			case V2xmlPackage.SACCONTENT__SAC17:
				return getSAC17();
			case V2xmlPackage.SACCONTENT__SAC18:
				return getSAC18();
			case V2xmlPackage.SACCONTENT__SAC19:
				return getSAC19();
			case V2xmlPackage.SACCONTENT__SAC20:
				return getSAC20();
			case V2xmlPackage.SACCONTENT__SAC21:
				return getSAC21();
			case V2xmlPackage.SACCONTENT__SAC22:
				return getSAC22();
			case V2xmlPackage.SACCONTENT__SAC23:
				return getSAC23();
			case V2xmlPackage.SACCONTENT__SAC24:
				return getSAC24();
			case V2xmlPackage.SACCONTENT__SAC25:
				return getSAC25();
			case V2xmlPackage.SACCONTENT__SAC26:
				return getSAC26();
			case V2xmlPackage.SACCONTENT__SAC27:
				return getSAC27();
			case V2xmlPackage.SACCONTENT__SAC28:
				return getSAC28();
			case V2xmlPackage.SACCONTENT__SAC29:
				return getSAC29();
			case V2xmlPackage.SACCONTENT__SAC30:
				return getSAC30();
			case V2xmlPackage.SACCONTENT__SAC31:
				return getSAC31();
			case V2xmlPackage.SACCONTENT__SAC32:
				return getSAC32();
			case V2xmlPackage.SACCONTENT__SAC33:
				return getSAC33();
			case V2xmlPackage.SACCONTENT__SAC34:
				return getSAC34();
			case V2xmlPackage.SACCONTENT__SAC35:
				return getSAC35();
			case V2xmlPackage.SACCONTENT__SAC36:
				return getSAC36();
			case V2xmlPackage.SACCONTENT__SAC37:
				return getSAC37();
			case V2xmlPackage.SACCONTENT__SAC38:
				return getSAC38();
			case V2xmlPackage.SACCONTENT__SAC39:
				return getSAC39();
			case V2xmlPackage.SACCONTENT__SAC40:
				return getSAC40();
			case V2xmlPackage.SACCONTENT__SAC41:
				return getSAC41();
			case V2xmlPackage.SACCONTENT__SAC42:
				return getSAC42();
			case V2xmlPackage.SACCONTENT__SAC43:
				return getSAC43();
			case V2xmlPackage.SACCONTENT__SAC44:
				return getSAC44();
			case V2xmlPackage.SACCONTENT__ANY:
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
			case V2xmlPackage.SACCONTENT__SAC1:
				setSAC1((SAC1CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC2:
				setSAC2((SAC2CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC3:
				setSAC3((SAC3CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC4:
				setSAC4((SAC4CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC5:
				setSAC5((SAC5CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC6:
				setSAC6((SAC6CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC7:
				setSAC7((SAC7CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC8:
				setSAC8((SAC8CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC9:
				setSAC9((SAC9CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC10:
				setSAC10((SAC10CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC11:
				setSAC11((SAC11CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC12:
				setSAC12((SAC12CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC13:
				setSAC13((SAC13CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC14:
				setSAC14((SAC14CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC15:
				getSAC15().clear();
				getSAC15().addAll((Collection<? extends SAC15CONTENT>)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC16:
				setSAC16((SAC16CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC17:
				setSAC17((SAC17CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC18:
				setSAC18((SAC18CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC19:
				setSAC19((SAC19CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC20:
				setSAC20((SAC20CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC21:
				setSAC21((SAC21CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC22:
				setSAC22((SAC22CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC23:
				setSAC23((SAC23CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC24:
				setSAC24((SAC24CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC25:
				setSAC25((SAC25CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC26:
				setSAC26((SAC26CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC27:
				getSAC27().clear();
				getSAC27().addAll((Collection<? extends SAC27CONTENT>)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC28:
				setSAC28((SAC28CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC29:
				setSAC29((SAC29CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC30:
				setSAC30((SAC30CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC31:
				setSAC31((SAC31CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC32:
				setSAC32((SAC32CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC33:
				setSAC33((SAC33CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC34:
				setSAC34((SAC34CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC35:
				setSAC35((SAC35CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC36:
				setSAC36((SAC36CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC37:
				setSAC37((SAC37CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC38:
				setSAC38((SAC38CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC39:
				setSAC39((SAC39CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC40:
				getSAC40().clear();
				getSAC40().addAll((Collection<? extends SAC40CONTENT>)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC41:
				getSAC41().clear();
				getSAC41().addAll((Collection<? extends SAC41CONTENT>)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC42:
				setSAC42((SAC42CONTENT)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC43:
				getSAC43().clear();
				getSAC43().addAll((Collection<? extends SAC43CONTENT>)newValue);
				return;
			case V2xmlPackage.SACCONTENT__SAC44:
				getSAC44().clear();
				getSAC44().addAll((Collection<? extends SAC44CONTENT>)newValue);
				return;
			case V2xmlPackage.SACCONTENT__ANY:
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
			case V2xmlPackage.SACCONTENT__SAC1:
				setSAC1((SAC1CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC2:
				setSAC2((SAC2CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC3:
				setSAC3((SAC3CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC4:
				setSAC4((SAC4CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC5:
				setSAC5((SAC5CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC6:
				setSAC6((SAC6CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC7:
				setSAC7((SAC7CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC8:
				setSAC8((SAC8CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC9:
				setSAC9((SAC9CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC10:
				setSAC10((SAC10CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC11:
				setSAC11((SAC11CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC12:
				setSAC12((SAC12CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC13:
				setSAC13((SAC13CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC14:
				setSAC14((SAC14CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC15:
				getSAC15().clear();
				return;
			case V2xmlPackage.SACCONTENT__SAC16:
				setSAC16((SAC16CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC17:
				setSAC17((SAC17CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC18:
				setSAC18((SAC18CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC19:
				setSAC19((SAC19CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC20:
				setSAC20((SAC20CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC21:
				setSAC21((SAC21CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC22:
				setSAC22((SAC22CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC23:
				setSAC23((SAC23CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC24:
				setSAC24((SAC24CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC25:
				setSAC25((SAC25CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC26:
				setSAC26((SAC26CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC27:
				getSAC27().clear();
				return;
			case V2xmlPackage.SACCONTENT__SAC28:
				setSAC28((SAC28CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC29:
				setSAC29((SAC29CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC30:
				setSAC30((SAC30CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC31:
				setSAC31((SAC31CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC32:
				setSAC32((SAC32CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC33:
				setSAC33((SAC33CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC34:
				setSAC34((SAC34CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC35:
				setSAC35((SAC35CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC36:
				setSAC36((SAC36CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC37:
				setSAC37((SAC37CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC38:
				setSAC38((SAC38CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC39:
				setSAC39((SAC39CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC40:
				getSAC40().clear();
				return;
			case V2xmlPackage.SACCONTENT__SAC41:
				getSAC41().clear();
				return;
			case V2xmlPackage.SACCONTENT__SAC42:
				setSAC42((SAC42CONTENT)null);
				return;
			case V2xmlPackage.SACCONTENT__SAC43:
				getSAC43().clear();
				return;
			case V2xmlPackage.SACCONTENT__SAC44:
				getSAC44().clear();
				return;
			case V2xmlPackage.SACCONTENT__ANY:
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
			case V2xmlPackage.SACCONTENT__SAC1:
				return sAC1 != null;
			case V2xmlPackage.SACCONTENT__SAC2:
				return sAC2 != null;
			case V2xmlPackage.SACCONTENT__SAC3:
				return sAC3 != null;
			case V2xmlPackage.SACCONTENT__SAC4:
				return sAC4 != null;
			case V2xmlPackage.SACCONTENT__SAC5:
				return sAC5 != null;
			case V2xmlPackage.SACCONTENT__SAC6:
				return sAC6 != null;
			case V2xmlPackage.SACCONTENT__SAC7:
				return sAC7 != null;
			case V2xmlPackage.SACCONTENT__SAC8:
				return sAC8 != null;
			case V2xmlPackage.SACCONTENT__SAC9:
				return sAC9 != null;
			case V2xmlPackage.SACCONTENT__SAC10:
				return sAC10 != null;
			case V2xmlPackage.SACCONTENT__SAC11:
				return sAC11 != null;
			case V2xmlPackage.SACCONTENT__SAC12:
				return sAC12 != null;
			case V2xmlPackage.SACCONTENT__SAC13:
				return sAC13 != null;
			case V2xmlPackage.SACCONTENT__SAC14:
				return sAC14 != null;
			case V2xmlPackage.SACCONTENT__SAC15:
				return sAC15 != null && !sAC15.isEmpty();
			case V2xmlPackage.SACCONTENT__SAC16:
				return sAC16 != null;
			case V2xmlPackage.SACCONTENT__SAC17:
				return sAC17 != null;
			case V2xmlPackage.SACCONTENT__SAC18:
				return sAC18 != null;
			case V2xmlPackage.SACCONTENT__SAC19:
				return sAC19 != null;
			case V2xmlPackage.SACCONTENT__SAC20:
				return sAC20 != null;
			case V2xmlPackage.SACCONTENT__SAC21:
				return sAC21 != null;
			case V2xmlPackage.SACCONTENT__SAC22:
				return sAC22 != null;
			case V2xmlPackage.SACCONTENT__SAC23:
				return sAC23 != null;
			case V2xmlPackage.SACCONTENT__SAC24:
				return sAC24 != null;
			case V2xmlPackage.SACCONTENT__SAC25:
				return sAC25 != null;
			case V2xmlPackage.SACCONTENT__SAC26:
				return sAC26 != null;
			case V2xmlPackage.SACCONTENT__SAC27:
				return sAC27 != null && !sAC27.isEmpty();
			case V2xmlPackage.SACCONTENT__SAC28:
				return sAC28 != null;
			case V2xmlPackage.SACCONTENT__SAC29:
				return sAC29 != null;
			case V2xmlPackage.SACCONTENT__SAC30:
				return sAC30 != null;
			case V2xmlPackage.SACCONTENT__SAC31:
				return sAC31 != null;
			case V2xmlPackage.SACCONTENT__SAC32:
				return sAC32 != null;
			case V2xmlPackage.SACCONTENT__SAC33:
				return sAC33 != null;
			case V2xmlPackage.SACCONTENT__SAC34:
				return sAC34 != null;
			case V2xmlPackage.SACCONTENT__SAC35:
				return sAC35 != null;
			case V2xmlPackage.SACCONTENT__SAC36:
				return sAC36 != null;
			case V2xmlPackage.SACCONTENT__SAC37:
				return sAC37 != null;
			case V2xmlPackage.SACCONTENT__SAC38:
				return sAC38 != null;
			case V2xmlPackage.SACCONTENT__SAC39:
				return sAC39 != null;
			case V2xmlPackage.SACCONTENT__SAC40:
				return sAC40 != null && !sAC40.isEmpty();
			case V2xmlPackage.SACCONTENT__SAC41:
				return sAC41 != null && !sAC41.isEmpty();
			case V2xmlPackage.SACCONTENT__SAC42:
				return sAC42 != null;
			case V2xmlPackage.SACCONTENT__SAC43:
				return sAC43 != null && !sAC43.isEmpty();
			case V2xmlPackage.SACCONTENT__SAC44:
				return sAC44 != null && !sAC44.isEmpty();
			case V2xmlPackage.SACCONTENT__ANY:
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

} //SACCONTENTImpl
