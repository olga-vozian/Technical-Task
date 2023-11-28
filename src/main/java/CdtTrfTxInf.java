import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDate;

@XmlRootElement(name = "CdtTrfTxInf")
@XmlAccessorType(XmlAccessType.FIELD)

public class CdtTrfTxInf implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PmtId")
    private PmtId pmtId;

    public CdtTrfTxInf() {
        super();
    }

    public CdtTrfTxInf(PmtId pmtId) {
        super();
        this.pmtId = pmtId;
    }

    public PmtId getPmtId() {
        return pmtId;
    }

    public void setPmtId(PmtId pmtId) {
        this.pmtId = pmtId;
    }

    @Override
    public String toString() {
        return "CdtTrfTxInf [PmtId=" + pmtId + "]";}
}
