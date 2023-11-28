import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "CreditTransfer")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditTransfer implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "FIToFICstmrCdtTrf")
    private FIToFICstmrCdtTrf fIToFICstmrCdtTrf;

    public CreditTransfer() {
        super();
    }

    public CreditTransfer(FIToFICstmrCdtTrf fIToFICstmrCdtTrf) {
        this.fIToFICstmrCdtTrf = fIToFICstmrCdtTrf;
    }

    public FIToFICstmrCdtTrf getfIToFICstmrCdtTrf() {
        return fIToFICstmrCdtTrf;
    }

    public void setfIToFICstmrCdtTrf(FIToFICstmrCdtTrf fIToFICstmrCdtTrf) {
        this.fIToFICstmrCdtTrf = fIToFICstmrCdtTrf;
    }

    @Override
    public String toString() {
        return "CreditTransfer [FIToFICstmrCdtTrf=" + fIToFICstmrCdtTrf + "]";}
}
