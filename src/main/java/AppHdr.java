import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "AppHdr")
@XmlAccessorType(XmlAccessType.FIELD)
public class AppHdr implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "FinInstnId")
    private FinInstnId finInstnId;
    @XmlElement(name = "BizMsgIdr")
    private String bizMsgIdr;
    @XmlElement(name = "MsgDefIdr")
    private String msgDefIdr;
    @XmlElement(name = "CreDt")
    private String creDt;

    public AppHdr() {
        super();
    }

    public AppHdr(FinInstnId finInstnId, String bizMsgIdr, String msgDefIdr, String creDt) {
        super();
        this.finInstnId = finInstnId;
        this.bizMsgIdr = bizMsgIdr;
        this.msgDefIdr = msgDefIdr;
        this.creDt = creDt;
    }

    public FinInstnId getFinInstnId() {
        return finInstnId;
    }

    public void setFinInstnId(FinInstnId finInstnId) {
        this.finInstnId = finInstnId;
    }

    public String getBizMsgIdr() {
        return bizMsgIdr;
    }

    public void setBizMsgIdr(String bizMsgIdr) {
        this.bizMsgIdr = bizMsgIdr;
    }

    public String getMsgDefIdr() {
        return msgDefIdr;
    }

    public void setMsgDefIdr(String msgDefIdr) {
        this.msgDefIdr = msgDefIdr;
    }

    public String getCreDt() {
        return creDt;
    }

    public void setCreDt(String creDt) {
        this.creDt = creDt;
    }

    @Override
    public String toString() {
        return "AppHdr [FinInstnId=" + finInstnId + ", BizMsgIdr=" + bizMsgIdr + ", MsgDefIdr=" + msgDefIdr + ", CreDt=" + creDt +"]";}

}
