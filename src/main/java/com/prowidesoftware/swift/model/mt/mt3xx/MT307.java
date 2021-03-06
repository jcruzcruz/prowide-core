/*******************************************************************************
 * Copyright (c) 2016 Prowide Inc.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as 
 *     published by the Free Software Foundation, either version 3 of the 
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 *     
 *     Check the LGPL at <http://www.gnu.org/licenses/> for more details.
 *******************************************************************************/
package com.prowidesoftware.swift.model.mt.mt3xx;



import com.prowidesoftware.Generated;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.internal.*;
import com.prowidesoftware.swift.internal.SequenceStyle.Type;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.utils.Lib;
import java.io.File;
import java.io.InputStream;
import java.io.IOException;

/**
 * <h1>MT 307 - Advice/Instruction of a Third Party FX Deal</h1>
 * <h3>SWIFT MT307 (ISO 15022) message structure:</h3>
 *
 <div class="scheme"><ul>
<li class="sequence">
Sequence A - General Information (M)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 20
 (M) (repetitive)<ul><li>FieldsetItem 20 C (M)</li><li>FieldsetItem 20 C (O)</li></ul></li><li class="field">Field 23 G (M)</li>
<li class="fieldset">
Fieldset 22
 (M) (repetitive)<ul><li>FieldsetItem 22 H (M)</li><li>FieldsetItem 22 H (O)</li><li>FieldsetItem 22 H (O)</li><li>FieldsetItem 22 H (O)</li><li>FieldsetItem 22 F (O)</li></ul></li><li class="sequence">
Sequence A1 - Linkages (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 13 A,B (O)</li>
<li class="field">Field 20 C (M)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence B - FX Details (M)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 98
 (M)<ul><li>FieldsetItem 98 A (M)</li><li>FieldsetItem 98 A (M)</li></ul></li><li class="field">Field 92 B (M)</li>
<li class="sequence">
Sequence B1 - FX Parties 1 (M)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 95 P,Q,R (M)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence B2 - FX Parties 2 (M)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 95 P,Q,R (O)</li>
<li class="field">Field 97 A (M)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence B3 - Settlement Details (M) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 19 B (M)</li>
<li class="sequence">
Sequence B3a - Cash Parties (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 95 P,Q,R (O)</li>
<li class="field">Field 97 A (O)</li>
<li class="field">Field 70 C (O)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence C - Accounting Information (O)<ul><li class="field">Field 16 R (M)</li>
<li class="sequence">
Sequence C1 - Linkages (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 13 A,B (O)</li>
<li class="field">Field 20 C (M)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="field">Field 22 H (M)</li>
<li class="field">Field 19 B (M)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence D - Net Amount to be settled (O)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 22 H (M)</li>
<li class="field">Field 19 B (M)</li>
<li class="sequence">
Sequence D1 - Cash Parties (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 95 P,Q,R (M)</li>
<li class="field">Field 97 A (O)</li>
<li class="field">Field 70 C (O)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="field">Field 16 S (M)</li>
</ul></li>
</ul></div>

 <style>
.scheme, .scheme ul, .scheme li {
     position: relative;
}
.scheme ul {
    list-style: none;
    padding-left: 32px;
}
.scheme li::before, .scheme li::after {
    content: "";
    position: absolute;
    left: -12px;
}
.scheme li::before {
    border-top: 1px solid #000;
    top: 9px;
    width: 8px;
    height: 0;
}
.scheme li::after {
    border-left: 1px solid #000;
    height: 100%;
    width: 0px;
    top: 2px;
}
.scheme ul > li:last-child::after {
    height: 8px;
}</style>

 *
 * <p>This source code is specific to release <strong>SRU 2016</strong></p> 
 * <p>For additional resources check <a href="http://www.prowidesoftware.com/resources">http://www.prowidesoftware.com/resources</a></p>
 *
 * @author www.prowidesoftware.com
 */
@Generated
public class MT307 extends AbstractMT implements Serializable {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2016;
	private static final long serialVersionUID = 1L;
	private static final transient java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT307.class.getName());
	
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "307";
	
// begin qualifiers constants	

	/**
	* Constant for qualifier with value ACCOUNT 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsA.ACCOUNT
	* @see com.prowidesoftware.swift.SchemeConstantsA#ACCOUNT
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String ACCOUNT = "ACCOUNT";

	/**
	* Constant for qualifier with value ACCW 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsA.ACCW
	* @see com.prowidesoftware.swift.SchemeConstantsA#ACCW
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String ACCW = "ACCW";

	/**
	* Constant for qualifier with value ANTO 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsA.ANTO
	* @see com.prowidesoftware.swift.SchemeConstantsA#ANTO
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String ANTO = "ANTO";

	/**
	* Constant for qualifier with value APER 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsA.APER
	* @see com.prowidesoftware.swift.SchemeConstantsA#APER
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String APER = "APER";

	/**
	* Constant for qualifier with value BENM 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsB.BENM
	* @see com.prowidesoftware.swift.SchemeConstantsB#BENM
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String BENM = "BENM";

	/**
	* Constant for qualifier with value BUYE 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsB.BUYE
	* @see com.prowidesoftware.swift.SchemeConstantsB#BUYE
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String BUYE = "BUYE";

	/**
	* Constant for qualifier with value CANC 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsC.CANC
	* @see com.prowidesoftware.swift.SchemeConstantsC#CANC
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String CANC = "CANC";

	/**
	* Constant for qualifier with value CASH 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsC.CASH
	* @see com.prowidesoftware.swift.SchemeConstantsC#CASH
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String CASH = "CASH";

	/**
	* Constant for qualifier with value CDEA 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsC.CDEA
	* @see com.prowidesoftware.swift.SchemeConstantsC#CDEA
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String CDEA = "CDEA";

	/**
	* Constant for qualifier with value CODU 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsC.CODU
	* @see com.prowidesoftware.swift.SchemeConstantsC#CODU
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String CODU = "CODU";

	/**
	* Constant for qualifier with value COPY 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsC.COPY
	* @see com.prowidesoftware.swift.SchemeConstantsC#COPY
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String COPY = "COPY";

	/**
	* Constant for qualifier with value CRTR 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsC.CRTR
	* @see com.prowidesoftware.swift.SchemeConstantsC#CRTR
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String CRTR = "CRTR";

	/**
	* Constant for qualifier with value CSHPRTY 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsC.CSHPRTY
	* @see com.prowidesoftware.swift.SchemeConstantsC#CSHPRTY
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String CSHPRTY = "CSHPRTY";

	/**
	* Constant for qualifier with value DUPL 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsD.DUPL
	* @see com.prowidesoftware.swift.SchemeConstantsD#DUPL
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String DUPL = "DUPL";

	/**
	* Constant for qualifier with value EXCH 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsE.EXCH
	* @see com.prowidesoftware.swift.SchemeConstantsE#EXCH
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String EXCH = "EXCH";

	/**
	* Constant for qualifier with value FXCO 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsF.FXCO
	* @see com.prowidesoftware.swift.SchemeConstantsF#FXCO
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String FXCO = "FXCO";

	/**
	* Constant for qualifier with value FXCR 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsF.FXCR
	* @see com.prowidesoftware.swift.SchemeConstantsF#FXCR
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String FXCR = "FXCR";

	/**
	* Constant for qualifier with value FXDET 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsF.FXDET
	* @see com.prowidesoftware.swift.SchemeConstantsF#FXDET
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String FXDET = "FXDET";

	/**
	* Constant for qualifier with value FXPRTY1 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsF.FXPRTY1
	* @see com.prowidesoftware.swift.SchemeConstantsF#FXPRTY1
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String FXPRTY1 = "FXPRTY1";

	/**
	* Constant for qualifier with value FXPRTY2 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsF.FXPRTY2
	* @see com.prowidesoftware.swift.SchemeConstantsF#FXPRTY2
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String FXPRTY2 = "FXPRTY2";

	/**
	* Constant for qualifier with value FXSETDET 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsF.FXSETDET
	* @see com.prowidesoftware.swift.SchemeConstantsF#FXSETDET
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String FXSETDET = "FXSETDET";

	/**
	* Constant for qualifier with value GALO 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsG.GALO
	* @see com.prowidesoftware.swift.SchemeConstantsG#GALO
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String GALO = "GALO";

	/**
	* Constant for qualifier with value GENL 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsG.GENL
	* @see com.prowidesoftware.swift.SchemeConstantsG#GENL
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String GENL = "GENL";

	/**
	* Constant for qualifier with value INTE 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsI.INTE
	* @see com.prowidesoftware.swift.SchemeConstantsI#INTE
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String INTE = "INTE";

	/**
	* Constant for qualifier with value INVE 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsI.INVE
	* @see com.prowidesoftware.swift.SchemeConstantsI#INVE
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String INVE = "INVE";

	/**
	* Constant for qualifier with value LINK 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsL.LINK
	* @see com.prowidesoftware.swift.SchemeConstantsL#LINK
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String LINK = "LINK";

	/**
	* Constant for qualifier with value NEGR 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsN.NEGR
	* @see com.prowidesoftware.swift.SchemeConstantsN#NEGR
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String NEGR = "NEGR";

	/**
	* Constant for qualifier with value NET 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsN.NET
	* @see com.prowidesoftware.swift.SchemeConstantsN#NET
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String NET = "NET";

	/**
	* Constant for qualifier with value NEWM 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsN.NEWM
	* @see com.prowidesoftware.swift.SchemeConstantsN#NEWM
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String NEWM = "NEWM";

	/**
	* Constant for qualifier with value PACO 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsP.PACO
	* @see com.prowidesoftware.swift.SchemeConstantsP#PACO
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String PACO = "PACO";

	/**
	* Constant for qualifier with value PAFI 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsP.PAFI
	* @see com.prowidesoftware.swift.SchemeConstantsP#PAFI
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String PAFI = "PAFI";

	/**
	* Constant for qualifier with value PREV 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsP.PREV
	* @see com.prowidesoftware.swift.SchemeConstantsP#PREV
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String PREV = "PREV";

	/**
	* Constant for qualifier with value RELA 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsR.RELA
	* @see com.prowidesoftware.swift.SchemeConstantsR#RELA
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String RELA = "RELA";

	/**
	* Constant for qualifier with value SAFE 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsS.SAFE
	* @see com.prowidesoftware.swift.SchemeConstantsS#SAFE
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String SAFE = "SAFE";

	/**
	* Constant for qualifier with value SELL 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsS.SELL
	* @see com.prowidesoftware.swift.SchemeConstantsS#SELL
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String SELL = "SELL";

	/**
	* Constant for qualifier with value SEME 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsS.SEME
	* @see com.prowidesoftware.swift.SchemeConstantsS#SEME
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String SEME = "SEME";

	/**
	* Constant for qualifier with value TRAD 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsT.TRAD
	* @see com.prowidesoftware.swift.SchemeConstantsT#TRAD
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String TRAD = "TRAD";

	/**
	* Constant for qualifier with value VALU 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsV.VALU
	* @see com.prowidesoftware.swift.SchemeConstantsV#VALU
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String VALU = "VALU";

// end qualifiers constants	

	/**
	 * Creates an MT307 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT307 content
	 */
	public MT307(SwiftMessage m) {
		super(m);
		sanityCheck(m);
	}

	/**
	 * Creates an MT307 initialized with the parameter MtSwiftMessage.
	 * @param m swift message with the MT307 content, the parameter can not be <code>null</code>
	 * @see #MT307(String)
	 */
	public MT307(MtSwiftMessage m) {
		this();
		super.m = super.getSwiftMessageNotNullOrException();
		sanityCheck(super.m);
	}
	
	/**
	 * Creates an MT307 initialized with the parameter MtSwiftMessage.
	 *
	 * @param m swift message with the MT307 content
	 * @return the created object or <code>null</code> if the parameter is <code>null</code>
	 * @see #MT307(String)
	 * @since 7.7
	 */
	public static MT307 parse(MtSwiftMessage m) {
		if (m == null) {
			return null;
		}
		return new MT307(m.message());
	}
	
	/**
	 * Creates and initializes a new MT307 input message setting TEST BICS as sender and receiver.<br />
	 * All mandatory header attributes are completed with default values.
	 *
	 * @since 7.6
	 */
	public MT307() {
		this(BIC.TEST8, BIC.TEST8);
	}
	
	/**
	 * Creates and initializes a new MT307 input message from sender to receiver.<br />
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.7
	 */
	public MT307(final String sender, final String receiver) {
		super(307, sender, receiver);
	}
	
	/**
	* <em>DO NOT USE THIS METHOD</em>
	* It is kept for compatibility but will be removed very soon, since the
	* <code>messageType</code> parameter is actually ignored.
	* 
	* @see #MT307(String, String)
	* @deprecated Use instead <code>new MT307(sender, receiver)</code> instead
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public MT307(final int messageType, final String sender, final String receiver) {
		super(307, sender, receiver);
		com.prowidesoftware.deprecation.DeprecationUtils.phase2(getClass(), "MT307(int, String, String)", "Use the constructor MT307(sender, receiver) instead.");
	}
	
	/**
	 * Creates a new MT307 by parsing a String with the message content in its swift FIN format.<br />
	 * If the fin parameter is null or the message cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the string contains multiple messages, only the first one will be parsed.
	 *
	 * @param fin a string with the MT message in its FIN swift format
	 * @since 7.7
	 */
	public MT307(final String fin) {
		super();
		if (fin != null) {
			final SwiftMessage parsed = read(fin);
			if (parsed != null) {
				super.m = parsed;
				sanityCheck(parsed);
			}
		}
    }
    
    private void sanityCheck(final SwiftMessage param) {
    	if (param.isServiceMessage()) {
			log.warning("Creating an MT307 object from FIN content with a Service Message. Check if the MT307 you are intended to read is prepended with and ACK.");
		} else if (!StringUtils.equals(param.getType(), getMessageType())) {
			log.warning("Creating an MT307 object from FIN content with message type "+param.getType());
		}
    }
	
	/**
	 * Creates a new MT307 by parsing a String with the message content in its swift FIN format.<br />
	 * If the fin parameter cannot be parsed, the returned MT307 will have its internal message object
	 * initialized (blocks will be created) but empty.<br />
	 * If the string contains multiple messages, only the first one will be parsed. 
	 *
	 * @param fin a string with the MT message in its FIN swift format. <em>fin may be <code>null</code> in which case this method returns null</em>
	 * @return a new instance of MT307 or null if fin is null 
	 * @since 7.7
	 */
	public static MT307 parse(final String fin) {
		if (fin == null) {
			return null;
		}
		return new MT307(fin);
    }
    
    /**
	 * Creates a new MT307 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br />
	 * If the message content is null or cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @since 7.7
	 */
	public MT307(final InputStream stream) throws IOException {
		this(Lib.readStream(stream));
    }
    
    /**
	 * Creates a new MT307 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br />
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @return a new instance of MT307 or null if stream is null or the message cannot be parsed 
	 * @since 7.7
	 */
	public static MT307 parse(final InputStream stream) throws IOException {
		if (stream == null) {
			return null;
		}
		return new MT307(stream);
    }
    
    /**
	 * Creates a new MT307 by parsing a file with the message content in its swift FIN format.<br />
	 * If the file content is null or cannot be parsed as a message, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @since 7.7
	 */
	public MT307(final File file) throws IOException {
		this(Lib.readFile(file));
    }
    
    /**
	 * Creates a new MT307 by parsing a file with the message content in its swift FIN format.<br />
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @return a new instance of MT307 or null if; file is null, does not exist, can't be read, is not a file or the message cannot be parsed
	 * @since 7.7
	 */
	public static MT307 parse(final File file) throws IOException {
		if (file == null) {
			return null;
		}
		return new MT307(file);
    }
    
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "307";
	}
	
	/**
	 * Add all tags from block to the end of the block4.
	 *
	 * @param block to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT307 append(final SwiftTagListBlock block) {
		super.append(block);
		return this;
	}
	
	/**
	 * Add all tags to the end of the block4.
	 *
	 * @param tags to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT307 append(final Tag ... tags) {
		super.append(tags);
		return this;
	}
	
	/**
	 * Add all the fields to the end of the block4.
	 *
	 * @param fields to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT307 append(final Field ... fields) {
		super.append(fields);
		return this;
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 23G, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 23G at MT307 is expected to be the only one.
	 * 
	 * @return a Field23G object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field23G getField23G() {
		final Tag t = tag("23G");
		if (t != null) {
			return new Field23G(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 92B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 92B at MT307 is expected to be the only one.
	 * 
	 * @return a Field92B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field92B getField92B() {
		final Tag t = tag("92B");
		if (t != null) {
			return new Field92B(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 20C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 20C at MT307 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field20C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field20C> getField20C() {
		final List<Field20C> result = new ArrayList<Field20C>();
		final Tag[] tags = tags("20C");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field20C(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22F at MT307 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22F> getField22F() {
		final List<Field22F> result = new ArrayList<Field22F>();
		final Tag[] tags = tags("22F");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field22F(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22H, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22H at MT307 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22H objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22H> getField22H() {
		final List<Field22H> result = new ArrayList<Field22H>();
		final Tag[] tags = tags("22H");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field22H(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 16R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 16R at MT307 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field16R objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field16R> getField16R() {
		final List<Field16R> result = new ArrayList<Field16R>();
		final Tag[] tags = tags("16R");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field16R(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 13A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 13A at MT307 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field13A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field13A> getField13A() {
		final List<Field13A> result = new ArrayList<Field13A>();
		final Tag[] tags = tags("13A");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field13A(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 13B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 13B at MT307 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field13B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field13B> getField13B() {
		final List<Field13B> result = new ArrayList<Field13B>();
		final Tag[] tags = tags("13B");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field13B(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 16S, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 16S at MT307 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field16S objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field16S> getField16S() {
		final List<Field16S> result = new ArrayList<Field16S>();
		final Tag[] tags = tags("16S");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field16S(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 98A at MT307 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98A> getField98A() {
		final List<Field98A> result = new ArrayList<Field98A>();
		final Tag[] tags = tags("98A");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field98A(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95P, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95P at MT307 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95P objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95P> getField95P() {
		final List<Field95P> result = new ArrayList<Field95P>();
		final Tag[] tags = tags("95P");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field95P(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95Q, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95Q at MT307 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95Q objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95Q> getField95Q() {
		final List<Field95Q> result = new ArrayList<Field95Q>();
		final Tag[] tags = tags("95Q");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field95Q(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95R at MT307 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95R objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95R> getField95R() {
		final List<Field95R> result = new ArrayList<Field95R>();
		final Tag[] tags = tags("95R");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field95R(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 19B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 19B at MT307 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field19B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field19B> getField19B() {
		final List<Field19B> result = new ArrayList<Field19B>();
		final Tag[] tags = tags("19B");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field19B(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 97A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 97A at MT307 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field97A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field97A> getField97A() {
		final List<Field97A> result = new ArrayList<Field97A>();
		final Tag[] tags = tags("97A");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field97A(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 70C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 70C at MT307 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field70C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field70C> getField70C() {
		final List<Field70C> result = new ArrayList<Field70C>();
		final Tag[] tags = tags("70C");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field70C(tags[i].getValue()));
		}
		return result;
	}
	

// BaseSequenceCodeGenerator [seq=A]
	/**
	* Class for Sequence "A" of MT 307
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceA extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceA() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceA(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>GENL</em>
		*/
		public static final String START_END_16RS = "GENL";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceA newInstance(final Tag ... tags) {
			final SequenceA result = new SequenceA();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}

			result.append(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceA newInstance() {
			final SequenceA result = new SequenceA();

			result.append(START_TAG);
			
			result.append(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceA newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceA result = new SequenceA();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.append(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceA(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}
	}
	/**
	* Get the single occurrence of SequenceA delimited by 16R/16S the value of SequenceA#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceA</code> is returned</em>
	* @see SequenceA#START_END_16RS
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceA getSequenceA() {
		return new SequenceA(super.getSwiftMessageNotNullOrException());
	}
	
	/**
	* Get the single occurrence of SequenceA delimited by 16R/16S the value of SequenceA#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceA</code> is returned</em>  
	* @see SequenceA#START_END_16RS
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceA within the complete message
	* @since 7.7
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public static SequenceA getSequenceA(SwiftTagListBlock parentSequence) {
		final SequenceA s = new SequenceA();
		s.setTags(parentSequence.getSubBlock(SequenceA.START_END_16RS).getTags());
		return s;
	}
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=A1]
	/**
	* Class for Sequence "A1" of MT 307
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
	public static class SequenceA1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceA1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceA1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>LINK</em>
		*/
		public static final String START_END_16RS = "LINK";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceA1 newInstance(final Tag ... tags) {
			final SequenceA1 result = new SequenceA1();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}

			result.append(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceA1 newInstance() {
			final SequenceA1 result = new SequenceA1();

			result.append(START_TAG);
			
			result.append(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceA1 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceA1 result = new SequenceA1();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.append(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceA1(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}
	}

	/**
	* Get the list of SequenceA1 delimited by 16R/16S with value specified in SequenceA1#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
    *
    * <div><em><b>This sequence does not have a unique 16R/S delimiter. In order to be uniquely identified it must be
    * present inside it&apos;s parent sequences</em></b>
    * </div>
    *
    * @see com.prowidesoftware.swift.model.mt.SequenceUtils
     *
	* @see SequenceA1#START_END_16RS 
	*/
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceA1> getSequenceA1List() {
  	   /*
		* The delimiter LINK is not unique across all sequences, in this MT.
		* The usual generated API for accessing this can not be used for sequence A1.
		* So we call a special method to resolve this situation until we find a better approach.
		*
		*/
		if (this.getSwiftMessage() == null) {
			return null;
		}
		return com.prowidesoftware.swift.model.mt.SequenceUtils.resolveMT307GetSequenceA1List_sru2016(this);
	}
	/**
	* Get the list of SequenceA1 delimited by 16R/16S with value specified in SequenceA1#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
    *
    * <div><em><b>This sequence does not have a unique 16R/S delimiter. In order to be uniquely identified it must be
    * present inside it&apos;s parent sequences</em></b>
    * </div>
    *
    * @see com.prowidesoftware.swift.model.mt.SequenceUtils
     *
	* @see SequenceA1#START_END_16RS 
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceA1 within the complete message
	* @since 7.7
	*/
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceA1> getSequenceA1List(final SwiftTagListBlock parentSequence) {
  		/*
		* The delimiter LINK is not unique across all sequences, in this MT.
		* The usual generated API for accessing this can not be used for sequence A1.
		* So we call a special method to resolve this situation until we find a better approach.
		*
		*/
		return com.prowidesoftware.swift.model.mt.SequenceUtils.resolveMT307GetSequenceA1List_sru2016(new MT307().append(parentSequence));

	} 	
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=B]
	/**
	* Class for Sequence "B" of MT 307
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceB extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>FXDET</em>
		*/
		public static final String START_END_16RS = "FXDET";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceB newInstance(final Tag ... tags) {
			final SequenceB result = new SequenceB();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}

			result.append(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceB newInstance() {
			final SequenceB result = new SequenceB();

			result.append(START_TAG);
			
			result.append(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceB newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceB result = new SequenceB();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.append(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceB(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}
	}
	/**
	* Get the single occurrence of SequenceB delimited by 16R/16S the value of SequenceB#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceB</code> is returned</em>
	* @see SequenceB#START_END_16RS
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceB getSequenceB() {
		return new SequenceB(super.getSwiftMessageNotNullOrException());
	}
	
	/**
	* Get the single occurrence of SequenceB delimited by 16R/16S the value of SequenceB#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceB</code> is returned</em>  
	* @see SequenceB#START_END_16RS
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceB within the complete message
	* @since 7.7
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public static SequenceB getSequenceB(SwiftTagListBlock parentSequence) {
		final SequenceB s = new SequenceB();
		s.setTags(parentSequence.getSubBlock(SequenceB.START_END_16RS).getTags());
		return s;
	}
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=B1]
	/**
	* Class for Sequence "B1" of MT 307
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceB1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>FXPRTY1</em>
		*/
		public static final String START_END_16RS = "FXPRTY1";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceB1 newInstance(final Tag ... tags) {
			final SequenceB1 result = new SequenceB1();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}

			result.append(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceB1 newInstance() {
			final SequenceB1 result = new SequenceB1();

			result.append(START_TAG);
			
			result.append(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceB1 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceB1 result = new SequenceB1();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.append(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceB1(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}
	}
	/**
	* Get the single occurrence of SequenceB1 delimited by 16R/16S the value of SequenceB1#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceB1</code> is returned</em>
	* @see SequenceB1#START_END_16RS
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceB1 getSequenceB1() {
		return new SequenceB1(super.getSwiftMessageNotNullOrException());
	}
	
	/**
	* Get the single occurrence of SequenceB1 delimited by 16R/16S the value of SequenceB1#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceB1</code> is returned</em>  
	* @see SequenceB1#START_END_16RS
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceB1 within the complete message
	* @since 7.7
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public static SequenceB1 getSequenceB1(SwiftTagListBlock parentSequence) {
		final SequenceB1 s = new SequenceB1();
		s.setTags(parentSequence.getSubBlock(SequenceB1.START_END_16RS).getTags());
		return s;
	}
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=B2]
	/**
	* Class for Sequence "B2" of MT 307
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceB2 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB2() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB2(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>FXPRTY2</em>
		*/
		public static final String START_END_16RS = "FXPRTY2";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceB2 newInstance(final Tag ... tags) {
			final SequenceB2 result = new SequenceB2();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}

			result.append(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceB2 newInstance() {
			final SequenceB2 result = new SequenceB2();

			result.append(START_TAG);
			
			result.append(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceB2 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceB2 result = new SequenceB2();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.append(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceB2(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}
	}
	/**
	* Get the single occurrence of SequenceB2 delimited by 16R/16S the value of SequenceB2#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceB2</code> is returned</em>
	* @see SequenceB2#START_END_16RS
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceB2 getSequenceB2() {
		return new SequenceB2(super.getSwiftMessageNotNullOrException());
	}
	
	/**
	* Get the single occurrence of SequenceB2 delimited by 16R/16S the value of SequenceB2#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceB2</code> is returned</em>  
	* @see SequenceB2#START_END_16RS
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceB2 within the complete message
	* @since 7.7
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public static SequenceB2 getSequenceB2(SwiftTagListBlock parentSequence) {
		final SequenceB2 s = new SequenceB2();
		s.setTags(parentSequence.getSubBlock(SequenceB2.START_END_16RS).getTags());
		return s;
	}
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=B3]
	/**
	* Class for Sequence "B3" of MT 307
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceB3 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB3() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB3(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>FXSETDET</em>
		*/
		public static final String START_END_16RS = "FXSETDET";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceB3 newInstance(final Tag ... tags) {
			final SequenceB3 result = new SequenceB3();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}

			result.append(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceB3 newInstance() {
			final SequenceB3 result = new SequenceB3();

			result.append(START_TAG);
			
			result.append(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceB3 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceB3 result = new SequenceB3();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.append(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceB3(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}
	}

	/**
	* Get the list of SequenceB3 delimited by 16R/16S with value specified in SequenceB3#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SequenceB3#START_END_16RS 
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceB3> getSequenceB3List() {
		return getSequenceB3List(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	/**
	* Get the list of SequenceB3 delimited by 16R/16S with value specified in SequenceB3#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SequenceB3#START_END_16RS 
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceB3 within the complete message
	* @since 7.7
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceB3> getSequenceB3List(final SwiftTagListBlock parentSequence) {
		final List<SwiftTagListBlock> blocks = parentSequence.getSubBlocks(SequenceB3.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceB3> result = new ArrayList<SequenceB3>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				final SequenceB3 s = new SequenceB3();
				s.setTags(b.getSubBlock(SequenceB3.START_END_16RS).getTags());
				result.add(s);
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();

	} 	
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=B3a]
	/**
	* Class for Sequence "B3a" of MT 307
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
	public static class SequenceB3a extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB3a() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB3a(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>CSHPRTY</em>
		*/
		public static final String START_END_16RS = "CSHPRTY";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceB3a newInstance(final Tag ... tags) {
			final SequenceB3a result = new SequenceB3a();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}

			result.append(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceB3a newInstance() {
			final SequenceB3a result = new SequenceB3a();

			result.append(START_TAG);
			
			result.append(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceB3a newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceB3a result = new SequenceB3a();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.append(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceB3a(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}
	}

	/**
	* Get the list of SequenceB3a delimited by 16R/16S with value specified in SequenceB3a#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
    *
    * <div><em><b>This sequence does not have a unique 16R/S delimiter. In order to be uniquely identified it must be
    * present inside it&apos;s parent sequences</em></b>
    * </div>
    *
    * @see com.prowidesoftware.swift.model.mt.SequenceUtils
     *
	* @see SequenceB3a#START_END_16RS 
	*/
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceB3a> getSequenceB3aList() {
  	   /*
		* The delimiter CSHPRTY is not unique across all sequences, in this MT.
		* The usual generated API for accessing this can not be used for sequence B3a.
		* So we call a special method to resolve this situation until we find a better approach.
		*
		*/
		if (this.getSwiftMessage() == null) {
			return null;
		}
		return com.prowidesoftware.swift.model.mt.SequenceUtils.resolveMT307GetSequenceB3aList_sru2016(this);
	}
	/**
	* Get the list of SequenceB3a delimited by 16R/16S with value specified in SequenceB3a#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
    *
    * <div><em><b>This sequence does not have a unique 16R/S delimiter. In order to be uniquely identified it must be
    * present inside it&apos;s parent sequences</em></b>
    * </div>
    *
    * @see com.prowidesoftware.swift.model.mt.SequenceUtils
     *
	* @see SequenceB3a#START_END_16RS 
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceB3a within the complete message
	* @since 7.7
	*/
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceB3a> getSequenceB3aList(final SwiftTagListBlock parentSequence) {
  		/*
		* The delimiter CSHPRTY is not unique across all sequences, in this MT.
		* The usual generated API for accessing this can not be used for sequence B3a.
		* So we call a special method to resolve this situation until we find a better approach.
		*
		*/
		return com.prowidesoftware.swift.model.mt.SequenceUtils.resolveMT307GetSequenceB3aList_sru2016(new MT307().append(parentSequence));

	} 	
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=C]
	/**
	* Class for Sequence "C" of MT 307
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceC extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceC() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceC(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>ACCOUNT</em>
		*/
		public static final String START_END_16RS = "ACCOUNT";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceC newInstance(final Tag ... tags) {
			final SequenceC result = new SequenceC();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}

			result.append(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceC newInstance() {
			final SequenceC result = new SequenceC();

			result.append(START_TAG);
			
			result.append(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceC newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceC result = new SequenceC();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.append(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceC(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}
	}
	/**
	* Get the single occurrence of SequenceC delimited by 16R/16S the value of SequenceC#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceC</code> is returned</em>
	* @see SequenceC#START_END_16RS
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceC getSequenceC() {
		return new SequenceC(super.getSwiftMessageNotNullOrException());
	}
	
	/**
	* Get the single occurrence of SequenceC delimited by 16R/16S the value of SequenceC#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceC</code> is returned</em>  
	* @see SequenceC#START_END_16RS
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceC within the complete message
	* @since 7.7
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public static SequenceC getSequenceC(SwiftTagListBlock parentSequence) {
		final SequenceC s = new SequenceC();
		s.setTags(parentSequence.getSubBlock(SequenceC.START_END_16RS).getTags());
		return s;
	}
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=C1]
	/**
	* Class for Sequence "C1" of MT 307
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
	public static class SequenceC1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceC1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceC1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>LINK</em>
		*/
		public static final String START_END_16RS = "LINK";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceC1 newInstance(final Tag ... tags) {
			final SequenceC1 result = new SequenceC1();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}

			result.append(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceC1 newInstance() {
			final SequenceC1 result = new SequenceC1();

			result.append(START_TAG);
			
			result.append(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceC1 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceC1 result = new SequenceC1();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.append(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceC1(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}
	}

	/**
	* Get the list of SequenceC1 delimited by 16R/16S with value specified in SequenceC1#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
    *
    * <div><em><b>This sequence does not have a unique 16R/S delimiter. In order to be uniquely identified it must be
    * present inside it&apos;s parent sequences</em></b>
    * </div>
    *
    * @see com.prowidesoftware.swift.model.mt.SequenceUtils
     *
	* @see SequenceC1#START_END_16RS 
	*/
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceC1> getSequenceC1List() {
  	   /*
		* The delimiter LINK is not unique across all sequences, in this MT.
		* The usual generated API for accessing this can not be used for sequence C1.
		* So we call a special method to resolve this situation until we find a better approach.
		*
		*/
		if (this.getSwiftMessage() == null) {
			return null;
		}
		return com.prowidesoftware.swift.model.mt.SequenceUtils.resolveMT307GetSequenceC1List_sru2016(this);
	}
	/**
	* Get the list of SequenceC1 delimited by 16R/16S with value specified in SequenceC1#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
    *
    * <div><em><b>This sequence does not have a unique 16R/S delimiter. In order to be uniquely identified it must be
    * present inside it&apos;s parent sequences</em></b>
    * </div>
    *
    * @see com.prowidesoftware.swift.model.mt.SequenceUtils
     *
	* @see SequenceC1#START_END_16RS 
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceC1 within the complete message
	* @since 7.7
	*/
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceC1> getSequenceC1List(final SwiftTagListBlock parentSequence) {
  		/*
		* The delimiter LINK is not unique across all sequences, in this MT.
		* The usual generated API for accessing this can not be used for sequence C1.
		* So we call a special method to resolve this situation until we find a better approach.
		*
		*/
		return com.prowidesoftware.swift.model.mt.SequenceUtils.resolveMT307GetSequenceC1List_sru2016(new MT307().append(parentSequence));

	} 	
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=D]
	/**
	* Class for Sequence "D" of MT 307
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceD extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceD() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceD(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>NET</em>
		*/
		public static final String START_END_16RS = "NET";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceD newInstance(final Tag ... tags) {
			final SequenceD result = new SequenceD();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}

			result.append(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceD newInstance() {
			final SequenceD result = new SequenceD();

			result.append(START_TAG);
			
			result.append(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceD newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceD result = new SequenceD();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.append(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceD(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}
	}
	/**
	* Get the single occurrence of SequenceD delimited by 16R/16S the value of SequenceD#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceD</code> is returned</em>
	* @see SequenceD#START_END_16RS
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceD getSequenceD() {
		return new SequenceD(super.getSwiftMessageNotNullOrException());
	}
	
	/**
	* Get the single occurrence of SequenceD delimited by 16R/16S the value of SequenceD#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceD</code> is returned</em>  
	* @see SequenceD#START_END_16RS
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceD within the complete message
	* @since 7.7
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public static SequenceD getSequenceD(SwiftTagListBlock parentSequence) {
		final SequenceD s = new SequenceD();
		s.setTags(parentSequence.getSubBlock(SequenceD.START_END_16RS).getTags());
		return s;
	}
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=D1]
	/**
	* Class for Sequence "D1" of MT 307
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
	public static class SequenceD1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceD1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceD1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>CSHPRTY</em>
		*/
		public static final String START_END_16RS = "CSHPRTY";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceD1 newInstance(final Tag ... tags) {
			final SequenceD1 result = new SequenceD1();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}

			result.append(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceD1 newInstance() {
			final SequenceD1 result = new SequenceD1();

			result.append(START_TAG);
			
			result.append(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceD1 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceD1 result = new SequenceD1();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.append(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceD1(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}
	}

	/**
	* Get the list of SequenceD1 delimited by 16R/16S with value specified in SequenceD1#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
    *
    * <div><em><b>This sequence does not have a unique 16R/S delimiter. In order to be uniquely identified it must be
    * present inside it&apos;s parent sequences</em></b>
    * </div>
    *
    * @see com.prowidesoftware.swift.model.mt.SequenceUtils
     *
	* @see SequenceD1#START_END_16RS 
	*/
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceD1> getSequenceD1List() {
  	   /*
		* The delimiter CSHPRTY is not unique across all sequences, in this MT.
		* The usual generated API for accessing this can not be used for sequence D1.
		* So we call a special method to resolve this situation until we find a better approach.
		*
		*/
		if (this.getSwiftMessage() == null) {
			return null;
		}
		return com.prowidesoftware.swift.model.mt.SequenceUtils.resolveMT307GetSequenceD1List_sru2016(this);
	}
	/**
	* Get the list of SequenceD1 delimited by 16R/16S with value specified in SequenceD1#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
    *
    * <div><em><b>This sequence does not have a unique 16R/S delimiter. In order to be uniquely identified it must be
    * present inside it&apos;s parent sequences</em></b>
    * </div>
    *
    * @see com.prowidesoftware.swift.model.mt.SequenceUtils
     *
	* @see SequenceD1#START_END_16RS 
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceD1 within the complete message
	* @since 7.7
	*/
	@com.prowidesoftware.swift.internal.NonUniqueSeparator
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceD1> getSequenceD1List(final SwiftTagListBlock parentSequence) {
  		/*
		* The delimiter CSHPRTY is not unique across all sequences, in this MT.
		* The usual generated API for accessing this can not be used for sequence D1.
		* So we call a special method to resolve this situation until we find a better approach.
		*
		*/
		return com.prowidesoftware.swift.model.mt.SequenceUtils.resolveMT307GetSequenceD1List_sru2016(new MT307().append(parentSequence));

	} 	
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator




}
