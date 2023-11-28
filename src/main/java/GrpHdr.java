import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "GrpHdr")
@XmlAccessorType(XmlAccessType.FIELD)
public class GrpHdr implements Serializable{

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

    public GrpHdr() {
        super();
    }

    public GrpHdr(String msgId, String creDtTm, Integer nbOfTxs, Double ttlIntrBkSttlmAmt, String intrBkSttlmDt, SttlmInf sttlmInf ) {
        super();
        this.msgId = msgId;
        this.creDtTm = creDtTm;
        this.nbOfTxs = nbOfTxs;
        this.ttlIntrBkSttlmAmt = ttlIntrBkSttlmAmt;
        this.intrBkSttlmDt = intrBkSttlmDt;
        this.sttlmInf = sttlmInf;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getCreDtTm() {
        return creDtTm;
    }

    public void setCreDtTm(String creDtTm) {
        this.creDtTm = creDtTm;
    }

    public Integer getNbOfTxs() {
        return nbOfTxs;
    }

    public void setNbOfTxs(Integer nbOfTxs) {
        this.nbOfTxs = nbOfTxs;
    }

    public Double getTtlIntrBkSttlmAmt() {
        return ttlIntrBkSttlmAmt;
    }

    public void setTtlIntrBkSttlmAmt(Double ttlIntrBkSttlmAmt) {
        this.ttlIntrBkSttlmAmt = ttlIntrBkSttlmAmt;
    }

    public String getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    public void setIntrBkSttlmDt(String intrBkSttlmDt) {
        this.intrBkSttlmDt = intrBkSttlmDt;
    }

    public SttlmInf getSttlmInf() {
        return sttlmInf;
    }

    public void setSttlmInf(SttlmInf sttlmInf) {
        this.sttlmInf = sttlmInf;
    }

    @Override
    public String toString() {
        return "GrpHdr [MsgId=" + msgId + ", CreDtTm=" + creDtTm + ", NbOfTxs=" + nbOfTxs + " , TtlIntrBkSttlmAmt=" + ttlIntrBkSttlmAmt + " , IntrBkSttlmDt=" + intrBkSttlmDt + ", SttlmInf=" + sttlmInf + "]";}
}
