import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "PmtId")
@XmlAccessorType(XmlAccessType.FIELD)
public class PmtId implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "InstrId")
    private String instrId;
    @XmlElement(name = "EndToEndId")
    private String endToEndId;
    @XmlElement(name = "TxId")
    private String txId;
    @XmlElement(name = "ClrSysRef")
    private String clrSysRef;

    public PmtId() {
        super();
    }

    public PmtId(String instrId, String endToEndId, String txId, String clrSysRef) {
        super();
        this.instrId = instrId;
        this.endToEndId = endToEndId;
        this.txId = txId;
        this.clrSysRef = clrSysRef;
    }

    public String getInstrId() {
        return instrId;
    }

    public void setInstrId(String instrId) {
        this.instrId = instrId;
    }

    public String getEndToEndId() {
        return endToEndId;
    }

    public void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public String getClrSysRef() {
        return clrSysRef;
    }

    public void setClrSysRef(String clrSysRef) {
        this.clrSysRef = clrSysRef;
    }

    @Override
    public String toString() {
        return "PmtId [InstrId=" + instrId + ", EndToEndId=" + endToEndId + ", TxId=" + txId + ", ClrSysRef=" + clrSysRef + "]";}

}
