package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "FIToFICstmrCdtTrf")
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FIToFICstmrCdtTrf implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "GrpHdr")
    private GrpHdr grpHdr;
    @XmlElement(name = "CdtTrfTxInf")
    private List<CdtTrfTxInf> cdtTrfTxInf;

}
