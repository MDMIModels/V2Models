/**
 */
package org.hl7.v2xml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.v2xml.ABSCONTENT;
import org.hl7.v2xml.ACCCONTENT;
import org.hl7.v2xml.ADDCONTENT;
import org.hl7.v2xml.AFFCONTENT;
import org.hl7.v2xml.AIGCONTENT;
import org.hl7.v2xml.AILCONTENT;
import org.hl7.v2xml.AIPCONTENT;
import org.hl7.v2xml.AISCONTENT;
import org.hl7.v2xml.AL1CONTENT;
import org.hl7.v2xml.APRCONTENT;
import org.hl7.v2xml.ARQCONTENT;
import org.hl7.v2xml.AUTCONTENT;
import org.hl7.v2xml.AnyHL7SegmentTYPE;
import org.hl7.v2xml.BHSCONTENT;
import org.hl7.v2xml.BLCCONTENT;
import org.hl7.v2xml.BLGCONTENT;
import org.hl7.v2xml.BPOCONTENT;
import org.hl7.v2xml.BPXCONTENT;
import org.hl7.v2xml.BTSCONTENT;
import org.hl7.v2xml.BTXCONTENT;
import org.hl7.v2xml.CDMCONTENT;
import org.hl7.v2xml.CERCONTENT;
import org.hl7.v2xml.CM0CONTENT;
import org.hl7.v2xml.CM1CONTENT;
import org.hl7.v2xml.CM2CONTENT;
import org.hl7.v2xml.CNSCONTENT;
import org.hl7.v2xml.CONCONTENT;
import org.hl7.v2xml.CSPCONTENT;
import org.hl7.v2xml.CSRCONTENT;
import org.hl7.v2xml.CSSCONTENT;
import org.hl7.v2xml.CTDCONTENT;
import org.hl7.v2xml.CTICONTENT;
import org.hl7.v2xml.DB1CONTENT;
import org.hl7.v2xml.DG1CONTENT;
import org.hl7.v2xml.DRGCONTENT;
import org.hl7.v2xml.DSCCONTENT;
import org.hl7.v2xml.DSPCONTENT;
import org.hl7.v2xml.ECDCONTENT;
import org.hl7.v2xml.ECRCONTENT;
import org.hl7.v2xml.EDUCONTENT;
import org.hl7.v2xml.EQLCONTENT;
import org.hl7.v2xml.EQPCONTENT;
import org.hl7.v2xml.EQUCONTENT;
import org.hl7.v2xml.ERQCONTENT;
import org.hl7.v2xml.ERRCONTENT;
import org.hl7.v2xml.EVNCONTENT;
import org.hl7.v2xml.FACCONTENT;
import org.hl7.v2xml.FHSCONTENT;
import org.hl7.v2xml.FT1CONTENT;
import org.hl7.v2xml.FTSCONTENT;
import org.hl7.v2xml.GOLCONTENT;
import org.hl7.v2xml.GP1CONTENT;
import org.hl7.v2xml.GP2CONTENT;
import org.hl7.v2xml.GT1CONTENT;
import org.hl7.v2xml.IAMCONTENT;
import org.hl7.v2xml.IIMCONTENT;
import org.hl7.v2xml.IN1CONTENT;
import org.hl7.v2xml.IN2CONTENT;
import org.hl7.v2xml.IN3CONTENT;
import org.hl7.v2xml.INVCONTENT;
import org.hl7.v2xml.IPCCONTENT;
import org.hl7.v2xml.ISDCONTENT;
import org.hl7.v2xml.LANCONTENT;
import org.hl7.v2xml.LCCCONTENT;
import org.hl7.v2xml.LCHCONTENT;
import org.hl7.v2xml.LDPCONTENT;
import org.hl7.v2xml.LOCCONTENT;
import org.hl7.v2xml.LRLCONTENT;
import org.hl7.v2xml.MFACONTENT;
import org.hl7.v2xml.MFECONTENT;
import org.hl7.v2xml.MFICONTENT;
import org.hl7.v2xml.MRGCONTENT;
import org.hl7.v2xml.MSACONTENT;
import org.hl7.v2xml.MSHCONTENT;
import org.hl7.v2xml.NCKCONTENT;
import org.hl7.v2xml.NDSCONTENT;
import org.hl7.v2xml.NK1CONTENT;
import org.hl7.v2xml.NPUCONTENT;
import org.hl7.v2xml.NSCCONTENT;
import org.hl7.v2xml.NSTCONTENT;
import org.hl7.v2xml.NTECONTENT;
import org.hl7.v2xml.OBRCONTENT;
import org.hl7.v2xml.OBXCONTENT;
import org.hl7.v2xml.ODSCONTENT;
import org.hl7.v2xml.ODTCONTENT;
import org.hl7.v2xml.OM1CONTENT;
import org.hl7.v2xml.OM2CONTENT;
import org.hl7.v2xml.OM3CONTENT;
import org.hl7.v2xml.OM4CONTENT;
import org.hl7.v2xml.OM5CONTENT;
import org.hl7.v2xml.OM6CONTENT;
import org.hl7.v2xml.OM7CONTENT;
import org.hl7.v2xml.ORCCONTENT;
import org.hl7.v2xml.ORGCONTENT;
import org.hl7.v2xml.OVRCONTENT;
import org.hl7.v2xml.PCRCONTENT;
import org.hl7.v2xml.PD1CONTENT;
import org.hl7.v2xml.PDACONTENT;
import org.hl7.v2xml.PDCCONTENT;
import org.hl7.v2xml.PEOCONTENT;
import org.hl7.v2xml.PESCONTENT;
import org.hl7.v2xml.PIDCONTENT;
import org.hl7.v2xml.PR1CONTENT;
import org.hl7.v2xml.PRACONTENT;
import org.hl7.v2xml.PRBCONTENT;
import org.hl7.v2xml.PRCCONTENT;
import org.hl7.v2xml.PRDCONTENT;
import org.hl7.v2xml.PSHCONTENT;
import org.hl7.v2xml.PTHCONTENT;
import org.hl7.v2xml.PV1CONTENT;
import org.hl7.v2xml.PV2CONTENT;
import org.hl7.v2xml.QAKCONTENT;
import org.hl7.v2xml.QIDCONTENT;
import org.hl7.v2xml.QPDCONTENT;
import org.hl7.v2xml.QRDCONTENT;
import org.hl7.v2xml.QRFCONTENT;
import org.hl7.v2xml.QRICONTENT;
import org.hl7.v2xml.RCPCONTENT;
import org.hl7.v2xml.RDFCONTENT;
import org.hl7.v2xml.RDTCONTENT;
import org.hl7.v2xml.RF1CONTENT;
import org.hl7.v2xml.RGSCONTENT;
import org.hl7.v2xml.RMICONTENT;
import org.hl7.v2xml.ROLCONTENT;
import org.hl7.v2xml.RQ1CONTENT;
import org.hl7.v2xml.RQDCONTENT;
import org.hl7.v2xml.RXACONTENT;
import org.hl7.v2xml.RXCCONTENT;
import org.hl7.v2xml.RXDCONTENT;
import org.hl7.v2xml.RXECONTENT;
import org.hl7.v2xml.RXGCONTENT;
import org.hl7.v2xml.RXOCONTENT;
import org.hl7.v2xml.RXRCONTENT;
import org.hl7.v2xml.SACCONTENT;
import org.hl7.v2xml.SCHCONTENT;
import org.hl7.v2xml.SFTCONTENT;
import org.hl7.v2xml.SIDCONTENT;
import org.hl7.v2xml.SPMCONTENT;
import org.hl7.v2xml.SPRCONTENT;
import org.hl7.v2xml.STFCONTENT;
import org.hl7.v2xml.TCCCONTENT;
import org.hl7.v2xml.TCDCONTENT;
import org.hl7.v2xml.TQ1CONTENT;
import org.hl7.v2xml.TQ2CONTENT;
import org.hl7.v2xml.TXACONTENT;
import org.hl7.v2xml.UB1CONTENT;
import org.hl7.v2xml.UB2CONTENT;
import org.hl7.v2xml.URDCONTENT;
import org.hl7.v2xml.URSCONTENT;
import org.hl7.v2xml.V2xmlPackage;
import org.hl7.v2xml.VARCONTENT;
import org.hl7.v2xml.VTQCONTENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any HL7 Segment TYPE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getABS <em>ABS</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getACC <em>ACC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getADD <em>ADD</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getAFF <em>AFF</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getAIG <em>AIG</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getAIL <em>AIL</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getAIP <em>AIP</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getAIS <em>AIS</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getAL1 <em>AL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getAPR <em>APR</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getARQ <em>ARQ</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getAUT <em>AUT</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getBHS <em>BHS</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getBLC <em>BLC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getBLG <em>BLG</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getBPO <em>BPO</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getBPX <em>BPX</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getBTS <em>BTS</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getBTX <em>BTX</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getCDM <em>CDM</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getCER <em>CER</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getCM0 <em>CM0</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getCM1 <em>CM1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getCM2 <em>CM2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getCNS <em>CNS</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getCON <em>CON</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getCSP <em>CSP</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getCSR <em>CSR</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getCSS <em>CSS</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getCTD <em>CTD</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getCTI <em>CTI</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getDB1 <em>DB1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getDG1 <em>DG1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getDRG <em>DRG</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getDSC <em>DSC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getDSP <em>DSP</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getECD <em>ECD</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getECR <em>ECR</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getEDU <em>EDU</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getEQL <em>EQL</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getEQP <em>EQP</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getEQU <em>EQU</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getERQ <em>ERQ</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getERR <em>ERR</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getEVN <em>EVN</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getFAC <em>FAC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getFHS <em>FHS</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getFT1 <em>FT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getFTS <em>FTS</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getGOL <em>GOL</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getGP1 <em>GP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getGP2 <em>GP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getGT1 <em>GT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getIAM <em>IAM</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getIIM <em>IIM</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getIN1 <em>IN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getIN2 <em>IN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getIN3 <em>IN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getINV <em>INV</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getIPC <em>IPC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getISD <em>ISD</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getLAN <em>LAN</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getLCC <em>LCC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getLCH <em>LCH</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getLDP <em>LDP</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getLOC <em>LOC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getLRL <em>LRL</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getMFA <em>MFA</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getMFE <em>MFE</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getMFI <em>MFI</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getMRG <em>MRG</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getMSA <em>MSA</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getMSH <em>MSH</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getNCK <em>NCK</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getNDS <em>NDS</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getNK1 <em>NK1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getNPU <em>NPU</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getNSC <em>NSC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getNST <em>NST</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getNTE <em>NTE</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getOBR <em>OBR</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getOBX <em>OBX</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getODS <em>ODS</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getODT <em>ODT</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getOM1 <em>OM1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getOM2 <em>OM2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getOM3 <em>OM3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getOM4 <em>OM4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getOM5 <em>OM5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getOM6 <em>OM6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getOM7 <em>OM7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getORC <em>ORC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getORG <em>ORG</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getOVR <em>OVR</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPCR <em>PCR</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPD1 <em>PD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPDA <em>PDA</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPDC <em>PDC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPEO <em>PEO</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPES <em>PES</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPID <em>PID</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPR1 <em>PR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPRA <em>PRA</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPRB <em>PRB</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPRC <em>PRC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPRD <em>PRD</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPSH <em>PSH</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPTH <em>PTH</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPV1 <em>PV1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getPV2 <em>PV2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getQAK <em>QAK</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getQID <em>QID</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getQPD <em>QPD</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getQRD <em>QRD</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getQRF <em>QRF</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getQRI <em>QRI</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRCP <em>RCP</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRDF <em>RDF</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRDT <em>RDT</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRF1 <em>RF1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRGS <em>RGS</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRMI <em>RMI</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getROL <em>ROL</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRQ1 <em>RQ1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRQD <em>RQD</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRXA <em>RXA</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRXC <em>RXC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRXD <em>RXD</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRXE <em>RXE</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRXG <em>RXG</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRXO <em>RXO</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getRXR <em>RXR</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getSAC <em>SAC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getSCH <em>SCH</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getSFT <em>SFT</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getSID <em>SID</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getSPM <em>SPM</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getSPR <em>SPR</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getSTF <em>STF</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getTCC <em>TCC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getTCD <em>TCD</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getTQ1 <em>TQ1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getTQ2 <em>TQ2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getTXA <em>TXA</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getUB1 <em>UB1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getUB2 <em>UB2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getURD <em>URD</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getURS <em>URS</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getVAR <em>VAR</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AnyHL7SegmentTYPEImpl#getVTQ <em>VTQ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnyHL7SegmentTYPEImpl extends EObjectImpl implements AnyHL7SegmentTYPE {
	/**
	 * The cached value of the '{@link #getABS() <em>ABS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS()
	 * @generated
	 * @ordered
	 */
	protected EList<ABSCONTENT> aBS;

	/**
	 * The cached value of the '{@link #getACC() <em>ACC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACC()
	 * @generated
	 * @ordered
	 */
	protected EList<ACCCONTENT> aCC;

	/**
	 * The cached value of the '{@link #getADD() <em>ADD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADD()
	 * @generated
	 * @ordered
	 */
	protected EList<ADDCONTENT> aDD;

	/**
	 * The cached value of the '{@link #getAFF() <em>AFF</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFF()
	 * @generated
	 * @ordered
	 */
	protected EList<AFFCONTENT> aFF;

	/**
	 * The cached value of the '{@link #getAIG() <em>AIG</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG()
	 * @generated
	 * @ordered
	 */
	protected EList<AIGCONTENT> aIG;

	/**
	 * The cached value of the '{@link #getAIL() <em>AIL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIL()
	 * @generated
	 * @ordered
	 */
	protected EList<AILCONTENT> aIL;

	/**
	 * The cached value of the '{@link #getAIP() <em>AIP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIP()
	 * @generated
	 * @ordered
	 */
	protected EList<AIPCONTENT> aIP;

	/**
	 * The cached value of the '{@link #getAIS() <em>AIS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIS()
	 * @generated
	 * @ordered
	 */
	protected EList<AISCONTENT> aIS;

	/**
	 * The cached value of the '{@link #getAL1() <em>AL1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAL1()
	 * @generated
	 * @ordered
	 */
	protected EList<AL1CONTENT> aL1;

	/**
	 * The cached value of the '{@link #getAPR() <em>APR</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPR()
	 * @generated
	 * @ordered
	 */
	protected EList<APRCONTENT> aPR;

	/**
	 * The cached value of the '{@link #getARQ() <em>ARQ</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ()
	 * @generated
	 * @ordered
	 */
	protected EList<ARQCONTENT> aRQ;

	/**
	 * The cached value of the '{@link #getAUT() <em>AUT</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUT()
	 * @generated
	 * @ordered
	 */
	protected EList<AUTCONTENT> aUT;

	/**
	 * The cached value of the '{@link #getBHS() <em>BHS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBHS()
	 * @generated
	 * @ordered
	 */
	protected EList<BHSCONTENT> bHS;

	/**
	 * The cached value of the '{@link #getBLC() <em>BLC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBLC()
	 * @generated
	 * @ordered
	 */
	protected EList<BLCCONTENT> bLC;

	/**
	 * The cached value of the '{@link #getBLG() <em>BLG</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBLG()
	 * @generated
	 * @ordered
	 */
	protected EList<BLGCONTENT> bLG;

	/**
	 * The cached value of the '{@link #getBPO() <em>BPO</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO()
	 * @generated
	 * @ordered
	 */
	protected EList<BPOCONTENT> bPO;

	/**
	 * The cached value of the '{@link #getBPX() <em>BPX</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX()
	 * @generated
	 * @ordered
	 */
	protected EList<BPXCONTENT> bPX;

	/**
	 * The cached value of the '{@link #getBTS() <em>BTS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTS()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSCONTENT> bTS;

	/**
	 * The cached value of the '{@link #getBTX() <em>BTX</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX()
	 * @generated
	 * @ordered
	 */
	protected EList<BTXCONTENT> bTX;

	/**
	 * The cached value of the '{@link #getCDM() <em>CDM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDM()
	 * @generated
	 * @ordered
	 */
	protected EList<CDMCONTENT> cDM;

	/**
	 * The cached value of the '{@link #getCER() <em>CER</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER()
	 * @generated
	 * @ordered
	 */
	protected EList<CERCONTENT> cER;

	/**
	 * The cached value of the '{@link #getCM0() <em>CM0</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM0()
	 * @generated
	 * @ordered
	 */
	protected EList<CM0CONTENT> cM0;

	/**
	 * The cached value of the '{@link #getCM1() <em>CM1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM1()
	 * @generated
	 * @ordered
	 */
	protected EList<CM1CONTENT> cM1;

	/**
	 * The cached value of the '{@link #getCM2() <em>CM2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM2()
	 * @generated
	 * @ordered
	 */
	protected EList<CM2CONTENT> cM2;

	/**
	 * The cached value of the '{@link #getCNS() <em>CNS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNS()
	 * @generated
	 * @ordered
	 */
	protected EList<CNSCONTENT> cNS;

	/**
	 * The cached value of the '{@link #getCON() <em>CON</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON()
	 * @generated
	 * @ordered
	 */
	protected EList<CONCONTENT> cON;

	/**
	 * The cached value of the '{@link #getCSP() <em>CSP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSP()
	 * @generated
	 * @ordered
	 */
	protected EList<CSPCONTENT> cSP;

	/**
	 * The cached value of the '{@link #getCSR() <em>CSR</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR()
	 * @generated
	 * @ordered
	 */
	protected EList<CSRCONTENT> cSR;

	/**
	 * The cached value of the '{@link #getCSS() <em>CSS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSS()
	 * @generated
	 * @ordered
	 */
	protected EList<CSSCONTENT> cSS;

	/**
	 * The cached value of the '{@link #getCTD() <em>CTD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTD()
	 * @generated
	 * @ordered
	 */
	protected EList<CTDCONTENT> cTD;

	/**
	 * The cached value of the '{@link #getCTI() <em>CTI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTI()
	 * @generated
	 * @ordered
	 */
	protected EList<CTICONTENT> cTI;

	/**
	 * The cached value of the '{@link #getDB1() <em>DB1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDB1()
	 * @generated
	 * @ordered
	 */
	protected EList<DB1CONTENT> dB1;

	/**
	 * The cached value of the '{@link #getDG1() <em>DG1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDG1()
	 * @generated
	 * @ordered
	 */
	protected EList<DG1CONTENT> dG1;

	/**
	 * The cached value of the '{@link #getDRG() <em>DRG</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDRG()
	 * @generated
	 * @ordered
	 */
	protected EList<DRGCONTENT> dRG;

	/**
	 * The cached value of the '{@link #getDSC() <em>DSC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSC()
	 * @generated
	 * @ordered
	 */
	protected EList<DSCCONTENT> dSC;

	/**
	 * The cached value of the '{@link #getDSP() <em>DSP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSP()
	 * @generated
	 * @ordered
	 */
	protected EList<DSPCONTENT> dSP;

	/**
	 * The cached value of the '{@link #getECD() <em>ECD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECD()
	 * @generated
	 * @ordered
	 */
	protected EList<ECDCONTENT> eCD;

	/**
	 * The cached value of the '{@link #getECR() <em>ECR</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECR()
	 * @generated
	 * @ordered
	 */
	protected EList<ECRCONTENT> eCR;

	/**
	 * The cached value of the '{@link #getEDU() <em>EDU</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDU()
	 * @generated
	 * @ordered
	 */
	protected EList<EDUCONTENT> eDU;

	/**
	 * The cached value of the '{@link #getEQL() <em>EQL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQL()
	 * @generated
	 * @ordered
	 */
	protected EList<EQLCONTENT> eQL;

	/**
	 * The cached value of the '{@link #getEQP() <em>EQP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQP()
	 * @generated
	 * @ordered
	 */
	protected EList<EQPCONTENT> eQP;

	/**
	 * The cached value of the '{@link #getEQU() <em>EQU</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQU()
	 * @generated
	 * @ordered
	 */
	protected EList<EQUCONTENT> eQU;

	/**
	 * The cached value of the '{@link #getERQ() <em>ERQ</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERQ()
	 * @generated
	 * @ordered
	 */
	protected EList<ERQCONTENT> eRQ;

	/**
	 * The cached value of the '{@link #getERR() <em>ERR</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERR()
	 * @generated
	 * @ordered
	 */
	protected EList<ERRCONTENT> eRR;

	/**
	 * The cached value of the '{@link #getEVN() <em>EVN</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVN()
	 * @generated
	 * @ordered
	 */
	protected EList<EVNCONTENT> eVN;

	/**
	 * The cached value of the '{@link #getFAC() <em>FAC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAC()
	 * @generated
	 * @ordered
	 */
	protected EList<FACCONTENT> fAC;

	/**
	 * The cached value of the '{@link #getFHS() <em>FHS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFHS()
	 * @generated
	 * @ordered
	 */
	protected EList<FHSCONTENT> fHS;

	/**
	 * The cached value of the '{@link #getFT1() <em>FT1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT1()
	 * @generated
	 * @ordered
	 */
	protected EList<FT1CONTENT> fT1;

	/**
	 * The cached value of the '{@link #getFTS() <em>FTS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTS()
	 * @generated
	 * @ordered
	 */
	protected EList<FTSCONTENT> fTS;

	/**
	 * The cached value of the '{@link #getGOL() <em>GOL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL()
	 * @generated
	 * @ordered
	 */
	protected EList<GOLCONTENT> gOL;

	/**
	 * The cached value of the '{@link #getGP1() <em>GP1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP1()
	 * @generated
	 * @ordered
	 */
	protected EList<GP1CONTENT> gP1;

	/**
	 * The cached value of the '{@link #getGP2() <em>GP2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP2()
	 * @generated
	 * @ordered
	 */
	protected EList<GP2CONTENT> gP2;

	/**
	 * The cached value of the '{@link #getGT1() <em>GT1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT1()
	 * @generated
	 * @ordered
	 */
	protected EList<GT1CONTENT> gT1;

	/**
	 * The cached value of the '{@link #getIAM() <em>IAM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM()
	 * @generated
	 * @ordered
	 */
	protected EList<IAMCONTENT> iAM;

	/**
	 * The cached value of the '{@link #getIIM() <em>IIM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM()
	 * @generated
	 * @ordered
	 */
	protected EList<IIMCONTENT> iIM;

	/**
	 * The cached value of the '{@link #getIN1() <em>IN1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN1()
	 * @generated
	 * @ordered
	 */
	protected EList<IN1CONTENT> iN1;

	/**
	 * The cached value of the '{@link #getIN2() <em>IN2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN2()
	 * @generated
	 * @ordered
	 */
	protected EList<IN2CONTENT> iN2;

	/**
	 * The cached value of the '{@link #getIN3() <em>IN3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN3()
	 * @generated
	 * @ordered
	 */
	protected EList<IN3CONTENT> iN3;

	/**
	 * The cached value of the '{@link #getINV() <em>INV</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV()
	 * @generated
	 * @ordered
	 */
	protected EList<INVCONTENT> iNV;

	/**
	 * The cached value of the '{@link #getIPC() <em>IPC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPC()
	 * @generated
	 * @ordered
	 */
	protected EList<IPCCONTENT> iPC;

	/**
	 * The cached value of the '{@link #getISD() <em>ISD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISD()
	 * @generated
	 * @ordered
	 */
	protected EList<ISDCONTENT> iSD;

	/**
	 * The cached value of the '{@link #getLAN() <em>LAN</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLAN()
	 * @generated
	 * @ordered
	 */
	protected EList<LANCONTENT> lAN;

	/**
	 * The cached value of the '{@link #getLCC() <em>LCC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCC()
	 * @generated
	 * @ordered
	 */
	protected EList<LCCCONTENT> lCC;

	/**
	 * The cached value of the '{@link #getLCH() <em>LCH</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCH()
	 * @generated
	 * @ordered
	 */
	protected EList<LCHCONTENT> lCH;

	/**
	 * The cached value of the '{@link #getLDP() <em>LDP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDP()
	 * @generated
	 * @ordered
	 */
	protected EList<LDPCONTENT> lDP;

	/**
	 * The cached value of the '{@link #getLOC() <em>LOC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOC()
	 * @generated
	 * @ordered
	 */
	protected EList<LOCCONTENT> lOC;

	/**
	 * The cached value of the '{@link #getLRL() <em>LRL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRL()
	 * @generated
	 * @ordered
	 */
	protected EList<LRLCONTENT> lRL;

	/**
	 * The cached value of the '{@link #getMFA() <em>MFA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFA()
	 * @generated
	 * @ordered
	 */
	protected EList<MFACONTENT> mFA;

	/**
	 * The cached value of the '{@link #getMFE() <em>MFE</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFE()
	 * @generated
	 * @ordered
	 */
	protected EList<MFECONTENT> mFE;

	/**
	 * The cached value of the '{@link #getMFI() <em>MFI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFI()
	 * @generated
	 * @ordered
	 */
	protected EList<MFICONTENT> mFI;

	/**
	 * The cached value of the '{@link #getMRG() <em>MRG</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRG()
	 * @generated
	 * @ordered
	 */
	protected EList<MRGCONTENT> mRG;

	/**
	 * The cached value of the '{@link #getMSA() <em>MSA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSA()
	 * @generated
	 * @ordered
	 */
	protected EList<MSACONTENT> mSA;

	/**
	 * The cached value of the '{@link #getMSH() <em>MSH</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH()
	 * @generated
	 * @ordered
	 */
	protected EList<MSHCONTENT> mSH;

	/**
	 * The cached value of the '{@link #getNCK() <em>NCK</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNCK()
	 * @generated
	 * @ordered
	 */
	protected EList<NCKCONTENT> nCK;

	/**
	 * The cached value of the '{@link #getNDS() <em>NDS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDS()
	 * @generated
	 * @ordered
	 */
	protected EList<NDSCONTENT> nDS;

	/**
	 * The cached value of the '{@link #getNK1() <em>NK1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK1()
	 * @generated
	 * @ordered
	 */
	protected EList<NK1CONTENT> nK1;

	/**
	 * The cached value of the '{@link #getNPU() <em>NPU</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNPU()
	 * @generated
	 * @ordered
	 */
	protected EList<NPUCONTENT> nPU;

	/**
	 * The cached value of the '{@link #getNSC() <em>NSC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNSC()
	 * @generated
	 * @ordered
	 */
	protected EList<NSCCONTENT> nSC;

	/**
	 * The cached value of the '{@link #getNST() <em>NST</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST()
	 * @generated
	 * @ordered
	 */
	protected EList<NSTCONTENT> nST;

	/**
	 * The cached value of the '{@link #getNTE() <em>NTE</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNTE()
	 * @generated
	 * @ordered
	 */
	protected EList<NTECONTENT> nTE;

	/**
	 * The cached value of the '{@link #getOBR() <em>OBR</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBR()
	 * @generated
	 * @ordered
	 */
	protected EList<OBRCONTENT> oBR;

	/**
	 * The cached value of the '{@link #getOBX() <em>OBX</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX()
	 * @generated
	 * @ordered
	 */
	protected EList<OBXCONTENT> oBX;

	/**
	 * The cached value of the '{@link #getODS() <em>ODS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getODS()
	 * @generated
	 * @ordered
	 */
	protected EList<ODSCONTENT> oDS;

	/**
	 * The cached value of the '{@link #getODT() <em>ODT</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getODT()
	 * @generated
	 * @ordered
	 */
	protected EList<ODTCONTENT> oDT;

	/**
	 * The cached value of the '{@link #getOM1() <em>OM1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM1()
	 * @generated
	 * @ordered
	 */
	protected EList<OM1CONTENT> oM1;

	/**
	 * The cached value of the '{@link #getOM2() <em>OM2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM2()
	 * @generated
	 * @ordered
	 */
	protected EList<OM2CONTENT> oM2;

	/**
	 * The cached value of the '{@link #getOM3() <em>OM3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM3()
	 * @generated
	 * @ordered
	 */
	protected EList<OM3CONTENT> oM3;

	/**
	 * The cached value of the '{@link #getOM4() <em>OM4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM4()
	 * @generated
	 * @ordered
	 */
	protected EList<OM4CONTENT> oM4;

	/**
	 * The cached value of the '{@link #getOM5() <em>OM5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM5()
	 * @generated
	 * @ordered
	 */
	protected EList<OM5CONTENT> oM5;

	/**
	 * The cached value of the '{@link #getOM6() <em>OM6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM6()
	 * @generated
	 * @ordered
	 */
	protected EList<OM6CONTENT> oM6;

	/**
	 * The cached value of the '{@link #getOM7() <em>OM7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM7()
	 * @generated
	 * @ordered
	 */
	protected EList<OM7CONTENT> oM7;

	/**
	 * The cached value of the '{@link #getORC() <em>ORC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC()
	 * @generated
	 * @ordered
	 */
	protected EList<ORCCONTENT> oRC;

	/**
	 * The cached value of the '{@link #getORG() <em>ORG</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORG()
	 * @generated
	 * @ordered
	 */
	protected EList<ORGCONTENT> oRG;

	/**
	 * The cached value of the '{@link #getOVR() <em>OVR</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOVR()
	 * @generated
	 * @ordered
	 */
	protected EList<OVRCONTENT> oVR;

	/**
	 * The cached value of the '{@link #getPCR() <em>PCR</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR()
	 * @generated
	 * @ordered
	 */
	protected EList<PCRCONTENT> pCR;

	/**
	 * The cached value of the '{@link #getPD1() <em>PD1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPD1()
	 * @generated
	 * @ordered
	 */
	protected EList<PD1CONTENT> pD1;

	/**
	 * The cached value of the '{@link #getPDA() <em>PDA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDA()
	 * @generated
	 * @ordered
	 */
	protected EList<PDACONTENT> pDA;

	/**
	 * The cached value of the '{@link #getPDC() <em>PDC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC()
	 * @generated
	 * @ordered
	 */
	protected EList<PDCCONTENT> pDC;

	/**
	 * The cached value of the '{@link #getPEO() <em>PEO</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO()
	 * @generated
	 * @ordered
	 */
	protected EList<PEOCONTENT> pEO;

	/**
	 * The cached value of the '{@link #getPES() <em>PES</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPES()
	 * @generated
	 * @ordered
	 */
	protected EList<PESCONTENT> pES;

	/**
	 * The cached value of the '{@link #getPID() <em>PID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID()
	 * @generated
	 * @ordered
	 */
	protected EList<PIDCONTENT> pID;

	/**
	 * The cached value of the '{@link #getPR1() <em>PR1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR1()
	 * @generated
	 * @ordered
	 */
	protected EList<PR1CONTENT> pR1;

	/**
	 * The cached value of the '{@link #getPRA() <em>PRA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRA()
	 * @generated
	 * @ordered
	 */
	protected EList<PRACONTENT> pRA;

	/**
	 * The cached value of the '{@link #getPRB() <em>PRB</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB()
	 * @generated
	 * @ordered
	 */
	protected EList<PRBCONTENT> pRB;

	/**
	 * The cached value of the '{@link #getPRC() <em>PRC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC()
	 * @generated
	 * @ordered
	 */
	protected EList<PRCCONTENT> pRC;

	/**
	 * The cached value of the '{@link #getPRD() <em>PRD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRD()
	 * @generated
	 * @ordered
	 */
	protected EList<PRDCONTENT> pRD;

	/**
	 * The cached value of the '{@link #getPSH() <em>PSH</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH()
	 * @generated
	 * @ordered
	 */
	protected EList<PSHCONTENT> pSH;

	/**
	 * The cached value of the '{@link #getPTH() <em>PTH</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTH()
	 * @generated
	 * @ordered
	 */
	protected EList<PTHCONTENT> pTH;

	/**
	 * The cached value of the '{@link #getPV1() <em>PV1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV1()
	 * @generated
	 * @ordered
	 */
	protected EList<PV1CONTENT> pV1;

	/**
	 * The cached value of the '{@link #getPV2() <em>PV2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV2()
	 * @generated
	 * @ordered
	 */
	protected EList<PV2CONTENT> pV2;

	/**
	 * The cached value of the '{@link #getQAK() <em>QAK</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQAK()
	 * @generated
	 * @ordered
	 */
	protected EList<QAKCONTENT> qAK;

	/**
	 * The cached value of the '{@link #getQID() <em>QID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQID()
	 * @generated
	 * @ordered
	 */
	protected EList<QIDCONTENT> qID;

	/**
	 * The cached value of the '{@link #getQPD() <em>QPD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQPD()
	 * @generated
	 * @ordered
	 */
	protected EList<QPDCONTENT> qPD;

	/**
	 * The cached value of the '{@link #getQRD() <em>QRD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRD()
	 * @generated
	 * @ordered
	 */
	protected EList<QRDCONTENT> qRD;

	/**
	 * The cached value of the '{@link #getQRF() <em>QRF</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRF()
	 * @generated
	 * @ordered
	 */
	protected EList<QRFCONTENT> qRF;

	/**
	 * The cached value of the '{@link #getQRI() <em>QRI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRI()
	 * @generated
	 * @ordered
	 */
	protected EList<QRICONTENT> qRI;

	/**
	 * The cached value of the '{@link #getRCP() <em>RCP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCP()
	 * @generated
	 * @ordered
	 */
	protected EList<RCPCONTENT> rCP;

	/**
	 * The cached value of the '{@link #getRDF() <em>RDF</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDF()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFCONTENT> rDF;

	/**
	 * The cached value of the '{@link #getRDT() <em>RDT</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDT()
	 * @generated
	 * @ordered
	 */
	protected EList<RDTCONTENT> rDT;

	/**
	 * The cached value of the '{@link #getRF1() <em>RF1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRF1()
	 * @generated
	 * @ordered
	 */
	protected EList<RF1CONTENT> rF1;

	/**
	 * The cached value of the '{@link #getRGS() <em>RGS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRGS()
	 * @generated
	 * @ordered
	 */
	protected EList<RGSCONTENT> rGS;

	/**
	 * The cached value of the '{@link #getRMI() <em>RMI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMI()
	 * @generated
	 * @ordered
	 */
	protected EList<RMICONTENT> rMI;

	/**
	 * The cached value of the '{@link #getROL() <em>ROL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROL()
	 * @generated
	 * @ordered
	 */
	protected EList<ROLCONTENT> rOL;

	/**
	 * The cached value of the '{@link #getRQ1() <em>RQ1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQ1()
	 * @generated
	 * @ordered
	 */
	protected EList<RQ1CONTENT> rQ1;

	/**
	 * The cached value of the '{@link #getRQD() <em>RQD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQD()
	 * @generated
	 * @ordered
	 */
	protected EList<RQDCONTENT> rQD;

	/**
	 * The cached value of the '{@link #getRXA() <em>RXA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA()
	 * @generated
	 * @ordered
	 */
	protected EList<RXACONTENT> rXA;

	/**
	 * The cached value of the '{@link #getRXC() <em>RXC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXC()
	 * @generated
	 * @ordered
	 */
	protected EList<RXCCONTENT> rXC;

	/**
	 * The cached value of the '{@link #getRXD() <em>RXD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD()
	 * @generated
	 * @ordered
	 */
	protected EList<RXDCONTENT> rXD;

	/**
	 * The cached value of the '{@link #getRXE() <em>RXE</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE()
	 * @generated
	 * @ordered
	 */
	protected EList<RXECONTENT> rXE;

	/**
	 * The cached value of the '{@link #getRXG() <em>RXG</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG()
	 * @generated
	 * @ordered
	 */
	protected EList<RXGCONTENT> rXG;

	/**
	 * The cached value of the '{@link #getRXO() <em>RXO</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO()
	 * @generated
	 * @ordered
	 */
	protected EList<RXOCONTENT> rXO;

	/**
	 * The cached value of the '{@link #getRXR() <em>RXR</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXR()
	 * @generated
	 * @ordered
	 */
	protected EList<RXRCONTENT> rXR;

	/**
	 * The cached value of the '{@link #getSAC() <em>SAC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAC()
	 * @generated
	 * @ordered
	 */
	protected EList<SACCONTENT> sAC;

	/**
	 * The cached value of the '{@link #getSCH() <em>SCH</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH()
	 * @generated
	 * @ordered
	 */
	protected EList<SCHCONTENT> sCH;

	/**
	 * The cached value of the '{@link #getSFT() <em>SFT</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSFT()
	 * @generated
	 * @ordered
	 */
	protected EList<SFTCONTENT> sFT;

	/**
	 * The cached value of the '{@link #getSID() <em>SID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSID()
	 * @generated
	 * @ordered
	 */
	protected EList<SIDCONTENT> sID;

	/**
	 * The cached value of the '{@link #getSPM() <em>SPM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM()
	 * @generated
	 * @ordered
	 */
	protected EList<SPMCONTENT> sPM;

	/**
	 * The cached value of the '{@link #getSPR() <em>SPR</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPR()
	 * @generated
	 * @ordered
	 */
	protected EList<SPRCONTENT> sPR;

	/**
	 * The cached value of the '{@link #getSTF() <em>STF</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF()
	 * @generated
	 * @ordered
	 */
	protected EList<STFCONTENT> sTF;

	/**
	 * The cached value of the '{@link #getTCC() <em>TCC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC()
	 * @generated
	 * @ordered
	 */
	protected EList<TCCCONTENT> tCC;

	/**
	 * The cached value of the '{@link #getTCD() <em>TCD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCD()
	 * @generated
	 * @ordered
	 */
	protected EList<TCDCONTENT> tCD;

	/**
	 * The cached value of the '{@link #getTQ1() <em>TQ1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ1()
	 * @generated
	 * @ordered
	 */
	protected EList<TQ1CONTENT> tQ1;

	/**
	 * The cached value of the '{@link #getTQ2() <em>TQ2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ2()
	 * @generated
	 * @ordered
	 */
	protected EList<TQ2CONTENT> tQ2;

	/**
	 * The cached value of the '{@link #getTXA() <em>TXA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA()
	 * @generated
	 * @ordered
	 */
	protected EList<TXACONTENT> tXA;

	/**
	 * The cached value of the '{@link #getUB1() <em>UB1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB1()
	 * @generated
	 * @ordered
	 */
	protected EList<UB1CONTENT> uB1;

	/**
	 * The cached value of the '{@link #getUB2() <em>UB2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB2()
	 * @generated
	 * @ordered
	 */
	protected EList<UB2CONTENT> uB2;

	/**
	 * The cached value of the '{@link #getURD() <em>URD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURD()
	 * @generated
	 * @ordered
	 */
	protected EList<URDCONTENT> uRD;

	/**
	 * The cached value of the '{@link #getURS() <em>URS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURS()
	 * @generated
	 * @ordered
	 */
	protected EList<URSCONTENT> uRS;

	/**
	 * The cached value of the '{@link #getVAR() <em>VAR</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAR()
	 * @generated
	 * @ordered
	 */
	protected EList<VARCONTENT> vAR;

	/**
	 * The cached value of the '{@link #getVTQ() <em>VTQ</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTQ()
	 * @generated
	 * @ordered
	 */
	protected EList<VTQCONTENT> vTQ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyHL7SegmentTYPEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getAnyHL7SegmentTYPE();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ABSCONTENT> getABS() {
		if (aBS == null) {
			aBS = new EObjectContainmentEList<ABSCONTENT>(ABSCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ABS);
		}
		return aBS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ACCCONTENT> getACC() {
		if (aCC == null) {
			aCC = new EObjectContainmentEList<ACCCONTENT>(ACCCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ACC);
		}
		return aCC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADDCONTENT> getADD() {
		if (aDD == null) {
			aDD = new EObjectContainmentEList<ADDCONTENT>(ADDCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ADD);
		}
		return aDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AFFCONTENT> getAFF() {
		if (aFF == null) {
			aFF = new EObjectContainmentEList<AFFCONTENT>(AFFCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AFF);
		}
		return aFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AIGCONTENT> getAIG() {
		if (aIG == null) {
			aIG = new EObjectContainmentEList<AIGCONTENT>(AIGCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIG);
		}
		return aIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AILCONTENT> getAIL() {
		if (aIL == null) {
			aIL = new EObjectContainmentEList<AILCONTENT>(AILCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIL);
		}
		return aIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AIPCONTENT> getAIP() {
		if (aIP == null) {
			aIP = new EObjectContainmentEList<AIPCONTENT>(AIPCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIP);
		}
		return aIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AISCONTENT> getAIS() {
		if (aIS == null) {
			aIS = new EObjectContainmentEList<AISCONTENT>(AISCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIS);
		}
		return aIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AL1CONTENT> getAL1() {
		if (aL1 == null) {
			aL1 = new EObjectContainmentEList<AL1CONTENT>(AL1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AL1);
		}
		return aL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APRCONTENT> getAPR() {
		if (aPR == null) {
			aPR = new EObjectContainmentEList<APRCONTENT>(APRCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__APR);
		}
		return aPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ARQCONTENT> getARQ() {
		if (aRQ == null) {
			aRQ = new EObjectContainmentEList<ARQCONTENT>(ARQCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ARQ);
		}
		return aRQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AUTCONTENT> getAUT() {
		if (aUT == null) {
			aUT = new EObjectContainmentEList<AUTCONTENT>(AUTCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AUT);
		}
		return aUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BHSCONTENT> getBHS() {
		if (bHS == null) {
			bHS = new EObjectContainmentEList<BHSCONTENT>(BHSCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BHS);
		}
		return bHS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BLCCONTENT> getBLC() {
		if (bLC == null) {
			bLC = new EObjectContainmentEList<BLCCONTENT>(BLCCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BLC);
		}
		return bLC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BLGCONTENT> getBLG() {
		if (bLG == null) {
			bLG = new EObjectContainmentEList<BLGCONTENT>(BLGCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BLG);
		}
		return bLG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPOCONTENT> getBPO() {
		if (bPO == null) {
			bPO = new EObjectContainmentEList<BPOCONTENT>(BPOCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BPO);
		}
		return bPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPXCONTENT> getBPX() {
		if (bPX == null) {
			bPX = new EObjectContainmentEList<BPXCONTENT>(BPXCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BPX);
		}
		return bPX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSCONTENT> getBTS() {
		if (bTS == null) {
			bTS = new EObjectContainmentEList<BTSCONTENT>(BTSCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BTS);
		}
		return bTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTXCONTENT> getBTX() {
		if (bTX == null) {
			bTX = new EObjectContainmentEList<BTXCONTENT>(BTXCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BTX);
		}
		return bTX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CDMCONTENT> getCDM() {
		if (cDM == null) {
			cDM = new EObjectContainmentEList<CDMCONTENT>(CDMCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CDM);
		}
		return cDM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CERCONTENT> getCER() {
		if (cER == null) {
			cER = new EObjectContainmentEList<CERCONTENT>(CERCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CER);
		}
		return cER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CM0CONTENT> getCM0() {
		if (cM0 == null) {
			cM0 = new EObjectContainmentEList<CM0CONTENT>(CM0CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM0);
		}
		return cM0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CM1CONTENT> getCM1() {
		if (cM1 == null) {
			cM1 = new EObjectContainmentEList<CM1CONTENT>(CM1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM1);
		}
		return cM1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CM2CONTENT> getCM2() {
		if (cM2 == null) {
			cM2 = new EObjectContainmentEList<CM2CONTENT>(CM2CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM2);
		}
		return cM2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CNSCONTENT> getCNS() {
		if (cNS == null) {
			cNS = new EObjectContainmentEList<CNSCONTENT>(CNSCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CNS);
		}
		return cNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CONCONTENT> getCON() {
		if (cON == null) {
			cON = new EObjectContainmentEList<CONCONTENT>(CONCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CON);
		}
		return cON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSPCONTENT> getCSP() {
		if (cSP == null) {
			cSP = new EObjectContainmentEList<CSPCONTENT>(CSPCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSP);
		}
		return cSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSRCONTENT> getCSR() {
		if (cSR == null) {
			cSR = new EObjectContainmentEList<CSRCONTENT>(CSRCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSR);
		}
		return cSR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSSCONTENT> getCSS() {
		if (cSS == null) {
			cSS = new EObjectContainmentEList<CSSCONTENT>(CSSCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSS);
		}
		return cSS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CTDCONTENT> getCTD() {
		if (cTD == null) {
			cTD = new EObjectContainmentEList<CTDCONTENT>(CTDCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CTD);
		}
		return cTD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CTICONTENT> getCTI() {
		if (cTI == null) {
			cTI = new EObjectContainmentEList<CTICONTENT>(CTICONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CTI);
		}
		return cTI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DB1CONTENT> getDB1() {
		if (dB1 == null) {
			dB1 = new EObjectContainmentEList<DB1CONTENT>(DB1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DB1);
		}
		return dB1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DG1CONTENT> getDG1() {
		if (dG1 == null) {
			dG1 = new EObjectContainmentEList<DG1CONTENT>(DG1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DG1);
		}
		return dG1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DRGCONTENT> getDRG() {
		if (dRG == null) {
			dRG = new EObjectContainmentEList<DRGCONTENT>(DRGCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DRG);
		}
		return dRG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DSCCONTENT> getDSC() {
		if (dSC == null) {
			dSC = new EObjectContainmentEList<DSCCONTENT>(DSCCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DSC);
		}
		return dSC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DSPCONTENT> getDSP() {
		if (dSP == null) {
			dSP = new EObjectContainmentEList<DSPCONTENT>(DSPCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DSP);
		}
		return dSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECDCONTENT> getECD() {
		if (eCD == null) {
			eCD = new EObjectContainmentEList<ECDCONTENT>(ECDCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ECD);
		}
		return eCD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECRCONTENT> getECR() {
		if (eCR == null) {
			eCR = new EObjectContainmentEList<ECRCONTENT>(ECRCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ECR);
		}
		return eCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDUCONTENT> getEDU() {
		if (eDU == null) {
			eDU = new EObjectContainmentEList<EDUCONTENT>(EDUCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EDU);
		}
		return eDU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EQLCONTENT> getEQL() {
		if (eQL == null) {
			eQL = new EObjectContainmentEList<EQLCONTENT>(EQLCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQL);
		}
		return eQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EQPCONTENT> getEQP() {
		if (eQP == null) {
			eQP = new EObjectContainmentEList<EQPCONTENT>(EQPCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQP);
		}
		return eQP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EQUCONTENT> getEQU() {
		if (eQU == null) {
			eQU = new EObjectContainmentEList<EQUCONTENT>(EQUCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQU);
		}
		return eQU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERQCONTENT> getERQ() {
		if (eRQ == null) {
			eRQ = new EObjectContainmentEList<ERQCONTENT>(ERQCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ERQ);
		}
		return eRQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERRCONTENT> getERR() {
		if (eRR == null) {
			eRR = new EObjectContainmentEList<ERRCONTENT>(ERRCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ERR);
		}
		return eRR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EVNCONTENT> getEVN() {
		if (eVN == null) {
			eVN = new EObjectContainmentEList<EVNCONTENT>(EVNCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EVN);
		}
		return eVN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FACCONTENT> getFAC() {
		if (fAC == null) {
			fAC = new EObjectContainmentEList<FACCONTENT>(FACCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FAC);
		}
		return fAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FHSCONTENT> getFHS() {
		if (fHS == null) {
			fHS = new EObjectContainmentEList<FHSCONTENT>(FHSCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FHS);
		}
		return fHS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FT1CONTENT> getFT1() {
		if (fT1 == null) {
			fT1 = new EObjectContainmentEList<FT1CONTENT>(FT1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FT1);
		}
		return fT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FTSCONTENT> getFTS() {
		if (fTS == null) {
			fTS = new EObjectContainmentEList<FTSCONTENT>(FTSCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FTS);
		}
		return fTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GOLCONTENT> getGOL() {
		if (gOL == null) {
			gOL = new EObjectContainmentEList<GOLCONTENT>(GOLCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GOL);
		}
		return gOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GP1CONTENT> getGP1() {
		if (gP1 == null) {
			gP1 = new EObjectContainmentEList<GP1CONTENT>(GP1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GP1);
		}
		return gP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GP2CONTENT> getGP2() {
		if (gP2 == null) {
			gP2 = new EObjectContainmentEList<GP2CONTENT>(GP2CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GP2);
		}
		return gP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT1CONTENT> getGT1() {
		if (gT1 == null) {
			gT1 = new EObjectContainmentEList<GT1CONTENT>(GT1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GT1);
		}
		return gT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IAMCONTENT> getIAM() {
		if (iAM == null) {
			iAM = new EObjectContainmentEList<IAMCONTENT>(IAMCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IAM);
		}
		return iAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IIMCONTENT> getIIM() {
		if (iIM == null) {
			iIM = new EObjectContainmentEList<IIMCONTENT>(IIMCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IIM);
		}
		return iIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN1CONTENT> getIN1() {
		if (iN1 == null) {
			iN1 = new EObjectContainmentEList<IN1CONTENT>(IN1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN1);
		}
		return iN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN2CONTENT> getIN2() {
		if (iN2 == null) {
			iN2 = new EObjectContainmentEList<IN2CONTENT>(IN2CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN2);
		}
		return iN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN3CONTENT> getIN3() {
		if (iN3 == null) {
			iN3 = new EObjectContainmentEList<IN3CONTENT>(IN3CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN3);
		}
		return iN3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<INVCONTENT> getINV() {
		if (iNV == null) {
			iNV = new EObjectContainmentEList<INVCONTENT>(INVCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__INV);
		}
		return iNV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IPCCONTENT> getIPC() {
		if (iPC == null) {
			iPC = new EObjectContainmentEList<IPCCONTENT>(IPCCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IPC);
		}
		return iPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISDCONTENT> getISD() {
		if (iSD == null) {
			iSD = new EObjectContainmentEList<ISDCONTENT>(ISDCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ISD);
		}
		return iSD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LANCONTENT> getLAN() {
		if (lAN == null) {
			lAN = new EObjectContainmentEList<LANCONTENT>(LANCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LAN);
		}
		return lAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LCCCONTENT> getLCC() {
		if (lCC == null) {
			lCC = new EObjectContainmentEList<LCCCONTENT>(LCCCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LCC);
		}
		return lCC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LCHCONTENT> getLCH() {
		if (lCH == null) {
			lCH = new EObjectContainmentEList<LCHCONTENT>(LCHCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LCH);
		}
		return lCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LDPCONTENT> getLDP() {
		if (lDP == null) {
			lDP = new EObjectContainmentEList<LDPCONTENT>(LDPCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LDP);
		}
		return lDP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LOCCONTENT> getLOC() {
		if (lOC == null) {
			lOC = new EObjectContainmentEList<LOCCONTENT>(LOCCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LOC);
		}
		return lOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LRLCONTENT> getLRL() {
		if (lRL == null) {
			lRL = new EObjectContainmentEList<LRLCONTENT>(LRLCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LRL);
		}
		return lRL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFACONTENT> getMFA() {
		if (mFA == null) {
			mFA = new EObjectContainmentEList<MFACONTENT>(MFACONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFA);
		}
		return mFA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFECONTENT> getMFE() {
		if (mFE == null) {
			mFE = new EObjectContainmentEList<MFECONTENT>(MFECONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFE);
		}
		return mFE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFICONTENT> getMFI() {
		if (mFI == null) {
			mFI = new EObjectContainmentEList<MFICONTENT>(MFICONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFI);
		}
		return mFI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MRGCONTENT> getMRG() {
		if (mRG == null) {
			mRG = new EObjectContainmentEList<MRGCONTENT>(MRGCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MRG);
		}
		return mRG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MSACONTENT> getMSA() {
		if (mSA == null) {
			mSA = new EObjectContainmentEList<MSACONTENT>(MSACONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MSA);
		}
		return mSA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MSHCONTENT> getMSH() {
		if (mSH == null) {
			mSH = new EObjectContainmentEList<MSHCONTENT>(MSHCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MSH);
		}
		return mSH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NCKCONTENT> getNCK() {
		if (nCK == null) {
			nCK = new EObjectContainmentEList<NCKCONTENT>(NCKCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NCK);
		}
		return nCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NDSCONTENT> getNDS() {
		if (nDS == null) {
			nDS = new EObjectContainmentEList<NDSCONTENT>(NDSCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NDS);
		}
		return nDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK1CONTENT> getNK1() {
		if (nK1 == null) {
			nK1 = new EObjectContainmentEList<NK1CONTENT>(NK1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NK1);
		}
		return nK1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NPUCONTENT> getNPU() {
		if (nPU == null) {
			nPU = new EObjectContainmentEList<NPUCONTENT>(NPUCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NPU);
		}
		return nPU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NSCCONTENT> getNSC() {
		if (nSC == null) {
			nSC = new EObjectContainmentEList<NSCCONTENT>(NSCCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NSC);
		}
		return nSC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NSTCONTENT> getNST() {
		if (nST == null) {
			nST = new EObjectContainmentEList<NSTCONTENT>(NSTCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NST);
		}
		return nST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NTECONTENT> getNTE() {
		if (nTE == null) {
			nTE = new EObjectContainmentEList<NTECONTENT>(NTECONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NTE);
		}
		return nTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBRCONTENT> getOBR() {
		if (oBR == null) {
			oBR = new EObjectContainmentEList<OBRCONTENT>(OBRCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OBR);
		}
		return oBR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBXCONTENT> getOBX() {
		if (oBX == null) {
			oBX = new EObjectContainmentEList<OBXCONTENT>(OBXCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OBX);
		}
		return oBX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODSCONTENT> getODS() {
		if (oDS == null) {
			oDS = new EObjectContainmentEList<ODSCONTENT>(ODSCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ODS);
		}
		return oDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODTCONTENT> getODT() {
		if (oDT == null) {
			oDT = new EObjectContainmentEList<ODTCONTENT>(ODTCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ODT);
		}
		return oDT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM1CONTENT> getOM1() {
		if (oM1 == null) {
			oM1 = new EObjectContainmentEList<OM1CONTENT>(OM1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM1);
		}
		return oM1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM2CONTENT> getOM2() {
		if (oM2 == null) {
			oM2 = new EObjectContainmentEList<OM2CONTENT>(OM2CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM2);
		}
		return oM2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM3CONTENT> getOM3() {
		if (oM3 == null) {
			oM3 = new EObjectContainmentEList<OM3CONTENT>(OM3CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM3);
		}
		return oM3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM4CONTENT> getOM4() {
		if (oM4 == null) {
			oM4 = new EObjectContainmentEList<OM4CONTENT>(OM4CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM4);
		}
		return oM4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM5CONTENT> getOM5() {
		if (oM5 == null) {
			oM5 = new EObjectContainmentEList<OM5CONTENT>(OM5CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM5);
		}
		return oM5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM6CONTENT> getOM6() {
		if (oM6 == null) {
			oM6 = new EObjectContainmentEList<OM6CONTENT>(OM6CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM6);
		}
		return oM6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM7CONTENT> getOM7() {
		if (oM7 == null) {
			oM7 = new EObjectContainmentEList<OM7CONTENT>(OM7CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM7);
		}
		return oM7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORCCONTENT> getORC() {
		if (oRC == null) {
			oRC = new EObjectContainmentEList<ORCCONTENT>(ORCCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ORC);
		}
		return oRC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORGCONTENT> getORG() {
		if (oRG == null) {
			oRG = new EObjectContainmentEList<ORGCONTENT>(ORGCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ORG);
		}
		return oRG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OVRCONTENT> getOVR() {
		if (oVR == null) {
			oVR = new EObjectContainmentEList<OVRCONTENT>(OVRCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OVR);
		}
		return oVR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCRCONTENT> getPCR() {
		if (pCR == null) {
			pCR = new EObjectContainmentEList<PCRCONTENT>(PCRCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PCR);
		}
		return pCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PD1CONTENT> getPD1() {
		if (pD1 == null) {
			pD1 = new EObjectContainmentEList<PD1CONTENT>(PD1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PD1);
		}
		return pD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PDACONTENT> getPDA() {
		if (pDA == null) {
			pDA = new EObjectContainmentEList<PDACONTENT>(PDACONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PDA);
		}
		return pDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PDCCONTENT> getPDC() {
		if (pDC == null) {
			pDC = new EObjectContainmentEList<PDCCONTENT>(PDCCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PDC);
		}
		return pDC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEOCONTENT> getPEO() {
		if (pEO == null) {
			pEO = new EObjectContainmentEList<PEOCONTENT>(PEOCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PEO);
		}
		return pEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PESCONTENT> getPES() {
		if (pES == null) {
			pES = new EObjectContainmentEList<PESCONTENT>(PESCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PES);
		}
		return pES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PIDCONTENT> getPID() {
		if (pID == null) {
			pID = new EObjectContainmentEList<PIDCONTENT>(PIDCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PID);
		}
		return pID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PR1CONTENT> getPR1() {
		if (pR1 == null) {
			pR1 = new EObjectContainmentEList<PR1CONTENT>(PR1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PR1);
		}
		return pR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRACONTENT> getPRA() {
		if (pRA == null) {
			pRA = new EObjectContainmentEList<PRACONTENT>(PRACONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRA);
		}
		return pRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRBCONTENT> getPRB() {
		if (pRB == null) {
			pRB = new EObjectContainmentEList<PRBCONTENT>(PRBCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRB);
		}
		return pRB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRCCONTENT> getPRC() {
		if (pRC == null) {
			pRC = new EObjectContainmentEList<PRCCONTENT>(PRCCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRC);
		}
		return pRC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRDCONTENT> getPRD() {
		if (pRD == null) {
			pRD = new EObjectContainmentEList<PRDCONTENT>(PRDCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRD);
		}
		return pRD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSHCONTENT> getPSH() {
		if (pSH == null) {
			pSH = new EObjectContainmentEList<PSHCONTENT>(PSHCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PSH);
		}
		return pSH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PTHCONTENT> getPTH() {
		if (pTH == null) {
			pTH = new EObjectContainmentEList<PTHCONTENT>(PTHCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PTH);
		}
		return pTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV1CONTENT> getPV1() {
		if (pV1 == null) {
			pV1 = new EObjectContainmentEList<PV1CONTENT>(PV1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PV1);
		}
		return pV1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV2CONTENT> getPV2() {
		if (pV2 == null) {
			pV2 = new EObjectContainmentEList<PV2CONTENT>(PV2CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PV2);
		}
		return pV2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QAKCONTENT> getQAK() {
		if (qAK == null) {
			qAK = new EObjectContainmentEList<QAKCONTENT>(QAKCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QAK);
		}
		return qAK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QIDCONTENT> getQID() {
		if (qID == null) {
			qID = new EObjectContainmentEList<QIDCONTENT>(QIDCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QID);
		}
		return qID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QPDCONTENT> getQPD() {
		if (qPD == null) {
			qPD = new EObjectContainmentEList<QPDCONTENT>(QPDCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QPD);
		}
		return qPD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QRDCONTENT> getQRD() {
		if (qRD == null) {
			qRD = new EObjectContainmentEList<QRDCONTENT>(QRDCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRD);
		}
		return qRD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QRFCONTENT> getQRF() {
		if (qRF == null) {
			qRF = new EObjectContainmentEList<QRFCONTENT>(QRFCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRF);
		}
		return qRF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QRICONTENT> getQRI() {
		if (qRI == null) {
			qRI = new EObjectContainmentEList<QRICONTENT>(QRICONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRI);
		}
		return qRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RCPCONTENT> getRCP() {
		if (rCP == null) {
			rCP = new EObjectContainmentEList<RCPCONTENT>(RCPCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RCP);
		}
		return rCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFCONTENT> getRDF() {
		if (rDF == null) {
			rDF = new EObjectContainmentEList<RDFCONTENT>(RDFCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RDF);
		}
		return rDF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDTCONTENT> getRDT() {
		if (rDT == null) {
			rDT = new EObjectContainmentEList<RDTCONTENT>(RDTCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RDT);
		}
		return rDT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RF1CONTENT> getRF1() {
		if (rF1 == null) {
			rF1 = new EObjectContainmentEList<RF1CONTENT>(RF1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RF1);
		}
		return rF1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RGSCONTENT> getRGS() {
		if (rGS == null) {
			rGS = new EObjectContainmentEList<RGSCONTENT>(RGSCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RGS);
		}
		return rGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RMICONTENT> getRMI() {
		if (rMI == null) {
			rMI = new EObjectContainmentEList<RMICONTENT>(RMICONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RMI);
		}
		return rMI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROLCONTENT> getROL() {
		if (rOL == null) {
			rOL = new EObjectContainmentEList<ROLCONTENT>(ROLCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ROL);
		}
		return rOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RQ1CONTENT> getRQ1() {
		if (rQ1 == null) {
			rQ1 = new EObjectContainmentEList<RQ1CONTENT>(RQ1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RQ1);
		}
		return rQ1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RQDCONTENT> getRQD() {
		if (rQD == null) {
			rQD = new EObjectContainmentEList<RQDCONTENT>(RQDCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RQD);
		}
		return rQD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXACONTENT> getRXA() {
		if (rXA == null) {
			rXA = new EObjectContainmentEList<RXACONTENT>(RXACONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXA);
		}
		return rXA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXCCONTENT> getRXC() {
		if (rXC == null) {
			rXC = new EObjectContainmentEList<RXCCONTENT>(RXCCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXC);
		}
		return rXC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXDCONTENT> getRXD() {
		if (rXD == null) {
			rXD = new EObjectContainmentEList<RXDCONTENT>(RXDCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXD);
		}
		return rXD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXECONTENT> getRXE() {
		if (rXE == null) {
			rXE = new EObjectContainmentEList<RXECONTENT>(RXECONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXE);
		}
		return rXE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXGCONTENT> getRXG() {
		if (rXG == null) {
			rXG = new EObjectContainmentEList<RXGCONTENT>(RXGCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXG);
		}
		return rXG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXOCONTENT> getRXO() {
		if (rXO == null) {
			rXO = new EObjectContainmentEList<RXOCONTENT>(RXOCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXO);
		}
		return rXO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXRCONTENT> getRXR() {
		if (rXR == null) {
			rXR = new EObjectContainmentEList<RXRCONTENT>(RXRCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXR);
		}
		return rXR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SACCONTENT> getSAC() {
		if (sAC == null) {
			sAC = new EObjectContainmentEList<SACCONTENT>(SACCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SAC);
		}
		return sAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SCHCONTENT> getSCH() {
		if (sCH == null) {
			sCH = new EObjectContainmentEList<SCHCONTENT>(SCHCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SCH);
		}
		return sCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFTCONTENT> getSFT() {
		if (sFT == null) {
			sFT = new EObjectContainmentEList<SFTCONTENT>(SFTCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SFT);
		}
		return sFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SIDCONTENT> getSID() {
		if (sID == null) {
			sID = new EObjectContainmentEList<SIDCONTENT>(SIDCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SID);
		}
		return sID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPMCONTENT> getSPM() {
		if (sPM == null) {
			sPM = new EObjectContainmentEList<SPMCONTENT>(SPMCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SPM);
		}
		return sPM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPRCONTENT> getSPR() {
		if (sPR == null) {
			sPR = new EObjectContainmentEList<SPRCONTENT>(SPRCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SPR);
		}
		return sPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STFCONTENT> getSTF() {
		if (sTF == null) {
			sTF = new EObjectContainmentEList<STFCONTENT>(STFCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__STF);
		}
		return sTF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCCCONTENT> getTCC() {
		if (tCC == null) {
			tCC = new EObjectContainmentEList<TCCCONTENT>(TCCCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TCC);
		}
		return tCC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCDCONTENT> getTCD() {
		if (tCD == null) {
			tCD = new EObjectContainmentEList<TCDCONTENT>(TCDCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TCD);
		}
		return tCD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TQ1CONTENT> getTQ1() {
		if (tQ1 == null) {
			tQ1 = new EObjectContainmentEList<TQ1CONTENT>(TQ1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TQ1);
		}
		return tQ1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TQ2CONTENT> getTQ2() {
		if (tQ2 == null) {
			tQ2 = new EObjectContainmentEList<TQ2CONTENT>(TQ2CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TQ2);
		}
		return tQ2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TXACONTENT> getTXA() {
		if (tXA == null) {
			tXA = new EObjectContainmentEList<TXACONTENT>(TXACONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TXA);
		}
		return tXA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB1CONTENT> getUB1() {
		if (uB1 == null) {
			uB1 = new EObjectContainmentEList<UB1CONTENT>(UB1CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__UB1);
		}
		return uB1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB2CONTENT> getUB2() {
		if (uB2 == null) {
			uB2 = new EObjectContainmentEList<UB2CONTENT>(UB2CONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__UB2);
		}
		return uB2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URDCONTENT> getURD() {
		if (uRD == null) {
			uRD = new EObjectContainmentEList<URDCONTENT>(URDCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__URD);
		}
		return uRD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URSCONTENT> getURS() {
		if (uRS == null) {
			uRS = new EObjectContainmentEList<URSCONTENT>(URSCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__URS);
		}
		return uRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VARCONTENT> getVAR() {
		if (vAR == null) {
			vAR = new EObjectContainmentEList<VARCONTENT>(VARCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__VAR);
		}
		return vAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTQCONTENT> getVTQ() {
		if (vTQ == null) {
			vTQ = new EObjectContainmentEList<VTQCONTENT>(VTQCONTENT.class, this, V2xmlPackage.ANY_HL7_SEGMENT_TYPE__VTQ);
		}
		return vTQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ABS:
				return ((InternalEList<?>)getABS()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ACC:
				return ((InternalEList<?>)getACC()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ADD:
				return ((InternalEList<?>)getADD()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AFF:
				return ((InternalEList<?>)getAFF()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIG:
				return ((InternalEList<?>)getAIG()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIL:
				return ((InternalEList<?>)getAIL()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIP:
				return ((InternalEList<?>)getAIP()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIS:
				return ((InternalEList<?>)getAIS()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AL1:
				return ((InternalEList<?>)getAL1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__APR:
				return ((InternalEList<?>)getAPR()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ARQ:
				return ((InternalEList<?>)getARQ()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AUT:
				return ((InternalEList<?>)getAUT()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BHS:
				return ((InternalEList<?>)getBHS()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BLC:
				return ((InternalEList<?>)getBLC()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BLG:
				return ((InternalEList<?>)getBLG()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BPO:
				return ((InternalEList<?>)getBPO()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BPX:
				return ((InternalEList<?>)getBPX()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BTS:
				return ((InternalEList<?>)getBTS()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BTX:
				return ((InternalEList<?>)getBTX()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CDM:
				return ((InternalEList<?>)getCDM()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CER:
				return ((InternalEList<?>)getCER()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM0:
				return ((InternalEList<?>)getCM0()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM1:
				return ((InternalEList<?>)getCM1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM2:
				return ((InternalEList<?>)getCM2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CNS:
				return ((InternalEList<?>)getCNS()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CON:
				return ((InternalEList<?>)getCON()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSP:
				return ((InternalEList<?>)getCSP()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSR:
				return ((InternalEList<?>)getCSR()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSS:
				return ((InternalEList<?>)getCSS()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CTD:
				return ((InternalEList<?>)getCTD()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CTI:
				return ((InternalEList<?>)getCTI()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DB1:
				return ((InternalEList<?>)getDB1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DG1:
				return ((InternalEList<?>)getDG1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DRG:
				return ((InternalEList<?>)getDRG()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DSC:
				return ((InternalEList<?>)getDSC()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DSP:
				return ((InternalEList<?>)getDSP()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ECD:
				return ((InternalEList<?>)getECD()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ECR:
				return ((InternalEList<?>)getECR()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EDU:
				return ((InternalEList<?>)getEDU()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQL:
				return ((InternalEList<?>)getEQL()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQP:
				return ((InternalEList<?>)getEQP()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQU:
				return ((InternalEList<?>)getEQU()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ERQ:
				return ((InternalEList<?>)getERQ()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ERR:
				return ((InternalEList<?>)getERR()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EVN:
				return ((InternalEList<?>)getEVN()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FAC:
				return ((InternalEList<?>)getFAC()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FHS:
				return ((InternalEList<?>)getFHS()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FT1:
				return ((InternalEList<?>)getFT1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FTS:
				return ((InternalEList<?>)getFTS()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GOL:
				return ((InternalEList<?>)getGOL()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GP1:
				return ((InternalEList<?>)getGP1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GP2:
				return ((InternalEList<?>)getGP2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GT1:
				return ((InternalEList<?>)getGT1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IAM:
				return ((InternalEList<?>)getIAM()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IIM:
				return ((InternalEList<?>)getIIM()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN1:
				return ((InternalEList<?>)getIN1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN2:
				return ((InternalEList<?>)getIN2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN3:
				return ((InternalEList<?>)getIN3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__INV:
				return ((InternalEList<?>)getINV()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IPC:
				return ((InternalEList<?>)getIPC()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ISD:
				return ((InternalEList<?>)getISD()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LAN:
				return ((InternalEList<?>)getLAN()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LCC:
				return ((InternalEList<?>)getLCC()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LCH:
				return ((InternalEList<?>)getLCH()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LDP:
				return ((InternalEList<?>)getLDP()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LOC:
				return ((InternalEList<?>)getLOC()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LRL:
				return ((InternalEList<?>)getLRL()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFA:
				return ((InternalEList<?>)getMFA()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFE:
				return ((InternalEList<?>)getMFE()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFI:
				return ((InternalEList<?>)getMFI()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MRG:
				return ((InternalEList<?>)getMRG()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MSA:
				return ((InternalEList<?>)getMSA()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MSH:
				return ((InternalEList<?>)getMSH()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NCK:
				return ((InternalEList<?>)getNCK()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NDS:
				return ((InternalEList<?>)getNDS()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NK1:
				return ((InternalEList<?>)getNK1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NPU:
				return ((InternalEList<?>)getNPU()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NSC:
				return ((InternalEList<?>)getNSC()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NST:
				return ((InternalEList<?>)getNST()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NTE:
				return ((InternalEList<?>)getNTE()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OBR:
				return ((InternalEList<?>)getOBR()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OBX:
				return ((InternalEList<?>)getOBX()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ODS:
				return ((InternalEList<?>)getODS()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ODT:
				return ((InternalEList<?>)getODT()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM1:
				return ((InternalEList<?>)getOM1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM2:
				return ((InternalEList<?>)getOM2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM3:
				return ((InternalEList<?>)getOM3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM4:
				return ((InternalEList<?>)getOM4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM5:
				return ((InternalEList<?>)getOM5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM6:
				return ((InternalEList<?>)getOM6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM7:
				return ((InternalEList<?>)getOM7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ORC:
				return ((InternalEList<?>)getORC()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ORG:
				return ((InternalEList<?>)getORG()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OVR:
				return ((InternalEList<?>)getOVR()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PCR:
				return ((InternalEList<?>)getPCR()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PD1:
				return ((InternalEList<?>)getPD1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PDA:
				return ((InternalEList<?>)getPDA()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PDC:
				return ((InternalEList<?>)getPDC()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PEO:
				return ((InternalEList<?>)getPEO()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PES:
				return ((InternalEList<?>)getPES()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PID:
				return ((InternalEList<?>)getPID()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PR1:
				return ((InternalEList<?>)getPR1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRA:
				return ((InternalEList<?>)getPRA()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRB:
				return ((InternalEList<?>)getPRB()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRC:
				return ((InternalEList<?>)getPRC()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRD:
				return ((InternalEList<?>)getPRD()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PSH:
				return ((InternalEList<?>)getPSH()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PTH:
				return ((InternalEList<?>)getPTH()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PV1:
				return ((InternalEList<?>)getPV1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PV2:
				return ((InternalEList<?>)getPV2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QAK:
				return ((InternalEList<?>)getQAK()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QID:
				return ((InternalEList<?>)getQID()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QPD:
				return ((InternalEList<?>)getQPD()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRD:
				return ((InternalEList<?>)getQRD()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRF:
				return ((InternalEList<?>)getQRF()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRI:
				return ((InternalEList<?>)getQRI()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RCP:
				return ((InternalEList<?>)getRCP()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RDF:
				return ((InternalEList<?>)getRDF()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RDT:
				return ((InternalEList<?>)getRDT()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RF1:
				return ((InternalEList<?>)getRF1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RGS:
				return ((InternalEList<?>)getRGS()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RMI:
				return ((InternalEList<?>)getRMI()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ROL:
				return ((InternalEList<?>)getROL()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RQ1:
				return ((InternalEList<?>)getRQ1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RQD:
				return ((InternalEList<?>)getRQD()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXA:
				return ((InternalEList<?>)getRXA()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXC:
				return ((InternalEList<?>)getRXC()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXD:
				return ((InternalEList<?>)getRXD()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXE:
				return ((InternalEList<?>)getRXE()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXG:
				return ((InternalEList<?>)getRXG()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXO:
				return ((InternalEList<?>)getRXO()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXR:
				return ((InternalEList<?>)getRXR()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SAC:
				return ((InternalEList<?>)getSAC()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SCH:
				return ((InternalEList<?>)getSCH()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SFT:
				return ((InternalEList<?>)getSFT()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SID:
				return ((InternalEList<?>)getSID()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SPM:
				return ((InternalEList<?>)getSPM()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SPR:
				return ((InternalEList<?>)getSPR()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__STF:
				return ((InternalEList<?>)getSTF()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TCC:
				return ((InternalEList<?>)getTCC()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TCD:
				return ((InternalEList<?>)getTCD()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TQ1:
				return ((InternalEList<?>)getTQ1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TQ2:
				return ((InternalEList<?>)getTQ2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TXA:
				return ((InternalEList<?>)getTXA()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__UB1:
				return ((InternalEList<?>)getUB1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__UB2:
				return ((InternalEList<?>)getUB2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__URD:
				return ((InternalEList<?>)getURD()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__URS:
				return ((InternalEList<?>)getURS()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__VAR:
				return ((InternalEList<?>)getVAR()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__VTQ:
				return ((InternalEList<?>)getVTQ()).basicRemove(otherEnd, msgs);
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
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ABS:
				return getABS();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ACC:
				return getACC();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ADD:
				return getADD();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AFF:
				return getAFF();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIG:
				return getAIG();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIL:
				return getAIL();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIP:
				return getAIP();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIS:
				return getAIS();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AL1:
				return getAL1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__APR:
				return getAPR();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ARQ:
				return getARQ();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AUT:
				return getAUT();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BHS:
				return getBHS();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BLC:
				return getBLC();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BLG:
				return getBLG();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BPO:
				return getBPO();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BPX:
				return getBPX();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BTS:
				return getBTS();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BTX:
				return getBTX();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CDM:
				return getCDM();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CER:
				return getCER();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM0:
				return getCM0();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM1:
				return getCM1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM2:
				return getCM2();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CNS:
				return getCNS();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CON:
				return getCON();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSP:
				return getCSP();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSR:
				return getCSR();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSS:
				return getCSS();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CTD:
				return getCTD();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CTI:
				return getCTI();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DB1:
				return getDB1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DG1:
				return getDG1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DRG:
				return getDRG();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DSC:
				return getDSC();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DSP:
				return getDSP();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ECD:
				return getECD();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ECR:
				return getECR();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EDU:
				return getEDU();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQL:
				return getEQL();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQP:
				return getEQP();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQU:
				return getEQU();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ERQ:
				return getERQ();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ERR:
				return getERR();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EVN:
				return getEVN();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FAC:
				return getFAC();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FHS:
				return getFHS();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FT1:
				return getFT1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FTS:
				return getFTS();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GOL:
				return getGOL();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GP1:
				return getGP1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GP2:
				return getGP2();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GT1:
				return getGT1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IAM:
				return getIAM();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IIM:
				return getIIM();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN1:
				return getIN1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN2:
				return getIN2();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN3:
				return getIN3();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__INV:
				return getINV();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IPC:
				return getIPC();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ISD:
				return getISD();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LAN:
				return getLAN();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LCC:
				return getLCC();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LCH:
				return getLCH();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LDP:
				return getLDP();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LOC:
				return getLOC();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LRL:
				return getLRL();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFA:
				return getMFA();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFE:
				return getMFE();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFI:
				return getMFI();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MRG:
				return getMRG();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MSA:
				return getMSA();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MSH:
				return getMSH();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NCK:
				return getNCK();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NDS:
				return getNDS();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NK1:
				return getNK1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NPU:
				return getNPU();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NSC:
				return getNSC();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NST:
				return getNST();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NTE:
				return getNTE();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OBR:
				return getOBR();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OBX:
				return getOBX();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ODS:
				return getODS();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ODT:
				return getODT();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM1:
				return getOM1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM2:
				return getOM2();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM3:
				return getOM3();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM4:
				return getOM4();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM5:
				return getOM5();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM6:
				return getOM6();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM7:
				return getOM7();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ORC:
				return getORC();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ORG:
				return getORG();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OVR:
				return getOVR();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PCR:
				return getPCR();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PD1:
				return getPD1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PDA:
				return getPDA();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PDC:
				return getPDC();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PEO:
				return getPEO();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PES:
				return getPES();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PID:
				return getPID();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PR1:
				return getPR1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRA:
				return getPRA();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRB:
				return getPRB();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRC:
				return getPRC();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRD:
				return getPRD();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PSH:
				return getPSH();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PTH:
				return getPTH();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PV1:
				return getPV1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PV2:
				return getPV2();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QAK:
				return getQAK();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QID:
				return getQID();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QPD:
				return getQPD();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRD:
				return getQRD();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRF:
				return getQRF();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRI:
				return getQRI();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RCP:
				return getRCP();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RDF:
				return getRDF();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RDT:
				return getRDT();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RF1:
				return getRF1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RGS:
				return getRGS();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RMI:
				return getRMI();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ROL:
				return getROL();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RQ1:
				return getRQ1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RQD:
				return getRQD();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXA:
				return getRXA();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXC:
				return getRXC();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXD:
				return getRXD();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXE:
				return getRXE();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXG:
				return getRXG();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXO:
				return getRXO();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXR:
				return getRXR();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SAC:
				return getSAC();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SCH:
				return getSCH();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SFT:
				return getSFT();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SID:
				return getSID();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SPM:
				return getSPM();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SPR:
				return getSPR();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__STF:
				return getSTF();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TCC:
				return getTCC();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TCD:
				return getTCD();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TQ1:
				return getTQ1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TQ2:
				return getTQ2();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TXA:
				return getTXA();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__UB1:
				return getUB1();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__UB2:
				return getUB2();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__URD:
				return getURD();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__URS:
				return getURS();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__VAR:
				return getVAR();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__VTQ:
				return getVTQ();
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
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ABS:
				getABS().clear();
				getABS().addAll((Collection<? extends ABSCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ACC:
				getACC().clear();
				getACC().addAll((Collection<? extends ACCCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ADD:
				getADD().clear();
				getADD().addAll((Collection<? extends ADDCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AFF:
				getAFF().clear();
				getAFF().addAll((Collection<? extends AFFCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIG:
				getAIG().clear();
				getAIG().addAll((Collection<? extends AIGCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIL:
				getAIL().clear();
				getAIL().addAll((Collection<? extends AILCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIP:
				getAIP().clear();
				getAIP().addAll((Collection<? extends AIPCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIS:
				getAIS().clear();
				getAIS().addAll((Collection<? extends AISCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AL1:
				getAL1().clear();
				getAL1().addAll((Collection<? extends AL1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__APR:
				getAPR().clear();
				getAPR().addAll((Collection<? extends APRCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ARQ:
				getARQ().clear();
				getARQ().addAll((Collection<? extends ARQCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AUT:
				getAUT().clear();
				getAUT().addAll((Collection<? extends AUTCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BHS:
				getBHS().clear();
				getBHS().addAll((Collection<? extends BHSCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BLC:
				getBLC().clear();
				getBLC().addAll((Collection<? extends BLCCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BLG:
				getBLG().clear();
				getBLG().addAll((Collection<? extends BLGCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BPO:
				getBPO().clear();
				getBPO().addAll((Collection<? extends BPOCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BPX:
				getBPX().clear();
				getBPX().addAll((Collection<? extends BPXCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BTS:
				getBTS().clear();
				getBTS().addAll((Collection<? extends BTSCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BTX:
				getBTX().clear();
				getBTX().addAll((Collection<? extends BTXCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CDM:
				getCDM().clear();
				getCDM().addAll((Collection<? extends CDMCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CER:
				getCER().clear();
				getCER().addAll((Collection<? extends CERCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM0:
				getCM0().clear();
				getCM0().addAll((Collection<? extends CM0CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM1:
				getCM1().clear();
				getCM1().addAll((Collection<? extends CM1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM2:
				getCM2().clear();
				getCM2().addAll((Collection<? extends CM2CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CNS:
				getCNS().clear();
				getCNS().addAll((Collection<? extends CNSCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CON:
				getCON().clear();
				getCON().addAll((Collection<? extends CONCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSP:
				getCSP().clear();
				getCSP().addAll((Collection<? extends CSPCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSR:
				getCSR().clear();
				getCSR().addAll((Collection<? extends CSRCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSS:
				getCSS().clear();
				getCSS().addAll((Collection<? extends CSSCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CTD:
				getCTD().clear();
				getCTD().addAll((Collection<? extends CTDCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CTI:
				getCTI().clear();
				getCTI().addAll((Collection<? extends CTICONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DB1:
				getDB1().clear();
				getDB1().addAll((Collection<? extends DB1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DG1:
				getDG1().clear();
				getDG1().addAll((Collection<? extends DG1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DRG:
				getDRG().clear();
				getDRG().addAll((Collection<? extends DRGCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DSC:
				getDSC().clear();
				getDSC().addAll((Collection<? extends DSCCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DSP:
				getDSP().clear();
				getDSP().addAll((Collection<? extends DSPCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ECD:
				getECD().clear();
				getECD().addAll((Collection<? extends ECDCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ECR:
				getECR().clear();
				getECR().addAll((Collection<? extends ECRCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EDU:
				getEDU().clear();
				getEDU().addAll((Collection<? extends EDUCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQL:
				getEQL().clear();
				getEQL().addAll((Collection<? extends EQLCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQP:
				getEQP().clear();
				getEQP().addAll((Collection<? extends EQPCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQU:
				getEQU().clear();
				getEQU().addAll((Collection<? extends EQUCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ERQ:
				getERQ().clear();
				getERQ().addAll((Collection<? extends ERQCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ERR:
				getERR().clear();
				getERR().addAll((Collection<? extends ERRCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EVN:
				getEVN().clear();
				getEVN().addAll((Collection<? extends EVNCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FAC:
				getFAC().clear();
				getFAC().addAll((Collection<? extends FACCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FHS:
				getFHS().clear();
				getFHS().addAll((Collection<? extends FHSCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FT1:
				getFT1().clear();
				getFT1().addAll((Collection<? extends FT1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FTS:
				getFTS().clear();
				getFTS().addAll((Collection<? extends FTSCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GOL:
				getGOL().clear();
				getGOL().addAll((Collection<? extends GOLCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GP1:
				getGP1().clear();
				getGP1().addAll((Collection<? extends GP1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GP2:
				getGP2().clear();
				getGP2().addAll((Collection<? extends GP2CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GT1:
				getGT1().clear();
				getGT1().addAll((Collection<? extends GT1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IAM:
				getIAM().clear();
				getIAM().addAll((Collection<? extends IAMCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IIM:
				getIIM().clear();
				getIIM().addAll((Collection<? extends IIMCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN1:
				getIN1().clear();
				getIN1().addAll((Collection<? extends IN1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN2:
				getIN2().clear();
				getIN2().addAll((Collection<? extends IN2CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN3:
				getIN3().clear();
				getIN3().addAll((Collection<? extends IN3CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__INV:
				getINV().clear();
				getINV().addAll((Collection<? extends INVCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IPC:
				getIPC().clear();
				getIPC().addAll((Collection<? extends IPCCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ISD:
				getISD().clear();
				getISD().addAll((Collection<? extends ISDCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LAN:
				getLAN().clear();
				getLAN().addAll((Collection<? extends LANCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LCC:
				getLCC().clear();
				getLCC().addAll((Collection<? extends LCCCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LCH:
				getLCH().clear();
				getLCH().addAll((Collection<? extends LCHCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LDP:
				getLDP().clear();
				getLDP().addAll((Collection<? extends LDPCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LOC:
				getLOC().clear();
				getLOC().addAll((Collection<? extends LOCCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LRL:
				getLRL().clear();
				getLRL().addAll((Collection<? extends LRLCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFA:
				getMFA().clear();
				getMFA().addAll((Collection<? extends MFACONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFE:
				getMFE().clear();
				getMFE().addAll((Collection<? extends MFECONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFI:
				getMFI().clear();
				getMFI().addAll((Collection<? extends MFICONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MRG:
				getMRG().clear();
				getMRG().addAll((Collection<? extends MRGCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MSA:
				getMSA().clear();
				getMSA().addAll((Collection<? extends MSACONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MSH:
				getMSH().clear();
				getMSH().addAll((Collection<? extends MSHCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NCK:
				getNCK().clear();
				getNCK().addAll((Collection<? extends NCKCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NDS:
				getNDS().clear();
				getNDS().addAll((Collection<? extends NDSCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NK1:
				getNK1().clear();
				getNK1().addAll((Collection<? extends NK1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NPU:
				getNPU().clear();
				getNPU().addAll((Collection<? extends NPUCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NSC:
				getNSC().clear();
				getNSC().addAll((Collection<? extends NSCCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NST:
				getNST().clear();
				getNST().addAll((Collection<? extends NSTCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NTE:
				getNTE().clear();
				getNTE().addAll((Collection<? extends NTECONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OBR:
				getOBR().clear();
				getOBR().addAll((Collection<? extends OBRCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OBX:
				getOBX().clear();
				getOBX().addAll((Collection<? extends OBXCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ODS:
				getODS().clear();
				getODS().addAll((Collection<? extends ODSCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ODT:
				getODT().clear();
				getODT().addAll((Collection<? extends ODTCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM1:
				getOM1().clear();
				getOM1().addAll((Collection<? extends OM1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM2:
				getOM2().clear();
				getOM2().addAll((Collection<? extends OM2CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM3:
				getOM3().clear();
				getOM3().addAll((Collection<? extends OM3CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM4:
				getOM4().clear();
				getOM4().addAll((Collection<? extends OM4CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM5:
				getOM5().clear();
				getOM5().addAll((Collection<? extends OM5CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM6:
				getOM6().clear();
				getOM6().addAll((Collection<? extends OM6CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM7:
				getOM7().clear();
				getOM7().addAll((Collection<? extends OM7CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ORC:
				getORC().clear();
				getORC().addAll((Collection<? extends ORCCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ORG:
				getORG().clear();
				getORG().addAll((Collection<? extends ORGCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OVR:
				getOVR().clear();
				getOVR().addAll((Collection<? extends OVRCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PCR:
				getPCR().clear();
				getPCR().addAll((Collection<? extends PCRCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PD1:
				getPD1().clear();
				getPD1().addAll((Collection<? extends PD1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PDA:
				getPDA().clear();
				getPDA().addAll((Collection<? extends PDACONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PDC:
				getPDC().clear();
				getPDC().addAll((Collection<? extends PDCCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PEO:
				getPEO().clear();
				getPEO().addAll((Collection<? extends PEOCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PES:
				getPES().clear();
				getPES().addAll((Collection<? extends PESCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PID:
				getPID().clear();
				getPID().addAll((Collection<? extends PIDCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PR1:
				getPR1().clear();
				getPR1().addAll((Collection<? extends PR1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRA:
				getPRA().clear();
				getPRA().addAll((Collection<? extends PRACONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRB:
				getPRB().clear();
				getPRB().addAll((Collection<? extends PRBCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRC:
				getPRC().clear();
				getPRC().addAll((Collection<? extends PRCCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRD:
				getPRD().clear();
				getPRD().addAll((Collection<? extends PRDCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PSH:
				getPSH().clear();
				getPSH().addAll((Collection<? extends PSHCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PTH:
				getPTH().clear();
				getPTH().addAll((Collection<? extends PTHCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PV1:
				getPV1().clear();
				getPV1().addAll((Collection<? extends PV1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PV2:
				getPV2().clear();
				getPV2().addAll((Collection<? extends PV2CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QAK:
				getQAK().clear();
				getQAK().addAll((Collection<? extends QAKCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QID:
				getQID().clear();
				getQID().addAll((Collection<? extends QIDCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QPD:
				getQPD().clear();
				getQPD().addAll((Collection<? extends QPDCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRD:
				getQRD().clear();
				getQRD().addAll((Collection<? extends QRDCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRF:
				getQRF().clear();
				getQRF().addAll((Collection<? extends QRFCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRI:
				getQRI().clear();
				getQRI().addAll((Collection<? extends QRICONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RCP:
				getRCP().clear();
				getRCP().addAll((Collection<? extends RCPCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RDF:
				getRDF().clear();
				getRDF().addAll((Collection<? extends RDFCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RDT:
				getRDT().clear();
				getRDT().addAll((Collection<? extends RDTCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RF1:
				getRF1().clear();
				getRF1().addAll((Collection<? extends RF1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RGS:
				getRGS().clear();
				getRGS().addAll((Collection<? extends RGSCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RMI:
				getRMI().clear();
				getRMI().addAll((Collection<? extends RMICONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ROL:
				getROL().clear();
				getROL().addAll((Collection<? extends ROLCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RQ1:
				getRQ1().clear();
				getRQ1().addAll((Collection<? extends RQ1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RQD:
				getRQD().clear();
				getRQD().addAll((Collection<? extends RQDCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXA:
				getRXA().clear();
				getRXA().addAll((Collection<? extends RXACONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXC:
				getRXC().clear();
				getRXC().addAll((Collection<? extends RXCCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXD:
				getRXD().clear();
				getRXD().addAll((Collection<? extends RXDCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXE:
				getRXE().clear();
				getRXE().addAll((Collection<? extends RXECONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXG:
				getRXG().clear();
				getRXG().addAll((Collection<? extends RXGCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXO:
				getRXO().clear();
				getRXO().addAll((Collection<? extends RXOCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXR:
				getRXR().clear();
				getRXR().addAll((Collection<? extends RXRCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SAC:
				getSAC().clear();
				getSAC().addAll((Collection<? extends SACCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SCH:
				getSCH().clear();
				getSCH().addAll((Collection<? extends SCHCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SFT:
				getSFT().clear();
				getSFT().addAll((Collection<? extends SFTCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SID:
				getSID().clear();
				getSID().addAll((Collection<? extends SIDCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SPM:
				getSPM().clear();
				getSPM().addAll((Collection<? extends SPMCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SPR:
				getSPR().clear();
				getSPR().addAll((Collection<? extends SPRCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__STF:
				getSTF().clear();
				getSTF().addAll((Collection<? extends STFCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TCC:
				getTCC().clear();
				getTCC().addAll((Collection<? extends TCCCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TCD:
				getTCD().clear();
				getTCD().addAll((Collection<? extends TCDCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TQ1:
				getTQ1().clear();
				getTQ1().addAll((Collection<? extends TQ1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TQ2:
				getTQ2().clear();
				getTQ2().addAll((Collection<? extends TQ2CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TXA:
				getTXA().clear();
				getTXA().addAll((Collection<? extends TXACONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__UB1:
				getUB1().clear();
				getUB1().addAll((Collection<? extends UB1CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__UB2:
				getUB2().clear();
				getUB2().addAll((Collection<? extends UB2CONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__URD:
				getURD().clear();
				getURD().addAll((Collection<? extends URDCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__URS:
				getURS().clear();
				getURS().addAll((Collection<? extends URSCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__VAR:
				getVAR().clear();
				getVAR().addAll((Collection<? extends VARCONTENT>)newValue);
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__VTQ:
				getVTQ().clear();
				getVTQ().addAll((Collection<? extends VTQCONTENT>)newValue);
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
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ABS:
				getABS().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ACC:
				getACC().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ADD:
				getADD().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AFF:
				getAFF().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIG:
				getAIG().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIL:
				getAIL().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIP:
				getAIP().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIS:
				getAIS().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AL1:
				getAL1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__APR:
				getAPR().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ARQ:
				getARQ().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AUT:
				getAUT().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BHS:
				getBHS().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BLC:
				getBLC().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BLG:
				getBLG().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BPO:
				getBPO().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BPX:
				getBPX().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BTS:
				getBTS().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BTX:
				getBTX().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CDM:
				getCDM().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CER:
				getCER().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM0:
				getCM0().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM1:
				getCM1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM2:
				getCM2().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CNS:
				getCNS().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CON:
				getCON().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSP:
				getCSP().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSR:
				getCSR().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSS:
				getCSS().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CTD:
				getCTD().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CTI:
				getCTI().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DB1:
				getDB1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DG1:
				getDG1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DRG:
				getDRG().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DSC:
				getDSC().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DSP:
				getDSP().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ECD:
				getECD().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ECR:
				getECR().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EDU:
				getEDU().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQL:
				getEQL().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQP:
				getEQP().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQU:
				getEQU().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ERQ:
				getERQ().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ERR:
				getERR().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EVN:
				getEVN().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FAC:
				getFAC().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FHS:
				getFHS().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FT1:
				getFT1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FTS:
				getFTS().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GOL:
				getGOL().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GP1:
				getGP1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GP2:
				getGP2().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GT1:
				getGT1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IAM:
				getIAM().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IIM:
				getIIM().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN1:
				getIN1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN2:
				getIN2().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN3:
				getIN3().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__INV:
				getINV().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IPC:
				getIPC().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ISD:
				getISD().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LAN:
				getLAN().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LCC:
				getLCC().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LCH:
				getLCH().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LDP:
				getLDP().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LOC:
				getLOC().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LRL:
				getLRL().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFA:
				getMFA().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFE:
				getMFE().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFI:
				getMFI().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MRG:
				getMRG().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MSA:
				getMSA().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MSH:
				getMSH().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NCK:
				getNCK().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NDS:
				getNDS().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NK1:
				getNK1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NPU:
				getNPU().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NSC:
				getNSC().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NST:
				getNST().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NTE:
				getNTE().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OBR:
				getOBR().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OBX:
				getOBX().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ODS:
				getODS().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ODT:
				getODT().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM1:
				getOM1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM2:
				getOM2().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM3:
				getOM3().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM4:
				getOM4().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM5:
				getOM5().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM6:
				getOM6().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM7:
				getOM7().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ORC:
				getORC().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ORG:
				getORG().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OVR:
				getOVR().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PCR:
				getPCR().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PD1:
				getPD1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PDA:
				getPDA().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PDC:
				getPDC().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PEO:
				getPEO().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PES:
				getPES().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PID:
				getPID().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PR1:
				getPR1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRA:
				getPRA().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRB:
				getPRB().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRC:
				getPRC().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRD:
				getPRD().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PSH:
				getPSH().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PTH:
				getPTH().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PV1:
				getPV1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PV2:
				getPV2().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QAK:
				getQAK().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QID:
				getQID().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QPD:
				getQPD().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRD:
				getQRD().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRF:
				getQRF().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRI:
				getQRI().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RCP:
				getRCP().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RDF:
				getRDF().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RDT:
				getRDT().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RF1:
				getRF1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RGS:
				getRGS().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RMI:
				getRMI().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ROL:
				getROL().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RQ1:
				getRQ1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RQD:
				getRQD().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXA:
				getRXA().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXC:
				getRXC().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXD:
				getRXD().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXE:
				getRXE().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXG:
				getRXG().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXO:
				getRXO().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXR:
				getRXR().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SAC:
				getSAC().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SCH:
				getSCH().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SFT:
				getSFT().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SID:
				getSID().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SPM:
				getSPM().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SPR:
				getSPR().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__STF:
				getSTF().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TCC:
				getTCC().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TCD:
				getTCD().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TQ1:
				getTQ1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TQ2:
				getTQ2().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TXA:
				getTXA().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__UB1:
				getUB1().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__UB2:
				getUB2().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__URD:
				getURD().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__URS:
				getURS().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__VAR:
				getVAR().clear();
				return;
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__VTQ:
				getVTQ().clear();
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
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ABS:
				return aBS != null && !aBS.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ACC:
				return aCC != null && !aCC.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ADD:
				return aDD != null && !aDD.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AFF:
				return aFF != null && !aFF.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIG:
				return aIG != null && !aIG.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIL:
				return aIL != null && !aIL.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIP:
				return aIP != null && !aIP.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AIS:
				return aIS != null && !aIS.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AL1:
				return aL1 != null && !aL1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__APR:
				return aPR != null && !aPR.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ARQ:
				return aRQ != null && !aRQ.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__AUT:
				return aUT != null && !aUT.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BHS:
				return bHS != null && !bHS.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BLC:
				return bLC != null && !bLC.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BLG:
				return bLG != null && !bLG.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BPO:
				return bPO != null && !bPO.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BPX:
				return bPX != null && !bPX.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BTS:
				return bTS != null && !bTS.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__BTX:
				return bTX != null && !bTX.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CDM:
				return cDM != null && !cDM.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CER:
				return cER != null && !cER.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM0:
				return cM0 != null && !cM0.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM1:
				return cM1 != null && !cM1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CM2:
				return cM2 != null && !cM2.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CNS:
				return cNS != null && !cNS.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CON:
				return cON != null && !cON.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSP:
				return cSP != null && !cSP.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSR:
				return cSR != null && !cSR.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CSS:
				return cSS != null && !cSS.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CTD:
				return cTD != null && !cTD.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__CTI:
				return cTI != null && !cTI.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DB1:
				return dB1 != null && !dB1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DG1:
				return dG1 != null && !dG1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DRG:
				return dRG != null && !dRG.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DSC:
				return dSC != null && !dSC.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__DSP:
				return dSP != null && !dSP.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ECD:
				return eCD != null && !eCD.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ECR:
				return eCR != null && !eCR.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EDU:
				return eDU != null && !eDU.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQL:
				return eQL != null && !eQL.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQP:
				return eQP != null && !eQP.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EQU:
				return eQU != null && !eQU.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ERQ:
				return eRQ != null && !eRQ.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ERR:
				return eRR != null && !eRR.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__EVN:
				return eVN != null && !eVN.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FAC:
				return fAC != null && !fAC.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FHS:
				return fHS != null && !fHS.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FT1:
				return fT1 != null && !fT1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__FTS:
				return fTS != null && !fTS.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GOL:
				return gOL != null && !gOL.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GP1:
				return gP1 != null && !gP1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GP2:
				return gP2 != null && !gP2.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__GT1:
				return gT1 != null && !gT1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IAM:
				return iAM != null && !iAM.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IIM:
				return iIM != null && !iIM.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN1:
				return iN1 != null && !iN1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN2:
				return iN2 != null && !iN2.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IN3:
				return iN3 != null && !iN3.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__INV:
				return iNV != null && !iNV.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__IPC:
				return iPC != null && !iPC.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ISD:
				return iSD != null && !iSD.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LAN:
				return lAN != null && !lAN.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LCC:
				return lCC != null && !lCC.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LCH:
				return lCH != null && !lCH.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LDP:
				return lDP != null && !lDP.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LOC:
				return lOC != null && !lOC.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__LRL:
				return lRL != null && !lRL.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFA:
				return mFA != null && !mFA.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFE:
				return mFE != null && !mFE.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MFI:
				return mFI != null && !mFI.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MRG:
				return mRG != null && !mRG.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MSA:
				return mSA != null && !mSA.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__MSH:
				return mSH != null && !mSH.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NCK:
				return nCK != null && !nCK.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NDS:
				return nDS != null && !nDS.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NK1:
				return nK1 != null && !nK1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NPU:
				return nPU != null && !nPU.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NSC:
				return nSC != null && !nSC.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NST:
				return nST != null && !nST.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__NTE:
				return nTE != null && !nTE.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OBR:
				return oBR != null && !oBR.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OBX:
				return oBX != null && !oBX.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ODS:
				return oDS != null && !oDS.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ODT:
				return oDT != null && !oDT.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM1:
				return oM1 != null && !oM1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM2:
				return oM2 != null && !oM2.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM3:
				return oM3 != null && !oM3.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM4:
				return oM4 != null && !oM4.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM5:
				return oM5 != null && !oM5.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM6:
				return oM6 != null && !oM6.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OM7:
				return oM7 != null && !oM7.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ORC:
				return oRC != null && !oRC.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ORG:
				return oRG != null && !oRG.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__OVR:
				return oVR != null && !oVR.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PCR:
				return pCR != null && !pCR.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PD1:
				return pD1 != null && !pD1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PDA:
				return pDA != null && !pDA.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PDC:
				return pDC != null && !pDC.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PEO:
				return pEO != null && !pEO.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PES:
				return pES != null && !pES.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PID:
				return pID != null && !pID.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PR1:
				return pR1 != null && !pR1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRA:
				return pRA != null && !pRA.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRB:
				return pRB != null && !pRB.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRC:
				return pRC != null && !pRC.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PRD:
				return pRD != null && !pRD.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PSH:
				return pSH != null && !pSH.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PTH:
				return pTH != null && !pTH.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PV1:
				return pV1 != null && !pV1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__PV2:
				return pV2 != null && !pV2.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QAK:
				return qAK != null && !qAK.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QID:
				return qID != null && !qID.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QPD:
				return qPD != null && !qPD.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRD:
				return qRD != null && !qRD.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRF:
				return qRF != null && !qRF.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__QRI:
				return qRI != null && !qRI.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RCP:
				return rCP != null && !rCP.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RDF:
				return rDF != null && !rDF.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RDT:
				return rDT != null && !rDT.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RF1:
				return rF1 != null && !rF1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RGS:
				return rGS != null && !rGS.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RMI:
				return rMI != null && !rMI.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__ROL:
				return rOL != null && !rOL.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RQ1:
				return rQ1 != null && !rQ1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RQD:
				return rQD != null && !rQD.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXA:
				return rXA != null && !rXA.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXC:
				return rXC != null && !rXC.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXD:
				return rXD != null && !rXD.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXE:
				return rXE != null && !rXE.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXG:
				return rXG != null && !rXG.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXO:
				return rXO != null && !rXO.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__RXR:
				return rXR != null && !rXR.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SAC:
				return sAC != null && !sAC.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SCH:
				return sCH != null && !sCH.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SFT:
				return sFT != null && !sFT.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SID:
				return sID != null && !sID.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SPM:
				return sPM != null && !sPM.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__SPR:
				return sPR != null && !sPR.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__STF:
				return sTF != null && !sTF.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TCC:
				return tCC != null && !tCC.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TCD:
				return tCD != null && !tCD.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TQ1:
				return tQ1 != null && !tQ1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TQ2:
				return tQ2 != null && !tQ2.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__TXA:
				return tXA != null && !tXA.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__UB1:
				return uB1 != null && !uB1.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__UB2:
				return uB2 != null && !uB2.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__URD:
				return uRD != null && !uRD.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__URS:
				return uRS != null && !uRS.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__VAR:
				return vAR != null && !vAR.isEmpty();
			case V2xmlPackage.ANY_HL7_SEGMENT_TYPE__VTQ:
				return vTQ != null && !vTQ.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnyHL7SegmentTYPEImpl
