package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "GrpHdr")
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GrpHdr implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "MsgId")
    private String msgId;
    @XmlElement(name = "CreDtTm")
    private String creDtTm;
    @XmlElement(name = "NbOfTxs")
    private Integer nbOfTxs;
    @XmlElement(name = "TtlIntrBkSttlmAmt")
    private Double ttlIntrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmDt")
    private String intrBkSttlmDt;
    @XmlElement(name = "SttlmInf")
    private SttlmInf sttlmInf;

}
