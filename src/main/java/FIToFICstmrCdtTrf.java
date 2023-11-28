import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "FIToFICstmrCdtTrf")
@XmlAccessorType(XmlAccessType.FIELD)
public class FIToFICstmrCdtTrf implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "GrpHdr")
    private GrpHdr grpHdr;
    @XmlElement(name = "CdtTrfTxInf")
    private List<CdtTrfTxInf> cdtTrfTxInf;
    //private cdtTrfTxInf CdtTrfTxInf1;

    public FIToFICstmrCdtTrf() {
        super();
    }

    public FIToFICstmrCdtTrf(GrpHdr grpHdr, List<CdtTrfTxInf> cdtTrfTxInf) {
        super();
        this.grpHdr = grpHdr;
        this.cdtTrfTxInf = cdtTrfTxInf;
    }

    public GrpHdr getGrpHdr() {
        return grpHdr;
    }

    public void setGrpHdr(GrpHdr grpHdr) {
        this.grpHdr = grpHdr;
    }

    public List<CdtTrfTxInf> getCdtTrfTxInf() {
        return cdtTrfTxInf;
    }

    public void setCdtTrfTxInf(List<CdtTrfTxInf> cdtTrfTxInf) {
        this.cdtTrfTxInf = cdtTrfTxInf;
    }

    @Override
    public String toString() {
        return "FIToFICstmrCdtTrf [GrpHdr=" + grpHdr + ", CdtTrfTxInf=" + cdtTrfTxInf + "]";}
}
