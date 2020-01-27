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

import org.hl7.v2xml.OBR10CONTENT;
import org.hl7.v2xml.OBR11CONTENT;
import org.hl7.v2xml.OBR12CONTENT;
import org.hl7.v2xml.OBR13CONTENT;
import org.hl7.v2xml.OBR14CONTENT;
import org.hl7.v2xml.OBR15CONTENT;
import org.hl7.v2xml.OBR16CONTENT;
import org.hl7.v2xml.OBR17CONTENT;
import org.hl7.v2xml.OBR18CONTENT;
import org.hl7.v2xml.OBR19CONTENT;
import org.hl7.v2xml.OBR1CONTENT;
import org.hl7.v2xml.OBR20CONTENT;
import org.hl7.v2xml.OBR21CONTENT;
import org.hl7.v2xml.OBR22CONTENT;
import org.hl7.v2xml.OBR23CONTENT;
import org.hl7.v2xml.OBR24CONTENT;
import org.hl7.v2xml.OBR25CONTENT;
import org.hl7.v2xml.OBR26CONTENT;
import org.hl7.v2xml.OBR27CONTENT;
import org.hl7.v2xml.OBR28CONTENT;
import org.hl7.v2xml.OBR29CONTENT;
import org.hl7.v2xml.OBR2CONTENT;
import org.hl7.v2xml.OBR30CONTENT;
import org.hl7.v2xml.OBR31CONTENT;
import org.hl7.v2xml.OBR32CONTENT;
import org.hl7.v2xml.OBR33CONTENT;
import org.hl7.v2xml.OBR34CONTENT;
import org.hl7.v2xml.OBR35CONTENT;
import org.hl7.v2xml.OBR36CONTENT;
import org.hl7.v2xml.OBR37CONTENT;
import org.hl7.v2xml.OBR38CONTENT;
import org.hl7.v2xml.OBR39CONTENT;
import org.hl7.v2xml.OBR3CONTENT;
import org.hl7.v2xml.OBR40CONTENT;
import org.hl7.v2xml.OBR41CONTENT;
import org.hl7.v2xml.OBR42CONTENT;
import org.hl7.v2xml.OBR43CONTENT;
import org.hl7.v2xml.OBR44CONTENT;
import org.hl7.v2xml.OBR45CONTENT;
import org.hl7.v2xml.OBR46CONTENT;
import org.hl7.v2xml.OBR47CONTENT;
import org.hl7.v2xml.OBR48CONTENT;
import org.hl7.v2xml.OBR49CONTENT;
import org.hl7.v2xml.OBR4CONTENT;
import org.hl7.v2xml.OBR5CONTENT;
import org.hl7.v2xml.OBR6CONTENT;
import org.hl7.v2xml.OBR7CONTENT;
import org.hl7.v2xml.OBR8CONTENT;
import org.hl7.v2xml.OBR9CONTENT;
import org.hl7.v2xml.OBRCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OBRCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR1 <em>OBR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR2 <em>OBR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR3 <em>OBR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR4 <em>OBR4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR5 <em>OBR5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR6 <em>OBR6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR7 <em>OBR7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR8 <em>OBR8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR9 <em>OBR9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR10 <em>OBR10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR11 <em>OBR11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR12 <em>OBR12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR13 <em>OBR13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR14 <em>OBR14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR15 <em>OBR15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR16 <em>OBR16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR17 <em>OBR17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR18 <em>OBR18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR19 <em>OBR19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR20 <em>OBR20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR21 <em>OBR21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR22 <em>OBR22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR23 <em>OBR23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR24 <em>OBR24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR25 <em>OBR25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR26 <em>OBR26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR27 <em>OBR27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR28 <em>OBR28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR29 <em>OBR29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR30 <em>OBR30</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR31 <em>OBR31</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR32 <em>OBR32</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR33 <em>OBR33</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR34 <em>OBR34</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR35 <em>OBR35</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR36 <em>OBR36</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR37 <em>OBR37</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR38 <em>OBR38</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR39 <em>OBR39</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR40 <em>OBR40</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR41 <em>OBR41</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR42 <em>OBR42</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR43 <em>OBR43</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR44 <em>OBR44</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR45 <em>OBR45</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR46 <em>OBR46</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR47 <em>OBR47</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR48 <em>OBR48</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getOBR49 <em>OBR49</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBRCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OBRCONTENTImpl extends EObjectImpl implements OBRCONTENT {
	/**
	 * The cached value of the '{@link #getOBR1() <em>OBR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR1()
	 * @generated
	 * @ordered
	 */
	protected OBR1CONTENT oBR1;

	/**
	 * The cached value of the '{@link #getOBR2() <em>OBR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR2()
	 * @generated
	 * @ordered
	 */
	protected OBR2CONTENT oBR2;

	/**
	 * The cached value of the '{@link #getOBR3() <em>OBR3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR3()
	 * @generated
	 * @ordered
	 */
	protected OBR3CONTENT oBR3;

	/**
	 * The cached value of the '{@link #getOBR4() <em>OBR4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR4()
	 * @generated
	 * @ordered
	 */
	protected OBR4CONTENT oBR4;

	/**
	 * The cached value of the '{@link #getOBR5() <em>OBR5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR5()
	 * @generated
	 * @ordered
	 */
	protected OBR5CONTENT oBR5;

	/**
	 * The cached value of the '{@link #getOBR6() <em>OBR6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR6()
	 * @generated
	 * @ordered
	 */
	protected OBR6CONTENT oBR6;

	/**
	 * The cached value of the '{@link #getOBR7() <em>OBR7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR7()
	 * @generated
	 * @ordered
	 */
	protected OBR7CONTENT oBR7;

	/**
	 * The cached value of the '{@link #getOBR8() <em>OBR8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR8()
	 * @generated
	 * @ordered
	 */
	protected OBR8CONTENT oBR8;

	/**
	 * The cached value of the '{@link #getOBR9() <em>OBR9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR9()
	 * @generated
	 * @ordered
	 */
	protected OBR9CONTENT oBR9;

	/**
	 * The cached value of the '{@link #getOBR10() <em>OBR10</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR10()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR10CONTENT> oBR10;

	/**
	 * The cached value of the '{@link #getOBR11() <em>OBR11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR11()
	 * @generated
	 * @ordered
	 */
	protected OBR11CONTENT oBR11;

	/**
	 * The cached value of the '{@link #getOBR12() <em>OBR12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR12()
	 * @generated
	 * @ordered
	 */
	protected OBR12CONTENT oBR12;

	/**
	 * The cached value of the '{@link #getOBR13() <em>OBR13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR13()
	 * @generated
	 * @ordered
	 */
	protected OBR13CONTENT oBR13;

	/**
	 * The cached value of the '{@link #getOBR14() <em>OBR14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR14()
	 * @generated
	 * @ordered
	 */
	protected OBR14CONTENT oBR14;

	/**
	 * The cached value of the '{@link #getOBR15() <em>OBR15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR15()
	 * @generated
	 * @ordered
	 */
	protected OBR15CONTENT oBR15;

	/**
	 * The cached value of the '{@link #getOBR16() <em>OBR16</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR16()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR16CONTENT> oBR16;

	/**
	 * The cached value of the '{@link #getOBR17() <em>OBR17</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR17()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR17CONTENT> oBR17;

	/**
	 * The cached value of the '{@link #getOBR18() <em>OBR18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR18()
	 * @generated
	 * @ordered
	 */
	protected OBR18CONTENT oBR18;

	/**
	 * The cached value of the '{@link #getOBR19() <em>OBR19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR19()
	 * @generated
	 * @ordered
	 */
	protected OBR19CONTENT oBR19;

	/**
	 * The cached value of the '{@link #getOBR20() <em>OBR20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR20()
	 * @generated
	 * @ordered
	 */
	protected OBR20CONTENT oBR20;

	/**
	 * The cached value of the '{@link #getOBR21() <em>OBR21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR21()
	 * @generated
	 * @ordered
	 */
	protected OBR21CONTENT oBR21;

	/**
	 * The cached value of the '{@link #getOBR22() <em>OBR22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR22()
	 * @generated
	 * @ordered
	 */
	protected OBR22CONTENT oBR22;

	/**
	 * The cached value of the '{@link #getOBR23() <em>OBR23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR23()
	 * @generated
	 * @ordered
	 */
	protected OBR23CONTENT oBR23;

	/**
	 * The cached value of the '{@link #getOBR24() <em>OBR24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR24()
	 * @generated
	 * @ordered
	 */
	protected OBR24CONTENT oBR24;

	/**
	 * The cached value of the '{@link #getOBR25() <em>OBR25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR25()
	 * @generated
	 * @ordered
	 */
	protected OBR25CONTENT oBR25;

	/**
	 * The cached value of the '{@link #getOBR26() <em>OBR26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR26()
	 * @generated
	 * @ordered
	 */
	protected OBR26CONTENT oBR26;

	/**
	 * The cached value of the '{@link #getOBR27() <em>OBR27</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR27()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR27CONTENT> oBR27;

	/**
	 * The cached value of the '{@link #getOBR28() <em>OBR28</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR28()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR28CONTENT> oBR28;

	/**
	 * The cached value of the '{@link #getOBR29() <em>OBR29</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR29()
	 * @generated
	 * @ordered
	 */
	protected OBR29CONTENT oBR29;

	/**
	 * The cached value of the '{@link #getOBR30() <em>OBR30</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR30()
	 * @generated
	 * @ordered
	 */
	protected OBR30CONTENT oBR30;

	/**
	 * The cached value of the '{@link #getOBR31() <em>OBR31</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR31()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR31CONTENT> oBR31;

	/**
	 * The cached value of the '{@link #getOBR32() <em>OBR32</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR32()
	 * @generated
	 * @ordered
	 */
	protected OBR32CONTENT oBR32;

	/**
	 * The cached value of the '{@link #getOBR33() <em>OBR33</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR33()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR33CONTENT> oBR33;

	/**
	 * The cached value of the '{@link #getOBR34() <em>OBR34</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR34()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR34CONTENT> oBR34;

	/**
	 * The cached value of the '{@link #getOBR35() <em>OBR35</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR35()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR35CONTENT> oBR35;

	/**
	 * The cached value of the '{@link #getOBR36() <em>OBR36</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR36()
	 * @generated
	 * @ordered
	 */
	protected OBR36CONTENT oBR36;

	/**
	 * The cached value of the '{@link #getOBR37() <em>OBR37</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR37()
	 * @generated
	 * @ordered
	 */
	protected OBR37CONTENT oBR37;

	/**
	 * The cached value of the '{@link #getOBR38() <em>OBR38</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR38()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR38CONTENT> oBR38;

	/**
	 * The cached value of the '{@link #getOBR39() <em>OBR39</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR39()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR39CONTENT> oBR39;

	/**
	 * The cached value of the '{@link #getOBR40() <em>OBR40</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR40()
	 * @generated
	 * @ordered
	 */
	protected OBR40CONTENT oBR40;

	/**
	 * The cached value of the '{@link #getOBR41() <em>OBR41</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR41()
	 * @generated
	 * @ordered
	 */
	protected OBR41CONTENT oBR41;

	/**
	 * The cached value of the '{@link #getOBR42() <em>OBR42</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR42()
	 * @generated
	 * @ordered
	 */
	protected OBR42CONTENT oBR42;

	/**
	 * The cached value of the '{@link #getOBR43() <em>OBR43</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR43()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR43CONTENT> oBR43;

	/**
	 * The cached value of the '{@link #getOBR44() <em>OBR44</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR44()
	 * @generated
	 * @ordered
	 */
	protected OBR44CONTENT oBR44;

	/**
	 * The cached value of the '{@link #getOBR45() <em>OBR45</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR45()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR45CONTENT> oBR45;

	/**
	 * The cached value of the '{@link #getOBR46() <em>OBR46</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR46()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR46CONTENT> oBR46;

	/**
	 * The cached value of the '{@link #getOBR47() <em>OBR47</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR47()
	 * @generated
	 * @ordered
	 */
	protected EList<OBR47CONTENT> oBR47;

	/**
	 * The cached value of the '{@link #getOBR48() <em>OBR48</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR48()
	 * @generated
	 * @ordered
	 */
	protected OBR48CONTENT oBR48;

	/**
	 * The cached value of the '{@link #getOBR49() <em>OBR49</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR49()
	 * @generated
	 * @ordered
	 */
	protected OBR49CONTENT oBR49;

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
	protected OBRCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getOBRCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR1CONTENT getOBR1() {
		return oBR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR1(OBR1CONTENT newOBR1, NotificationChain msgs) {
		OBR1CONTENT oldOBR1 = oBR1;
		oBR1 = newOBR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR1, oldOBR1, newOBR1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR1(OBR1CONTENT newOBR1) {
		if (newOBR1 != oBR1) {
			NotificationChain msgs = null;
			if (oBR1 != null)
				msgs = ((InternalEObject)oBR1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR1, null, msgs);
			if (newOBR1 != null)
				msgs = ((InternalEObject)newOBR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR1, null, msgs);
			msgs = basicSetOBR1(newOBR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR1, newOBR1, newOBR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR2CONTENT getOBR2() {
		return oBR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR2(OBR2CONTENT newOBR2, NotificationChain msgs) {
		OBR2CONTENT oldOBR2 = oBR2;
		oBR2 = newOBR2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR2, oldOBR2, newOBR2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR2(OBR2CONTENT newOBR2) {
		if (newOBR2 != oBR2) {
			NotificationChain msgs = null;
			if (oBR2 != null)
				msgs = ((InternalEObject)oBR2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR2, null, msgs);
			if (newOBR2 != null)
				msgs = ((InternalEObject)newOBR2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR2, null, msgs);
			msgs = basicSetOBR2(newOBR2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR2, newOBR2, newOBR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR3CONTENT getOBR3() {
		return oBR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR3(OBR3CONTENT newOBR3, NotificationChain msgs) {
		OBR3CONTENT oldOBR3 = oBR3;
		oBR3 = newOBR3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR3, oldOBR3, newOBR3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR3(OBR3CONTENT newOBR3) {
		if (newOBR3 != oBR3) {
			NotificationChain msgs = null;
			if (oBR3 != null)
				msgs = ((InternalEObject)oBR3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR3, null, msgs);
			if (newOBR3 != null)
				msgs = ((InternalEObject)newOBR3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR3, null, msgs);
			msgs = basicSetOBR3(newOBR3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR3, newOBR3, newOBR3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR4CONTENT getOBR4() {
		return oBR4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR4(OBR4CONTENT newOBR4, NotificationChain msgs) {
		OBR4CONTENT oldOBR4 = oBR4;
		oBR4 = newOBR4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR4, oldOBR4, newOBR4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR4(OBR4CONTENT newOBR4) {
		if (newOBR4 != oBR4) {
			NotificationChain msgs = null;
			if (oBR4 != null)
				msgs = ((InternalEObject)oBR4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR4, null, msgs);
			if (newOBR4 != null)
				msgs = ((InternalEObject)newOBR4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR4, null, msgs);
			msgs = basicSetOBR4(newOBR4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR4, newOBR4, newOBR4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR5CONTENT getOBR5() {
		return oBR5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR5(OBR5CONTENT newOBR5, NotificationChain msgs) {
		OBR5CONTENT oldOBR5 = oBR5;
		oBR5 = newOBR5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR5, oldOBR5, newOBR5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR5(OBR5CONTENT newOBR5) {
		if (newOBR5 != oBR5) {
			NotificationChain msgs = null;
			if (oBR5 != null)
				msgs = ((InternalEObject)oBR5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR5, null, msgs);
			if (newOBR5 != null)
				msgs = ((InternalEObject)newOBR5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR5, null, msgs);
			msgs = basicSetOBR5(newOBR5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR5, newOBR5, newOBR5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR6CONTENT getOBR6() {
		return oBR6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR6(OBR6CONTENT newOBR6, NotificationChain msgs) {
		OBR6CONTENT oldOBR6 = oBR6;
		oBR6 = newOBR6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR6, oldOBR6, newOBR6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR6(OBR6CONTENT newOBR6) {
		if (newOBR6 != oBR6) {
			NotificationChain msgs = null;
			if (oBR6 != null)
				msgs = ((InternalEObject)oBR6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR6, null, msgs);
			if (newOBR6 != null)
				msgs = ((InternalEObject)newOBR6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR6, null, msgs);
			msgs = basicSetOBR6(newOBR6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR6, newOBR6, newOBR6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR7CONTENT getOBR7() {
		return oBR7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR7(OBR7CONTENT newOBR7, NotificationChain msgs) {
		OBR7CONTENT oldOBR7 = oBR7;
		oBR7 = newOBR7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR7, oldOBR7, newOBR7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR7(OBR7CONTENT newOBR7) {
		if (newOBR7 != oBR7) {
			NotificationChain msgs = null;
			if (oBR7 != null)
				msgs = ((InternalEObject)oBR7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR7, null, msgs);
			if (newOBR7 != null)
				msgs = ((InternalEObject)newOBR7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR7, null, msgs);
			msgs = basicSetOBR7(newOBR7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR7, newOBR7, newOBR7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR8CONTENT getOBR8() {
		return oBR8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR8(OBR8CONTENT newOBR8, NotificationChain msgs) {
		OBR8CONTENT oldOBR8 = oBR8;
		oBR8 = newOBR8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR8, oldOBR8, newOBR8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR8(OBR8CONTENT newOBR8) {
		if (newOBR8 != oBR8) {
			NotificationChain msgs = null;
			if (oBR8 != null)
				msgs = ((InternalEObject)oBR8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR8, null, msgs);
			if (newOBR8 != null)
				msgs = ((InternalEObject)newOBR8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR8, null, msgs);
			msgs = basicSetOBR8(newOBR8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR8, newOBR8, newOBR8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR9CONTENT getOBR9() {
		return oBR9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR9(OBR9CONTENT newOBR9, NotificationChain msgs) {
		OBR9CONTENT oldOBR9 = oBR9;
		oBR9 = newOBR9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR9, oldOBR9, newOBR9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR9(OBR9CONTENT newOBR9) {
		if (newOBR9 != oBR9) {
			NotificationChain msgs = null;
			if (oBR9 != null)
				msgs = ((InternalEObject)oBR9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR9, null, msgs);
			if (newOBR9 != null)
				msgs = ((InternalEObject)newOBR9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR9, null, msgs);
			msgs = basicSetOBR9(newOBR9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR9, newOBR9, newOBR9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR10CONTENT> getOBR10() {
		if (oBR10 == null) {
			oBR10 = new EObjectContainmentEList<OBR10CONTENT>(OBR10CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR10);
		}
		return oBR10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR11CONTENT getOBR11() {
		return oBR11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR11(OBR11CONTENT newOBR11, NotificationChain msgs) {
		OBR11CONTENT oldOBR11 = oBR11;
		oBR11 = newOBR11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR11, oldOBR11, newOBR11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR11(OBR11CONTENT newOBR11) {
		if (newOBR11 != oBR11) {
			NotificationChain msgs = null;
			if (oBR11 != null)
				msgs = ((InternalEObject)oBR11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR11, null, msgs);
			if (newOBR11 != null)
				msgs = ((InternalEObject)newOBR11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR11, null, msgs);
			msgs = basicSetOBR11(newOBR11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR11, newOBR11, newOBR11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR12CONTENT getOBR12() {
		return oBR12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR12(OBR12CONTENT newOBR12, NotificationChain msgs) {
		OBR12CONTENT oldOBR12 = oBR12;
		oBR12 = newOBR12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR12, oldOBR12, newOBR12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR12(OBR12CONTENT newOBR12) {
		if (newOBR12 != oBR12) {
			NotificationChain msgs = null;
			if (oBR12 != null)
				msgs = ((InternalEObject)oBR12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR12, null, msgs);
			if (newOBR12 != null)
				msgs = ((InternalEObject)newOBR12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR12, null, msgs);
			msgs = basicSetOBR12(newOBR12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR12, newOBR12, newOBR12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR13CONTENT getOBR13() {
		return oBR13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR13(OBR13CONTENT newOBR13, NotificationChain msgs) {
		OBR13CONTENT oldOBR13 = oBR13;
		oBR13 = newOBR13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR13, oldOBR13, newOBR13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR13(OBR13CONTENT newOBR13) {
		if (newOBR13 != oBR13) {
			NotificationChain msgs = null;
			if (oBR13 != null)
				msgs = ((InternalEObject)oBR13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR13, null, msgs);
			if (newOBR13 != null)
				msgs = ((InternalEObject)newOBR13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR13, null, msgs);
			msgs = basicSetOBR13(newOBR13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR13, newOBR13, newOBR13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR14CONTENT getOBR14() {
		return oBR14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR14(OBR14CONTENT newOBR14, NotificationChain msgs) {
		OBR14CONTENT oldOBR14 = oBR14;
		oBR14 = newOBR14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR14, oldOBR14, newOBR14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR14(OBR14CONTENT newOBR14) {
		if (newOBR14 != oBR14) {
			NotificationChain msgs = null;
			if (oBR14 != null)
				msgs = ((InternalEObject)oBR14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR14, null, msgs);
			if (newOBR14 != null)
				msgs = ((InternalEObject)newOBR14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR14, null, msgs);
			msgs = basicSetOBR14(newOBR14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR14, newOBR14, newOBR14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR15CONTENT getOBR15() {
		return oBR15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR15(OBR15CONTENT newOBR15, NotificationChain msgs) {
		OBR15CONTENT oldOBR15 = oBR15;
		oBR15 = newOBR15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR15, oldOBR15, newOBR15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR15(OBR15CONTENT newOBR15) {
		if (newOBR15 != oBR15) {
			NotificationChain msgs = null;
			if (oBR15 != null)
				msgs = ((InternalEObject)oBR15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR15, null, msgs);
			if (newOBR15 != null)
				msgs = ((InternalEObject)newOBR15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR15, null, msgs);
			msgs = basicSetOBR15(newOBR15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR15, newOBR15, newOBR15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR16CONTENT> getOBR16() {
		if (oBR16 == null) {
			oBR16 = new EObjectContainmentEList<OBR16CONTENT>(OBR16CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR16);
		}
		return oBR16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR17CONTENT> getOBR17() {
		if (oBR17 == null) {
			oBR17 = new EObjectContainmentEList<OBR17CONTENT>(OBR17CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR17);
		}
		return oBR17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR18CONTENT getOBR18() {
		return oBR18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR18(OBR18CONTENT newOBR18, NotificationChain msgs) {
		OBR18CONTENT oldOBR18 = oBR18;
		oBR18 = newOBR18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR18, oldOBR18, newOBR18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR18(OBR18CONTENT newOBR18) {
		if (newOBR18 != oBR18) {
			NotificationChain msgs = null;
			if (oBR18 != null)
				msgs = ((InternalEObject)oBR18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR18, null, msgs);
			if (newOBR18 != null)
				msgs = ((InternalEObject)newOBR18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR18, null, msgs);
			msgs = basicSetOBR18(newOBR18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR18, newOBR18, newOBR18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR19CONTENT getOBR19() {
		return oBR19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR19(OBR19CONTENT newOBR19, NotificationChain msgs) {
		OBR19CONTENT oldOBR19 = oBR19;
		oBR19 = newOBR19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR19, oldOBR19, newOBR19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR19(OBR19CONTENT newOBR19) {
		if (newOBR19 != oBR19) {
			NotificationChain msgs = null;
			if (oBR19 != null)
				msgs = ((InternalEObject)oBR19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR19, null, msgs);
			if (newOBR19 != null)
				msgs = ((InternalEObject)newOBR19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR19, null, msgs);
			msgs = basicSetOBR19(newOBR19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR19, newOBR19, newOBR19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR20CONTENT getOBR20() {
		return oBR20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR20(OBR20CONTENT newOBR20, NotificationChain msgs) {
		OBR20CONTENT oldOBR20 = oBR20;
		oBR20 = newOBR20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR20, oldOBR20, newOBR20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR20(OBR20CONTENT newOBR20) {
		if (newOBR20 != oBR20) {
			NotificationChain msgs = null;
			if (oBR20 != null)
				msgs = ((InternalEObject)oBR20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR20, null, msgs);
			if (newOBR20 != null)
				msgs = ((InternalEObject)newOBR20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR20, null, msgs);
			msgs = basicSetOBR20(newOBR20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR20, newOBR20, newOBR20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR21CONTENT getOBR21() {
		return oBR21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR21(OBR21CONTENT newOBR21, NotificationChain msgs) {
		OBR21CONTENT oldOBR21 = oBR21;
		oBR21 = newOBR21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR21, oldOBR21, newOBR21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR21(OBR21CONTENT newOBR21) {
		if (newOBR21 != oBR21) {
			NotificationChain msgs = null;
			if (oBR21 != null)
				msgs = ((InternalEObject)oBR21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR21, null, msgs);
			if (newOBR21 != null)
				msgs = ((InternalEObject)newOBR21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR21, null, msgs);
			msgs = basicSetOBR21(newOBR21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR21, newOBR21, newOBR21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR22CONTENT getOBR22() {
		return oBR22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR22(OBR22CONTENT newOBR22, NotificationChain msgs) {
		OBR22CONTENT oldOBR22 = oBR22;
		oBR22 = newOBR22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR22, oldOBR22, newOBR22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR22(OBR22CONTENT newOBR22) {
		if (newOBR22 != oBR22) {
			NotificationChain msgs = null;
			if (oBR22 != null)
				msgs = ((InternalEObject)oBR22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR22, null, msgs);
			if (newOBR22 != null)
				msgs = ((InternalEObject)newOBR22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR22, null, msgs);
			msgs = basicSetOBR22(newOBR22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR22, newOBR22, newOBR22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR23CONTENT getOBR23() {
		return oBR23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR23(OBR23CONTENT newOBR23, NotificationChain msgs) {
		OBR23CONTENT oldOBR23 = oBR23;
		oBR23 = newOBR23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR23, oldOBR23, newOBR23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR23(OBR23CONTENT newOBR23) {
		if (newOBR23 != oBR23) {
			NotificationChain msgs = null;
			if (oBR23 != null)
				msgs = ((InternalEObject)oBR23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR23, null, msgs);
			if (newOBR23 != null)
				msgs = ((InternalEObject)newOBR23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR23, null, msgs);
			msgs = basicSetOBR23(newOBR23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR23, newOBR23, newOBR23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR24CONTENT getOBR24() {
		return oBR24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR24(OBR24CONTENT newOBR24, NotificationChain msgs) {
		OBR24CONTENT oldOBR24 = oBR24;
		oBR24 = newOBR24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR24, oldOBR24, newOBR24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR24(OBR24CONTENT newOBR24) {
		if (newOBR24 != oBR24) {
			NotificationChain msgs = null;
			if (oBR24 != null)
				msgs = ((InternalEObject)oBR24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR24, null, msgs);
			if (newOBR24 != null)
				msgs = ((InternalEObject)newOBR24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR24, null, msgs);
			msgs = basicSetOBR24(newOBR24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR24, newOBR24, newOBR24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR25CONTENT getOBR25() {
		return oBR25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR25(OBR25CONTENT newOBR25, NotificationChain msgs) {
		OBR25CONTENT oldOBR25 = oBR25;
		oBR25 = newOBR25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR25, oldOBR25, newOBR25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR25(OBR25CONTENT newOBR25) {
		if (newOBR25 != oBR25) {
			NotificationChain msgs = null;
			if (oBR25 != null)
				msgs = ((InternalEObject)oBR25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR25, null, msgs);
			if (newOBR25 != null)
				msgs = ((InternalEObject)newOBR25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR25, null, msgs);
			msgs = basicSetOBR25(newOBR25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR25, newOBR25, newOBR25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR26CONTENT getOBR26() {
		return oBR26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR26(OBR26CONTENT newOBR26, NotificationChain msgs) {
		OBR26CONTENT oldOBR26 = oBR26;
		oBR26 = newOBR26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR26, oldOBR26, newOBR26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR26(OBR26CONTENT newOBR26) {
		if (newOBR26 != oBR26) {
			NotificationChain msgs = null;
			if (oBR26 != null)
				msgs = ((InternalEObject)oBR26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR26, null, msgs);
			if (newOBR26 != null)
				msgs = ((InternalEObject)newOBR26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR26, null, msgs);
			msgs = basicSetOBR26(newOBR26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR26, newOBR26, newOBR26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR27CONTENT> getOBR27() {
		if (oBR27 == null) {
			oBR27 = new EObjectContainmentEList<OBR27CONTENT>(OBR27CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR27);
		}
		return oBR27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR28CONTENT> getOBR28() {
		if (oBR28 == null) {
			oBR28 = new EObjectContainmentEList<OBR28CONTENT>(OBR28CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR28);
		}
		return oBR28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR29CONTENT getOBR29() {
		return oBR29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR29(OBR29CONTENT newOBR29, NotificationChain msgs) {
		OBR29CONTENT oldOBR29 = oBR29;
		oBR29 = newOBR29;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR29, oldOBR29, newOBR29);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR29(OBR29CONTENT newOBR29) {
		if (newOBR29 != oBR29) {
			NotificationChain msgs = null;
			if (oBR29 != null)
				msgs = ((InternalEObject)oBR29).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR29, null, msgs);
			if (newOBR29 != null)
				msgs = ((InternalEObject)newOBR29).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR29, null, msgs);
			msgs = basicSetOBR29(newOBR29, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR29, newOBR29, newOBR29));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR30CONTENT getOBR30() {
		return oBR30;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR30(OBR30CONTENT newOBR30, NotificationChain msgs) {
		OBR30CONTENT oldOBR30 = oBR30;
		oBR30 = newOBR30;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR30, oldOBR30, newOBR30);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR30(OBR30CONTENT newOBR30) {
		if (newOBR30 != oBR30) {
			NotificationChain msgs = null;
			if (oBR30 != null)
				msgs = ((InternalEObject)oBR30).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR30, null, msgs);
			if (newOBR30 != null)
				msgs = ((InternalEObject)newOBR30).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR30, null, msgs);
			msgs = basicSetOBR30(newOBR30, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR30, newOBR30, newOBR30));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR31CONTENT> getOBR31() {
		if (oBR31 == null) {
			oBR31 = new EObjectContainmentEList<OBR31CONTENT>(OBR31CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR31);
		}
		return oBR31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR32CONTENT getOBR32() {
		return oBR32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR32(OBR32CONTENT newOBR32, NotificationChain msgs) {
		OBR32CONTENT oldOBR32 = oBR32;
		oBR32 = newOBR32;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR32, oldOBR32, newOBR32);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR32(OBR32CONTENT newOBR32) {
		if (newOBR32 != oBR32) {
			NotificationChain msgs = null;
			if (oBR32 != null)
				msgs = ((InternalEObject)oBR32).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR32, null, msgs);
			if (newOBR32 != null)
				msgs = ((InternalEObject)newOBR32).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR32, null, msgs);
			msgs = basicSetOBR32(newOBR32, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR32, newOBR32, newOBR32));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR33CONTENT> getOBR33() {
		if (oBR33 == null) {
			oBR33 = new EObjectContainmentEList<OBR33CONTENT>(OBR33CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR33);
		}
		return oBR33;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR34CONTENT> getOBR34() {
		if (oBR34 == null) {
			oBR34 = new EObjectContainmentEList<OBR34CONTENT>(OBR34CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR34);
		}
		return oBR34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR35CONTENT> getOBR35() {
		if (oBR35 == null) {
			oBR35 = new EObjectContainmentEList<OBR35CONTENT>(OBR35CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR35);
		}
		return oBR35;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR36CONTENT getOBR36() {
		return oBR36;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR36(OBR36CONTENT newOBR36, NotificationChain msgs) {
		OBR36CONTENT oldOBR36 = oBR36;
		oBR36 = newOBR36;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR36, oldOBR36, newOBR36);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR36(OBR36CONTENT newOBR36) {
		if (newOBR36 != oBR36) {
			NotificationChain msgs = null;
			if (oBR36 != null)
				msgs = ((InternalEObject)oBR36).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR36, null, msgs);
			if (newOBR36 != null)
				msgs = ((InternalEObject)newOBR36).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR36, null, msgs);
			msgs = basicSetOBR36(newOBR36, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR36, newOBR36, newOBR36));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR37CONTENT getOBR37() {
		return oBR37;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR37(OBR37CONTENT newOBR37, NotificationChain msgs) {
		OBR37CONTENT oldOBR37 = oBR37;
		oBR37 = newOBR37;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR37, oldOBR37, newOBR37);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR37(OBR37CONTENT newOBR37) {
		if (newOBR37 != oBR37) {
			NotificationChain msgs = null;
			if (oBR37 != null)
				msgs = ((InternalEObject)oBR37).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR37, null, msgs);
			if (newOBR37 != null)
				msgs = ((InternalEObject)newOBR37).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR37, null, msgs);
			msgs = basicSetOBR37(newOBR37, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR37, newOBR37, newOBR37));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR38CONTENT> getOBR38() {
		if (oBR38 == null) {
			oBR38 = new EObjectContainmentEList<OBR38CONTENT>(OBR38CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR38);
		}
		return oBR38;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR39CONTENT> getOBR39() {
		if (oBR39 == null) {
			oBR39 = new EObjectContainmentEList<OBR39CONTENT>(OBR39CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR39);
		}
		return oBR39;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR40CONTENT getOBR40() {
		return oBR40;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR40(OBR40CONTENT newOBR40, NotificationChain msgs) {
		OBR40CONTENT oldOBR40 = oBR40;
		oBR40 = newOBR40;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR40, oldOBR40, newOBR40);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR40(OBR40CONTENT newOBR40) {
		if (newOBR40 != oBR40) {
			NotificationChain msgs = null;
			if (oBR40 != null)
				msgs = ((InternalEObject)oBR40).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR40, null, msgs);
			if (newOBR40 != null)
				msgs = ((InternalEObject)newOBR40).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR40, null, msgs);
			msgs = basicSetOBR40(newOBR40, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR40, newOBR40, newOBR40));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR41CONTENT getOBR41() {
		return oBR41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR41(OBR41CONTENT newOBR41, NotificationChain msgs) {
		OBR41CONTENT oldOBR41 = oBR41;
		oBR41 = newOBR41;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR41, oldOBR41, newOBR41);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR41(OBR41CONTENT newOBR41) {
		if (newOBR41 != oBR41) {
			NotificationChain msgs = null;
			if (oBR41 != null)
				msgs = ((InternalEObject)oBR41).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR41, null, msgs);
			if (newOBR41 != null)
				msgs = ((InternalEObject)newOBR41).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR41, null, msgs);
			msgs = basicSetOBR41(newOBR41, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR41, newOBR41, newOBR41));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR42CONTENT getOBR42() {
		return oBR42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR42(OBR42CONTENT newOBR42, NotificationChain msgs) {
		OBR42CONTENT oldOBR42 = oBR42;
		oBR42 = newOBR42;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR42, oldOBR42, newOBR42);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR42(OBR42CONTENT newOBR42) {
		if (newOBR42 != oBR42) {
			NotificationChain msgs = null;
			if (oBR42 != null)
				msgs = ((InternalEObject)oBR42).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR42, null, msgs);
			if (newOBR42 != null)
				msgs = ((InternalEObject)newOBR42).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR42, null, msgs);
			msgs = basicSetOBR42(newOBR42, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR42, newOBR42, newOBR42));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR43CONTENT> getOBR43() {
		if (oBR43 == null) {
			oBR43 = new EObjectContainmentEList<OBR43CONTENT>(OBR43CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR43);
		}
		return oBR43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR44CONTENT getOBR44() {
		return oBR44;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR44(OBR44CONTENT newOBR44, NotificationChain msgs) {
		OBR44CONTENT oldOBR44 = oBR44;
		oBR44 = newOBR44;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR44, oldOBR44, newOBR44);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR44(OBR44CONTENT newOBR44) {
		if (newOBR44 != oBR44) {
			NotificationChain msgs = null;
			if (oBR44 != null)
				msgs = ((InternalEObject)oBR44).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR44, null, msgs);
			if (newOBR44 != null)
				msgs = ((InternalEObject)newOBR44).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR44, null, msgs);
			msgs = basicSetOBR44(newOBR44, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR44, newOBR44, newOBR44));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR45CONTENT> getOBR45() {
		if (oBR45 == null) {
			oBR45 = new EObjectContainmentEList<OBR45CONTENT>(OBR45CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR45);
		}
		return oBR45;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR46CONTENT> getOBR46() {
		if (oBR46 == null) {
			oBR46 = new EObjectContainmentEList<OBR46CONTENT>(OBR46CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR46);
		}
		return oBR46;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBR47CONTENT> getOBR47() {
		if (oBR47 == null) {
			oBR47 = new EObjectContainmentEList<OBR47CONTENT>(OBR47CONTENT.class, this, V2xmlPackage.OBRCONTENT__OBR47);
		}
		return oBR47;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR48CONTENT getOBR48() {
		return oBR48;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR48(OBR48CONTENT newOBR48, NotificationChain msgs) {
		OBR48CONTENT oldOBR48 = oBR48;
		oBR48 = newOBR48;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR48, oldOBR48, newOBR48);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR48(OBR48CONTENT newOBR48) {
		if (newOBR48 != oBR48) {
			NotificationChain msgs = null;
			if (oBR48 != null)
				msgs = ((InternalEObject)oBR48).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR48, null, msgs);
			if (newOBR48 != null)
				msgs = ((InternalEObject)newOBR48).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR48, null, msgs);
			msgs = basicSetOBR48(newOBR48, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR48, newOBR48, newOBR48));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBR49CONTENT getOBR49() {
		return oBR49;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBR49(OBR49CONTENT newOBR49, NotificationChain msgs) {
		OBR49CONTENT oldOBR49 = oBR49;
		oBR49 = newOBR49;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR49, oldOBR49, newOBR49);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBR49(OBR49CONTENT newOBR49) {
		if (newOBR49 != oBR49) {
			NotificationChain msgs = null;
			if (oBR49 != null)
				msgs = ((InternalEObject)oBR49).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR49, null, msgs);
			if (newOBR49 != null)
				msgs = ((InternalEObject)newOBR49).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBRCONTENT__OBR49, null, msgs);
			msgs = basicSetOBR49(newOBR49, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBRCONTENT__OBR49, newOBR49, newOBR49));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.OBRCONTENT__ANY);
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
			case V2xmlPackage.OBRCONTENT__OBR1:
				return basicSetOBR1(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR2:
				return basicSetOBR2(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR3:
				return basicSetOBR3(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR4:
				return basicSetOBR4(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR5:
				return basicSetOBR5(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR6:
				return basicSetOBR6(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR7:
				return basicSetOBR7(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR8:
				return basicSetOBR8(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR9:
				return basicSetOBR9(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR10:
				return ((InternalEList<?>)getOBR10()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR11:
				return basicSetOBR11(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR12:
				return basicSetOBR12(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR13:
				return basicSetOBR13(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR14:
				return basicSetOBR14(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR15:
				return basicSetOBR15(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR16:
				return ((InternalEList<?>)getOBR16()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR17:
				return ((InternalEList<?>)getOBR17()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR18:
				return basicSetOBR18(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR19:
				return basicSetOBR19(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR20:
				return basicSetOBR20(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR21:
				return basicSetOBR21(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR22:
				return basicSetOBR22(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR23:
				return basicSetOBR23(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR24:
				return basicSetOBR24(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR25:
				return basicSetOBR25(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR26:
				return basicSetOBR26(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR27:
				return ((InternalEList<?>)getOBR27()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR28:
				return ((InternalEList<?>)getOBR28()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR29:
				return basicSetOBR29(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR30:
				return basicSetOBR30(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR31:
				return ((InternalEList<?>)getOBR31()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR32:
				return basicSetOBR32(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR33:
				return ((InternalEList<?>)getOBR33()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR34:
				return ((InternalEList<?>)getOBR34()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR35:
				return ((InternalEList<?>)getOBR35()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR36:
				return basicSetOBR36(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR37:
				return basicSetOBR37(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR38:
				return ((InternalEList<?>)getOBR38()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR39:
				return ((InternalEList<?>)getOBR39()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR40:
				return basicSetOBR40(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR41:
				return basicSetOBR41(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR42:
				return basicSetOBR42(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR43:
				return ((InternalEList<?>)getOBR43()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR44:
				return basicSetOBR44(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR45:
				return ((InternalEList<?>)getOBR45()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR46:
				return ((InternalEList<?>)getOBR46()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR47:
				return ((InternalEList<?>)getOBR47()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBRCONTENT__OBR48:
				return basicSetOBR48(null, msgs);
			case V2xmlPackage.OBRCONTENT__OBR49:
				return basicSetOBR49(null, msgs);
			case V2xmlPackage.OBRCONTENT__ANY:
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
			case V2xmlPackage.OBRCONTENT__OBR1:
				return getOBR1();
			case V2xmlPackage.OBRCONTENT__OBR2:
				return getOBR2();
			case V2xmlPackage.OBRCONTENT__OBR3:
				return getOBR3();
			case V2xmlPackage.OBRCONTENT__OBR4:
				return getOBR4();
			case V2xmlPackage.OBRCONTENT__OBR5:
				return getOBR5();
			case V2xmlPackage.OBRCONTENT__OBR6:
				return getOBR6();
			case V2xmlPackage.OBRCONTENT__OBR7:
				return getOBR7();
			case V2xmlPackage.OBRCONTENT__OBR8:
				return getOBR8();
			case V2xmlPackage.OBRCONTENT__OBR9:
				return getOBR9();
			case V2xmlPackage.OBRCONTENT__OBR10:
				return getOBR10();
			case V2xmlPackage.OBRCONTENT__OBR11:
				return getOBR11();
			case V2xmlPackage.OBRCONTENT__OBR12:
				return getOBR12();
			case V2xmlPackage.OBRCONTENT__OBR13:
				return getOBR13();
			case V2xmlPackage.OBRCONTENT__OBR14:
				return getOBR14();
			case V2xmlPackage.OBRCONTENT__OBR15:
				return getOBR15();
			case V2xmlPackage.OBRCONTENT__OBR16:
				return getOBR16();
			case V2xmlPackage.OBRCONTENT__OBR17:
				return getOBR17();
			case V2xmlPackage.OBRCONTENT__OBR18:
				return getOBR18();
			case V2xmlPackage.OBRCONTENT__OBR19:
				return getOBR19();
			case V2xmlPackage.OBRCONTENT__OBR20:
				return getOBR20();
			case V2xmlPackage.OBRCONTENT__OBR21:
				return getOBR21();
			case V2xmlPackage.OBRCONTENT__OBR22:
				return getOBR22();
			case V2xmlPackage.OBRCONTENT__OBR23:
				return getOBR23();
			case V2xmlPackage.OBRCONTENT__OBR24:
				return getOBR24();
			case V2xmlPackage.OBRCONTENT__OBR25:
				return getOBR25();
			case V2xmlPackage.OBRCONTENT__OBR26:
				return getOBR26();
			case V2xmlPackage.OBRCONTENT__OBR27:
				return getOBR27();
			case V2xmlPackage.OBRCONTENT__OBR28:
				return getOBR28();
			case V2xmlPackage.OBRCONTENT__OBR29:
				return getOBR29();
			case V2xmlPackage.OBRCONTENT__OBR30:
				return getOBR30();
			case V2xmlPackage.OBRCONTENT__OBR31:
				return getOBR31();
			case V2xmlPackage.OBRCONTENT__OBR32:
				return getOBR32();
			case V2xmlPackage.OBRCONTENT__OBR33:
				return getOBR33();
			case V2xmlPackage.OBRCONTENT__OBR34:
				return getOBR34();
			case V2xmlPackage.OBRCONTENT__OBR35:
				return getOBR35();
			case V2xmlPackage.OBRCONTENT__OBR36:
				return getOBR36();
			case V2xmlPackage.OBRCONTENT__OBR37:
				return getOBR37();
			case V2xmlPackage.OBRCONTENT__OBR38:
				return getOBR38();
			case V2xmlPackage.OBRCONTENT__OBR39:
				return getOBR39();
			case V2xmlPackage.OBRCONTENT__OBR40:
				return getOBR40();
			case V2xmlPackage.OBRCONTENT__OBR41:
				return getOBR41();
			case V2xmlPackage.OBRCONTENT__OBR42:
				return getOBR42();
			case V2xmlPackage.OBRCONTENT__OBR43:
				return getOBR43();
			case V2xmlPackage.OBRCONTENT__OBR44:
				return getOBR44();
			case V2xmlPackage.OBRCONTENT__OBR45:
				return getOBR45();
			case V2xmlPackage.OBRCONTENT__OBR46:
				return getOBR46();
			case V2xmlPackage.OBRCONTENT__OBR47:
				return getOBR47();
			case V2xmlPackage.OBRCONTENT__OBR48:
				return getOBR48();
			case V2xmlPackage.OBRCONTENT__OBR49:
				return getOBR49();
			case V2xmlPackage.OBRCONTENT__ANY:
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
			case V2xmlPackage.OBRCONTENT__OBR1:
				setOBR1((OBR1CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR2:
				setOBR2((OBR2CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR3:
				setOBR3((OBR3CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR4:
				setOBR4((OBR4CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR5:
				setOBR5((OBR5CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR6:
				setOBR6((OBR6CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR7:
				setOBR7((OBR7CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR8:
				setOBR8((OBR8CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR9:
				setOBR9((OBR9CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR10:
				getOBR10().clear();
				getOBR10().addAll((Collection<? extends OBR10CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR11:
				setOBR11((OBR11CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR12:
				setOBR12((OBR12CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR13:
				setOBR13((OBR13CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR14:
				setOBR14((OBR14CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR15:
				setOBR15((OBR15CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR16:
				getOBR16().clear();
				getOBR16().addAll((Collection<? extends OBR16CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR17:
				getOBR17().clear();
				getOBR17().addAll((Collection<? extends OBR17CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR18:
				setOBR18((OBR18CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR19:
				setOBR19((OBR19CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR20:
				setOBR20((OBR20CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR21:
				setOBR21((OBR21CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR22:
				setOBR22((OBR22CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR23:
				setOBR23((OBR23CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR24:
				setOBR24((OBR24CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR25:
				setOBR25((OBR25CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR26:
				setOBR26((OBR26CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR27:
				getOBR27().clear();
				getOBR27().addAll((Collection<? extends OBR27CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR28:
				getOBR28().clear();
				getOBR28().addAll((Collection<? extends OBR28CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR29:
				setOBR29((OBR29CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR30:
				setOBR30((OBR30CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR31:
				getOBR31().clear();
				getOBR31().addAll((Collection<? extends OBR31CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR32:
				setOBR32((OBR32CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR33:
				getOBR33().clear();
				getOBR33().addAll((Collection<? extends OBR33CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR34:
				getOBR34().clear();
				getOBR34().addAll((Collection<? extends OBR34CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR35:
				getOBR35().clear();
				getOBR35().addAll((Collection<? extends OBR35CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR36:
				setOBR36((OBR36CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR37:
				setOBR37((OBR37CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR38:
				getOBR38().clear();
				getOBR38().addAll((Collection<? extends OBR38CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR39:
				getOBR39().clear();
				getOBR39().addAll((Collection<? extends OBR39CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR40:
				setOBR40((OBR40CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR41:
				setOBR41((OBR41CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR42:
				setOBR42((OBR42CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR43:
				getOBR43().clear();
				getOBR43().addAll((Collection<? extends OBR43CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR44:
				setOBR44((OBR44CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR45:
				getOBR45().clear();
				getOBR45().addAll((Collection<? extends OBR45CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR46:
				getOBR46().clear();
				getOBR46().addAll((Collection<? extends OBR46CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR47:
				getOBR47().clear();
				getOBR47().addAll((Collection<? extends OBR47CONTENT>)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR48:
				setOBR48((OBR48CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__OBR49:
				setOBR49((OBR49CONTENT)newValue);
				return;
			case V2xmlPackage.OBRCONTENT__ANY:
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
			case V2xmlPackage.OBRCONTENT__OBR1:
				setOBR1((OBR1CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR2:
				setOBR2((OBR2CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR3:
				setOBR3((OBR3CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR4:
				setOBR4((OBR4CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR5:
				setOBR5((OBR5CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR6:
				setOBR6((OBR6CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR7:
				setOBR7((OBR7CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR8:
				setOBR8((OBR8CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR9:
				setOBR9((OBR9CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR10:
				getOBR10().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR11:
				setOBR11((OBR11CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR12:
				setOBR12((OBR12CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR13:
				setOBR13((OBR13CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR14:
				setOBR14((OBR14CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR15:
				setOBR15((OBR15CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR16:
				getOBR16().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR17:
				getOBR17().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR18:
				setOBR18((OBR18CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR19:
				setOBR19((OBR19CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR20:
				setOBR20((OBR20CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR21:
				setOBR21((OBR21CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR22:
				setOBR22((OBR22CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR23:
				setOBR23((OBR23CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR24:
				setOBR24((OBR24CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR25:
				setOBR25((OBR25CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR26:
				setOBR26((OBR26CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR27:
				getOBR27().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR28:
				getOBR28().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR29:
				setOBR29((OBR29CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR30:
				setOBR30((OBR30CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR31:
				getOBR31().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR32:
				setOBR32((OBR32CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR33:
				getOBR33().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR34:
				getOBR34().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR35:
				getOBR35().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR36:
				setOBR36((OBR36CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR37:
				setOBR37((OBR37CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR38:
				getOBR38().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR39:
				getOBR39().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR40:
				setOBR40((OBR40CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR41:
				setOBR41((OBR41CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR42:
				setOBR42((OBR42CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR43:
				getOBR43().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR44:
				setOBR44((OBR44CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR45:
				getOBR45().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR46:
				getOBR46().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR47:
				getOBR47().clear();
				return;
			case V2xmlPackage.OBRCONTENT__OBR48:
				setOBR48((OBR48CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__OBR49:
				setOBR49((OBR49CONTENT)null);
				return;
			case V2xmlPackage.OBRCONTENT__ANY:
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
			case V2xmlPackage.OBRCONTENT__OBR1:
				return oBR1 != null;
			case V2xmlPackage.OBRCONTENT__OBR2:
				return oBR2 != null;
			case V2xmlPackage.OBRCONTENT__OBR3:
				return oBR3 != null;
			case V2xmlPackage.OBRCONTENT__OBR4:
				return oBR4 != null;
			case V2xmlPackage.OBRCONTENT__OBR5:
				return oBR5 != null;
			case V2xmlPackage.OBRCONTENT__OBR6:
				return oBR6 != null;
			case V2xmlPackage.OBRCONTENT__OBR7:
				return oBR7 != null;
			case V2xmlPackage.OBRCONTENT__OBR8:
				return oBR8 != null;
			case V2xmlPackage.OBRCONTENT__OBR9:
				return oBR9 != null;
			case V2xmlPackage.OBRCONTENT__OBR10:
				return oBR10 != null && !oBR10.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR11:
				return oBR11 != null;
			case V2xmlPackage.OBRCONTENT__OBR12:
				return oBR12 != null;
			case V2xmlPackage.OBRCONTENT__OBR13:
				return oBR13 != null;
			case V2xmlPackage.OBRCONTENT__OBR14:
				return oBR14 != null;
			case V2xmlPackage.OBRCONTENT__OBR15:
				return oBR15 != null;
			case V2xmlPackage.OBRCONTENT__OBR16:
				return oBR16 != null && !oBR16.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR17:
				return oBR17 != null && !oBR17.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR18:
				return oBR18 != null;
			case V2xmlPackage.OBRCONTENT__OBR19:
				return oBR19 != null;
			case V2xmlPackage.OBRCONTENT__OBR20:
				return oBR20 != null;
			case V2xmlPackage.OBRCONTENT__OBR21:
				return oBR21 != null;
			case V2xmlPackage.OBRCONTENT__OBR22:
				return oBR22 != null;
			case V2xmlPackage.OBRCONTENT__OBR23:
				return oBR23 != null;
			case V2xmlPackage.OBRCONTENT__OBR24:
				return oBR24 != null;
			case V2xmlPackage.OBRCONTENT__OBR25:
				return oBR25 != null;
			case V2xmlPackage.OBRCONTENT__OBR26:
				return oBR26 != null;
			case V2xmlPackage.OBRCONTENT__OBR27:
				return oBR27 != null && !oBR27.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR28:
				return oBR28 != null && !oBR28.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR29:
				return oBR29 != null;
			case V2xmlPackage.OBRCONTENT__OBR30:
				return oBR30 != null;
			case V2xmlPackage.OBRCONTENT__OBR31:
				return oBR31 != null && !oBR31.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR32:
				return oBR32 != null;
			case V2xmlPackage.OBRCONTENT__OBR33:
				return oBR33 != null && !oBR33.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR34:
				return oBR34 != null && !oBR34.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR35:
				return oBR35 != null && !oBR35.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR36:
				return oBR36 != null;
			case V2xmlPackage.OBRCONTENT__OBR37:
				return oBR37 != null;
			case V2xmlPackage.OBRCONTENT__OBR38:
				return oBR38 != null && !oBR38.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR39:
				return oBR39 != null && !oBR39.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR40:
				return oBR40 != null;
			case V2xmlPackage.OBRCONTENT__OBR41:
				return oBR41 != null;
			case V2xmlPackage.OBRCONTENT__OBR42:
				return oBR42 != null;
			case V2xmlPackage.OBRCONTENT__OBR43:
				return oBR43 != null && !oBR43.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR44:
				return oBR44 != null;
			case V2xmlPackage.OBRCONTENT__OBR45:
				return oBR45 != null && !oBR45.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR46:
				return oBR46 != null && !oBR46.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR47:
				return oBR47 != null && !oBR47.isEmpty();
			case V2xmlPackage.OBRCONTENT__OBR48:
				return oBR48 != null;
			case V2xmlPackage.OBRCONTENT__OBR49:
				return oBR49 != null;
			case V2xmlPackage.OBRCONTENT__ANY:
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

} //OBRCONTENTImpl
