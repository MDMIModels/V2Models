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

import org.hl7.v2xml.RDF1CONTENT;
import org.hl7.v2xml.RDF2CONTENT;
import org.hl7.v2xml.RDFCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDFCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RDFCONTENTImpl#getRDF1 <em>RDF1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RDFCONTENTImpl#getRDF2 <em>RDF2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RDFCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDFCONTENTImpl extends EObjectImpl implements RDFCONTENT {
	/**
	 * The cached value of the '{@link #getRDF1() <em>RDF1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDF1()
	 * @generated
	 * @ordered
	 */
	protected RDF1CONTENT rDF1;

	/**
	 * The cached value of the '{@link #getRDF2() <em>RDF2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDF2()
	 * @generated
	 * @ordered
	 */
	protected EList<RDF2CONTENT> rDF2;

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
	protected RDFCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRDFCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDF1CONTENT getRDF1() {
		return rDF1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRDF1(RDF1CONTENT newRDF1, NotificationChain msgs) {
		RDF1CONTENT oldRDF1 = rDF1;
		rDF1 = newRDF1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RDFCONTENT__RDF1, oldRDF1, newRDF1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDF1(RDF1CONTENT newRDF1) {
		if (newRDF1 != rDF1) {
			NotificationChain msgs = null;
			if (rDF1 != null)
				msgs = ((InternalEObject)rDF1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RDFCONTENT__RDF1, null, msgs);
			if (newRDF1 != null)
				msgs = ((InternalEObject)newRDF1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RDFCONTENT__RDF1, null, msgs);
			msgs = basicSetRDF1(newRDF1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RDFCONTENT__RDF1, newRDF1, newRDF1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDF2CONTENT> getRDF2() {
		if (rDF2 == null) {
			rDF2 = new EObjectContainmentEList<RDF2CONTENT>(RDF2CONTENT.class, this, V2xmlPackage.RDFCONTENT__RDF2);
		}
		return rDF2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.RDFCONTENT__ANY);
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
			case V2xmlPackage.RDFCONTENT__RDF1:
				return basicSetRDF1(null, msgs);
			case V2xmlPackage.RDFCONTENT__RDF2:
				return ((InternalEList<?>)getRDF2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RDFCONTENT__ANY:
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
			case V2xmlPackage.RDFCONTENT__RDF1:
				return getRDF1();
			case V2xmlPackage.RDFCONTENT__RDF2:
				return getRDF2();
			case V2xmlPackage.RDFCONTENT__ANY:
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
			case V2xmlPackage.RDFCONTENT__RDF1:
				setRDF1((RDF1CONTENT)newValue);
				return;
			case V2xmlPackage.RDFCONTENT__RDF2:
				getRDF2().clear();
				getRDF2().addAll((Collection<? extends RDF2CONTENT>)newValue);
				return;
			case V2xmlPackage.RDFCONTENT__ANY:
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
			case V2xmlPackage.RDFCONTENT__RDF1:
				setRDF1((RDF1CONTENT)null);
				return;
			case V2xmlPackage.RDFCONTENT__RDF2:
				getRDF2().clear();
				return;
			case V2xmlPackage.RDFCONTENT__ANY:
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
			case V2xmlPackage.RDFCONTENT__RDF1:
				return rDF1 != null;
			case V2xmlPackage.RDFCONTENT__RDF2:
				return rDF2 != null && !rDF2.isEmpty();
			case V2xmlPackage.RDFCONTENT__ANY:
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

} //RDFCONTENTImpl
