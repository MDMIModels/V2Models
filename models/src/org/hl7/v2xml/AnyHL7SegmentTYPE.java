/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any HL7 Segment TYPE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getABS <em>ABS</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getACC <em>ACC</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getADD <em>ADD</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getAFF <em>AFF</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getAIG <em>AIG</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getAIL <em>AIL</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getAIP <em>AIP</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getAIS <em>AIS</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getAL1 <em>AL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getAPR <em>APR</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getARQ <em>ARQ</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getAUT <em>AUT</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getBHS <em>BHS</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getBLC <em>BLC</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getBLG <em>BLG</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getBPO <em>BPO</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getBPX <em>BPX</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getBTS <em>BTS</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getBTX <em>BTX</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getCDM <em>CDM</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getCER <em>CER</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getCM0 <em>CM0</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getCM1 <em>CM1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getCM2 <em>CM2</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getCNS <em>CNS</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getCON <em>CON</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getCSP <em>CSP</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getCSR <em>CSR</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getCSS <em>CSS</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getCTD <em>CTD</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getCTI <em>CTI</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getDB1 <em>DB1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getDG1 <em>DG1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getDRG <em>DRG</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getDSC <em>DSC</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getDSP <em>DSP</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getECD <em>ECD</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getECR <em>ECR</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getEDU <em>EDU</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getEQL <em>EQL</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getEQP <em>EQP</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getEQU <em>EQU</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getERQ <em>ERQ</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getERR <em>ERR</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getEVN <em>EVN</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getFAC <em>FAC</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getFHS <em>FHS</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getFT1 <em>FT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getFTS <em>FTS</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getGOL <em>GOL</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getGP1 <em>GP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getGP2 <em>GP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getGT1 <em>GT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getIAM <em>IAM</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getIIM <em>IIM</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getIN1 <em>IN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getIN2 <em>IN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getIN3 <em>IN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getINV <em>INV</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getIPC <em>IPC</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getISD <em>ISD</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getLAN <em>LAN</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getLCC <em>LCC</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getLCH <em>LCH</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getLDP <em>LDP</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getLOC <em>LOC</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getLRL <em>LRL</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getMFA <em>MFA</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getMFE <em>MFE</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getMFI <em>MFI</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getMRG <em>MRG</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getMSA <em>MSA</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getMSH <em>MSH</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getNCK <em>NCK</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getNDS <em>NDS</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getNK1 <em>NK1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getNPU <em>NPU</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getNSC <em>NSC</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getNST <em>NST</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getNTE <em>NTE</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getOBR <em>OBR</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getOBX <em>OBX</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getODS <em>ODS</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getODT <em>ODT</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getOM1 <em>OM1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getOM2 <em>OM2</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getOM3 <em>OM3</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getOM4 <em>OM4</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getOM5 <em>OM5</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getOM6 <em>OM6</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getOM7 <em>OM7</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getORC <em>ORC</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getORG <em>ORG</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getOVR <em>OVR</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPCR <em>PCR</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPD1 <em>PD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPDA <em>PDA</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPDC <em>PDC</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPEO <em>PEO</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPES <em>PES</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPID <em>PID</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPR1 <em>PR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPRA <em>PRA</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPRB <em>PRB</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPRC <em>PRC</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPRD <em>PRD</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPSH <em>PSH</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPTH <em>PTH</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPV1 <em>PV1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getPV2 <em>PV2</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getQAK <em>QAK</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getQID <em>QID</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getQPD <em>QPD</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getQRD <em>QRD</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getQRF <em>QRF</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getQRI <em>QRI</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRCP <em>RCP</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRDF <em>RDF</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRDT <em>RDT</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRF1 <em>RF1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRGS <em>RGS</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRMI <em>RMI</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getROL <em>ROL</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRQ1 <em>RQ1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRQD <em>RQD</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRXA <em>RXA</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRXC <em>RXC</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRXD <em>RXD</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRXE <em>RXE</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRXG <em>RXG</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRXO <em>RXO</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getRXR <em>RXR</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getSAC <em>SAC</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getSCH <em>SCH</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getSFT <em>SFT</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getSID <em>SID</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getSPM <em>SPM</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getSPR <em>SPR</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getSTF <em>STF</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getTCC <em>TCC</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getTCD <em>TCD</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getTQ1 <em>TQ1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getTQ2 <em>TQ2</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getTXA <em>TXA</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getUB1 <em>UB1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getUB2 <em>UB2</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getURD <em>URD</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getURS <em>URS</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getVAR <em>VAR</em>}</li>
 *   <li>{@link org.hl7.v2xml.AnyHL7SegmentTYPE#getVTQ <em>VTQ</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE()
 * @model extendedMetaData="name='anyHL7Segment.TYPE' kind='elementOnly'"
 * @generated
 */
public interface AnyHL7SegmentTYPE extends EObject {
	/**
	 * Returns the value of the '<em><b>ABS</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ABSCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ABS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ABS</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_ABS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ABS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ABSCONTENT> getABS();

	/**
	 * Returns the value of the '<em><b>ACC</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ACCCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ACC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ACC</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_ACC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ACC' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ACCCONTENT> getACC();

	/**
	 * Returns the value of the '<em><b>ADD</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ADDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ADD</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADD</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_ADD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ADD' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ADDCONTENT> getADD();

	/**
	 * Returns the value of the '<em><b>AFF</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.AFFCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AFF</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AFF</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_AFF()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AFF' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AFFCONTENT> getAFF();

	/**
	 * Returns the value of the '<em><b>AIG</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.AIGCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIG</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIG</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_AIG()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIG' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AIGCONTENT> getAIG();

	/**
	 * Returns the value of the '<em><b>AIL</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.AILCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIL</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIL</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_AIL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AILCONTENT> getAIL();

	/**
	 * Returns the value of the '<em><b>AIP</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.AIPCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIP</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIP</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_AIP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIP' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AIPCONTENT> getAIP();

	/**
	 * Returns the value of the '<em><b>AIS</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.AISCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIS</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_AIS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AISCONTENT> getAIS();

	/**
	 * Returns the value of the '<em><b>AL1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.AL1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AL1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AL1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_AL1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AL1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AL1CONTENT> getAL1();

	/**
	 * Returns the value of the '<em><b>APR</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.APRCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APR</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APR</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_APR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='APR' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<APRCONTENT> getAPR();

	/**
	 * Returns the value of the '<em><b>ARQ</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ARQCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ARQ</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ARQ</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_ARQ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ARQ' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ARQCONTENT> getARQ();

	/**
	 * Returns the value of the '<em><b>AUT</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.AUTCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AUT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AUT</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_AUT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AUT' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AUTCONTENT> getAUT();

	/**
	 * Returns the value of the '<em><b>BHS</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.BHSCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BHS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BHS</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_BHS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BHS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BHSCONTENT> getBHS();

	/**
	 * Returns the value of the '<em><b>BLC</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.BLCCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BLC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BLC</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_BLC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BLC' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BLCCONTENT> getBLC();

	/**
	 * Returns the value of the '<em><b>BLG</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.BLGCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BLG</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BLG</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_BLG()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BLG' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BLGCONTENT> getBLG();

	/**
	 * Returns the value of the '<em><b>BPO</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.BPOCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_BPO()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BPO' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BPOCONTENT> getBPO();

	/**
	 * Returns the value of the '<em><b>BPX</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.BPXCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPX</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPX</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_BPX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BPX' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BPXCONTENT> getBPX();

	/**
	 * Returns the value of the '<em><b>BTS</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.BTSCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BTS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BTS</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_BTS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BTS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BTSCONTENT> getBTS();

	/**
	 * Returns the value of the '<em><b>BTX</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.BTXCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BTX</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BTX</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_BTX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BTX' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BTXCONTENT> getBTX();

	/**
	 * Returns the value of the '<em><b>CDM</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CDMCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDM</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_CDM()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CDM' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDMCONTENT> getCDM();

	/**
	 * Returns the value of the '<em><b>CER</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CERCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CER</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CER</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_CER()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CER' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CERCONTENT> getCER();

	/**
	 * Returns the value of the '<em><b>CM0</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CM0CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM0</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM0</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_CM0()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CM0' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CM0CONTENT> getCM0();

	/**
	 * Returns the value of the '<em><b>CM1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CM1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_CM1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CM1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CM1CONTENT> getCM1();

	/**
	 * Returns the value of the '<em><b>CM2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CM2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_CM2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CM2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CM2CONTENT> getCM2();

	/**
	 * Returns the value of the '<em><b>CNS</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CNSCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CNS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CNS</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_CNS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CNS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CNSCONTENT> getCNS();

	/**
	 * Returns the value of the '<em><b>CON</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CONCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CON</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CON</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_CON()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CON' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CONCONTENT> getCON();

	/**
	 * Returns the value of the '<em><b>CSP</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CSPCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSP</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSP</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_CSP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CSP' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CSPCONTENT> getCSP();

	/**
	 * Returns the value of the '<em><b>CSR</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CSRCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSR</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSR</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_CSR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CSR' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CSRCONTENT> getCSR();

	/**
	 * Returns the value of the '<em><b>CSS</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CSSCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSS</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_CSS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CSS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CSSCONTENT> getCSS();

	/**
	 * Returns the value of the '<em><b>CTD</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CTDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTD</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTD</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_CTD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CTD' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CTDCONTENT> getCTD();

	/**
	 * Returns the value of the '<em><b>CTI</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CTICONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTI</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_CTI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CTI' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CTICONTENT> getCTI();

	/**
	 * Returns the value of the '<em><b>DB1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.DB1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DB1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DB1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_DB1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DB1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DB1CONTENT> getDB1();

	/**
	 * Returns the value of the '<em><b>DG1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.DG1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DG1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DG1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_DG1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DG1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DG1CONTENT> getDG1();

	/**
	 * Returns the value of the '<em><b>DRG</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.DRGCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DRG</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DRG</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_DRG()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DRG' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DRGCONTENT> getDRG();

	/**
	 * Returns the value of the '<em><b>DSC</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.DSCCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSC</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_DSC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DSC' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DSCCONTENT> getDSC();

	/**
	 * Returns the value of the '<em><b>DSP</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.DSPCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSP</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSP</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_DSP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DSP' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DSPCONTENT> getDSP();

	/**
	 * Returns the value of the '<em><b>ECD</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ECDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECD</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECD</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_ECD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ECD' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ECDCONTENT> getECD();

	/**
	 * Returns the value of the '<em><b>ECR</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ECRCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECR</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECR</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_ECR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ECR' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ECRCONTENT> getECR();

	/**
	 * Returns the value of the '<em><b>EDU</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.EDUCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EDU</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDU</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_EDU()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EDU' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EDUCONTENT> getEDU();

	/**
	 * Returns the value of the '<em><b>EQL</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.EQLCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EQL</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EQL</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_EQL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EQL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EQLCONTENT> getEQL();

	/**
	 * Returns the value of the '<em><b>EQP</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.EQPCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EQP</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EQP</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_EQP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EQP' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EQPCONTENT> getEQP();

	/**
	 * Returns the value of the '<em><b>EQU</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.EQUCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EQU</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EQU</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_EQU()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EQU' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EQUCONTENT> getEQU();

	/**
	 * Returns the value of the '<em><b>ERQ</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ERQCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERQ</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERQ</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_ERQ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ERQ' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ERQCONTENT> getERQ();

	/**
	 * Returns the value of the '<em><b>ERR</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ERRCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERR</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERR</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_ERR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ERR' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ERRCONTENT> getERR();

	/**
	 * Returns the value of the '<em><b>EVN</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.EVNCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EVN</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EVN</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_EVN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EVN' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EVNCONTENT> getEVN();

	/**
	 * Returns the value of the '<em><b>FAC</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.FACCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FAC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FAC</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_FAC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FAC' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FACCONTENT> getFAC();

	/**
	 * Returns the value of the '<em><b>FHS</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.FHSCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FHS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FHS</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_FHS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FHS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FHSCONTENT> getFHS();

	/**
	 * Returns the value of the '<em><b>FT1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.FT1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FT1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FT1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_FT1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FT1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FT1CONTENT> getFT1();

	/**
	 * Returns the value of the '<em><b>FTS</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.FTSCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FTS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FTS</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_FTS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FTS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FTSCONTENT> getFTS();

	/**
	 * Returns the value of the '<em><b>GOL</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.GOLCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GOL</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GOL</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_GOL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GOL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GOLCONTENT> getGOL();

	/**
	 * Returns the value of the '<em><b>GP1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.GP1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GP1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GP1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_GP1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GP1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GP1CONTENT> getGP1();

	/**
	 * Returns the value of the '<em><b>GP2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.GP2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GP2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GP2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_GP2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GP2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GP2CONTENT> getGP2();

	/**
	 * Returns the value of the '<em><b>GT1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.GT1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GT1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GT1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_GT1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GT1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GT1CONTENT> getGT1();

	/**
	 * Returns the value of the '<em><b>IAM</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.IAMCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IAM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IAM</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_IAM()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IAM' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IAMCONTENT> getIAM();

	/**
	 * Returns the value of the '<em><b>IIM</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.IIMCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IIM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IIM</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_IIM()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IIM' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IIMCONTENT> getIIM();

	/**
	 * Returns the value of the '<em><b>IN1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.IN1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IN1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IN1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_IN1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IN1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IN1CONTENT> getIN1();

	/**
	 * Returns the value of the '<em><b>IN2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.IN2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IN2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IN2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_IN2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IN2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IN2CONTENT> getIN2();

	/**
	 * Returns the value of the '<em><b>IN3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.IN3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IN3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IN3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_IN3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IN3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IN3CONTENT> getIN3();

	/**
	 * Returns the value of the '<em><b>INV</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.INVCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_INV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<INVCONTENT> getINV();

	/**
	 * Returns the value of the '<em><b>IPC</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.IPCCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IPC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IPC</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_IPC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IPC' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IPCCONTENT> getIPC();

	/**
	 * Returns the value of the '<em><b>ISD</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ISDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISD</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISD</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_ISD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ISD' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ISDCONTENT> getISD();

	/**
	 * Returns the value of the '<em><b>LAN</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LANCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LAN</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LAN</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_LAN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LAN' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LANCONTENT> getLAN();

	/**
	 * Returns the value of the '<em><b>LCC</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LCCCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LCC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LCC</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_LCC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LCC' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LCCCONTENT> getLCC();

	/**
	 * Returns the value of the '<em><b>LCH</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LCHCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LCH</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LCH</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_LCH()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LCH' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LCHCONTENT> getLCH();

	/**
	 * Returns the value of the '<em><b>LDP</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LDPCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDP</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDP</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_LDP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LDP' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LDPCONTENT> getLDP();

	/**
	 * Returns the value of the '<em><b>LOC</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LOCCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LOC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOC</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_LOC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LOC' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LOCCONTENT> getLOC();

	/**
	 * Returns the value of the '<em><b>LRL</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LRLCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LRL</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LRL</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_LRL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LRL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LRLCONTENT> getLRL();

	/**
	 * Returns the value of the '<em><b>MFA</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.MFACONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFA</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_MFA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MFA' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MFACONTENT> getMFA();

	/**
	 * Returns the value of the '<em><b>MFE</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.MFECONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFE</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_MFE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MFE' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MFECONTENT> getMFE();

	/**
	 * Returns the value of the '<em><b>MFI</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.MFICONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFI</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_MFI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MFI' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MFICONTENT> getMFI();

	/**
	 * Returns the value of the '<em><b>MRG</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.MRGCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRG</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRG</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_MRG()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MRG' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MRGCONTENT> getMRG();

	/**
	 * Returns the value of the '<em><b>MSA</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.MSACONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSA</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_MSA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MSA' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MSACONTENT> getMSA();

	/**
	 * Returns the value of the '<em><b>MSH</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.MSHCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSH</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSH</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_MSH()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MSH' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MSHCONTENT> getMSH();

	/**
	 * Returns the value of the '<em><b>NCK</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.NCKCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NCK</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NCK</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_NCK()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NCK' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NCKCONTENT> getNCK();

	/**
	 * Returns the value of the '<em><b>NDS</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.NDSCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NDS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NDS</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_NDS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NDS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NDSCONTENT> getNDS();

	/**
	 * Returns the value of the '<em><b>NK1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.NK1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NK1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NK1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_NK1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NK1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NK1CONTENT> getNK1();

	/**
	 * Returns the value of the '<em><b>NPU</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.NPUCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NPU</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NPU</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_NPU()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NPU' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NPUCONTENT> getNPU();

	/**
	 * Returns the value of the '<em><b>NSC</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.NSCCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NSC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NSC</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_NSC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NSC' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NSCCONTENT> getNSC();

	/**
	 * Returns the value of the '<em><b>NST</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.NSTCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NST</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NST</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_NST()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NST' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NSTCONTENT> getNST();

	/**
	 * Returns the value of the '<em><b>NTE</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.NTECONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NTE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NTE</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_NTE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NTE' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NTECONTENT> getNTE();

	/**
	 * Returns the value of the '<em><b>OBR</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OBRCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OBR</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OBR</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_OBR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OBR' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OBRCONTENT> getOBR();

	/**
	 * Returns the value of the '<em><b>OBX</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OBXCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OBX</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OBX</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_OBX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OBX' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OBXCONTENT> getOBX();

	/**
	 * Returns the value of the '<em><b>ODS</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ODSCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ODS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ODS</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_ODS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ODS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ODSCONTENT> getODS();

	/**
	 * Returns the value of the '<em><b>ODT</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ODTCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ODT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ODT</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_ODT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ODT' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ODTCONTENT> getODT();

	/**
	 * Returns the value of the '<em><b>OM1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_OM1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM1CONTENT> getOM1();

	/**
	 * Returns the value of the '<em><b>OM2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_OM2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM2CONTENT> getOM2();

	/**
	 * Returns the value of the '<em><b>OM3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_OM3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM3CONTENT> getOM3();

	/**
	 * Returns the value of the '<em><b>OM4</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM4CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM4</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_OM4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM4CONTENT> getOM4();

	/**
	 * Returns the value of the '<em><b>OM5</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM5CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM5</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_OM5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM5CONTENT> getOM5();

	/**
	 * Returns the value of the '<em><b>OM6</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM6CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM6</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_OM6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM6CONTENT> getOM6();

	/**
	 * Returns the value of the '<em><b>OM7</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM7CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM7</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM7</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_OM7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM7' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM7CONTENT> getOM7();

	/**
	 * Returns the value of the '<em><b>ORC</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ORCCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ORC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ORC</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_ORC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ORC' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ORCCONTENT> getORC();

	/**
	 * Returns the value of the '<em><b>ORG</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ORGCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ORG</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ORG</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_ORG()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ORG' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ORGCONTENT> getORG();

	/**
	 * Returns the value of the '<em><b>OVR</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OVRCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OVR</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OVR</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_OVR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OVR' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OVRCONTENT> getOVR();

	/**
	 * Returns the value of the '<em><b>PCR</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PCRCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PCR</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PCR</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PCR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PCR' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PCRCONTENT> getPCR();

	/**
	 * Returns the value of the '<em><b>PD1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PD1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PD1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PD1CONTENT> getPD1();

	/**
	 * Returns the value of the '<em><b>PDA</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PDACONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDA</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PDA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDA' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PDACONTENT> getPDA();

	/**
	 * Returns the value of the '<em><b>PDC</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PDCCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PDC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDC' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PDCCONTENT> getPDC();

	/**
	 * Returns the value of the '<em><b>PEO</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEOCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PEO()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEOCONTENT> getPEO();

	/**
	 * Returns the value of the '<em><b>PES</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PESCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PES</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PES</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PES' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PESCONTENT> getPES();

	/**
	 * Returns the value of the '<em><b>PID</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PIDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PID</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PID</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PIDCONTENT> getPID();

	/**
	 * Returns the value of the '<em><b>PR1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PR1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PR1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PR1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PR1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PR1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PR1CONTENT> getPR1();

	/**
	 * Returns the value of the '<em><b>PRA</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRACONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRA</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PRA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRA' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRACONTENT> getPRA();

	/**
	 * Returns the value of the '<em><b>PRB</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRBCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRB</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRB</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PRB()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRB' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRBCONTENT> getPRB();

	/**
	 * Returns the value of the '<em><b>PRC</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRCCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PRC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRCCONTENT> getPRC();

	/**
	 * Returns the value of the '<em><b>PRD</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRD</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRD</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PRD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRD' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRDCONTENT> getPRD();

	/**
	 * Returns the value of the '<em><b>PSH</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PSHCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PSH</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PSH</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PSH()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PSH' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PSHCONTENT> getPSH();

	/**
	 * Returns the value of the '<em><b>PTH</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PTHCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PTH</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PTH</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PTH()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PTH' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PTHCONTENT> getPTH();

	/**
	 * Returns the value of the '<em><b>PV1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PV1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PV1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PV1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PV1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PV1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PV1CONTENT> getPV1();

	/**
	 * Returns the value of the '<em><b>PV2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PV2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PV2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PV2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_PV2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PV2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PV2CONTENT> getPV2();

	/**
	 * Returns the value of the '<em><b>QAK</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.QAKCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QAK</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QAK</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_QAK()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QAK' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QAKCONTENT> getQAK();

	/**
	 * Returns the value of the '<em><b>QID</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.QIDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QID</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QID</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_QID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QIDCONTENT> getQID();

	/**
	 * Returns the value of the '<em><b>QPD</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.QPDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QPD</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QPD</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_QPD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QPD' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QPDCONTENT> getQPD();

	/**
	 * Returns the value of the '<em><b>QRD</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.QRDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRD</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRD</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_QRD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRD' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QRDCONTENT> getQRD();

	/**
	 * Returns the value of the '<em><b>QRF</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.QRFCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRF</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRF</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_QRF()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRF' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QRFCONTENT> getQRF();

	/**
	 * Returns the value of the '<em><b>QRI</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.QRICONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRI</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_QRI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRI' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QRICONTENT> getQRI();

	/**
	 * Returns the value of the '<em><b>RCP</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RCPCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RCP</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RCP</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RCP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RCP' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RCPCONTENT> getRCP();

	/**
	 * Returns the value of the '<em><b>RDF</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RDFCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDF</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDF</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RDF()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RDF' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RDFCONTENT> getRDF();

	/**
	 * Returns the value of the '<em><b>RDT</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RDTCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDT</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RDT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RDT' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RDTCONTENT> getRDT();

	/**
	 * Returns the value of the '<em><b>RF1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RF1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RF1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RF1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RF1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RF1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RF1CONTENT> getRF1();

	/**
	 * Returns the value of the '<em><b>RGS</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RGSCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RGS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RGS</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RGS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RGS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RGSCONTENT> getRGS();

	/**
	 * Returns the value of the '<em><b>RMI</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RMICONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RMI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RMI</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RMI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RMI' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RMICONTENT> getRMI();

	/**
	 * Returns the value of the '<em><b>ROL</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ROLCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ROL</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ROL</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_ROL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ROL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ROLCONTENT> getROL();

	/**
	 * Returns the value of the '<em><b>RQ1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RQ1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RQ1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RQ1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RQ1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RQ1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RQ1CONTENT> getRQ1();

	/**
	 * Returns the value of the '<em><b>RQD</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RQDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RQD</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RQD</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RQD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RQD' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RQDCONTENT> getRQD();

	/**
	 * Returns the value of the '<em><b>RXA</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RXACONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RXA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RXA</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RXA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RXA' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RXACONTENT> getRXA();

	/**
	 * Returns the value of the '<em><b>RXC</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RXCCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RXC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RXC</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RXC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RXC' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RXCCONTENT> getRXC();

	/**
	 * Returns the value of the '<em><b>RXD</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RXDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RXD</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RXD</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RXD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RXD' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RXDCONTENT> getRXD();

	/**
	 * Returns the value of the '<em><b>RXE</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RXECONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RXE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RXE</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RXE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RXE' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RXECONTENT> getRXE();

	/**
	 * Returns the value of the '<em><b>RXG</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RXGCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RXG</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RXG</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RXG()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RXG' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RXGCONTENT> getRXG();

	/**
	 * Returns the value of the '<em><b>RXO</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RXOCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RXO</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RXO</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RXO()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RXO' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RXOCONTENT> getRXO();

	/**
	 * Returns the value of the '<em><b>RXR</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RXRCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RXR</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RXR</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_RXR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RXR' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RXRCONTENT> getRXR();

	/**
	 * Returns the value of the '<em><b>SAC</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.SACCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SAC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SAC</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_SAC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SAC' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SACCONTENT> getSAC();

	/**
	 * Returns the value of the '<em><b>SCH</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.SCHCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SCH</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCH</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_SCH()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SCH' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SCHCONTENT> getSCH();

	/**
	 * Returns the value of the '<em><b>SFT</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.SFTCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SFT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SFT</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_SFT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SFT' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SFTCONTENT> getSFT();

	/**
	 * Returns the value of the '<em><b>SID</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.SIDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SID</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SID</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_SID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SIDCONTENT> getSID();

	/**
	 * Returns the value of the '<em><b>SPM</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.SPMCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPM</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_SPM()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPM' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SPMCONTENT> getSPM();

	/**
	 * Returns the value of the '<em><b>SPR</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.SPRCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPR</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPR</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_SPR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPR' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SPRCONTENT> getSPR();

	/**
	 * Returns the value of the '<em><b>STF</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.STFCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>STF</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>STF</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_STF()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='STF' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<STFCONTENT> getSTF();

	/**
	 * Returns the value of the '<em><b>TCC</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.TCCCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TCC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TCC</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_TCC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TCC' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCCCONTENT> getTCC();

	/**
	 * Returns the value of the '<em><b>TCD</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.TCDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TCD</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TCD</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_TCD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TCD' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCDCONTENT> getTCD();

	/**
	 * Returns the value of the '<em><b>TQ1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.TQ1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TQ1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TQ1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_TQ1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TQ1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TQ1CONTENT> getTQ1();

	/**
	 * Returns the value of the '<em><b>TQ2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.TQ2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TQ2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TQ2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_TQ2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TQ2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TQ2CONTENT> getTQ2();

	/**
	 * Returns the value of the '<em><b>TXA</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.TXACONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TXA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TXA</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_TXA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TXA' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TXACONTENT> getTXA();

	/**
	 * Returns the value of the '<em><b>UB1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.UB1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UB1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UB1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_UB1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UB1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UB1CONTENT> getUB1();

	/**
	 * Returns the value of the '<em><b>UB2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.UB2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UB2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UB2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_UB2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UB2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UB2CONTENT> getUB2();

	/**
	 * Returns the value of the '<em><b>URD</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.URDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URD</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URD</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_URD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URD' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URDCONTENT> getURD();

	/**
	 * Returns the value of the '<em><b>URS</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.URSCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URS</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_URS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URSCONTENT> getURS();

	/**
	 * Returns the value of the '<em><b>VAR</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.VARCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAR</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAR</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_VAR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VAR' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VARCONTENT> getVAR();

	/**
	 * Returns the value of the '<em><b>VTQ</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.VTQCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VTQ</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VTQ</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAnyHL7SegmentTYPE_VTQ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VTQ' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VTQCONTENT> getVTQ();

} // AnyHL7SegmentTYPE
