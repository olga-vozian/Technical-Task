import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "Document")
@XmlAccessorType(XmlAccessType.FIELD)
public class Document implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "FileAppHdr")
    private FileAppHdr fileAppHdr;
    @XmlElement(name = "AppHdr")
    private AppHdr appHdr;
    @XmlElement(name = "CreditTransfer")
    private CreditTransfer creditTransfer;

    public Document() {
    }

    public Document(FileAppHdr fileAppHdr, AppHdr appHdr, CreditTransfer creditTransfer ) {
        fileAppHdr = fileAppHdr;
        appHdr = appHdr;
        creditTransfer = creditTransfer;
    }

    public FileAppHdr getFileAppHdr() {
        return fileAppHdr;
    }

    public void setFileAppHdr(FileAppHdr fileAppHdr) {
        fileAppHdr = fileAppHdr;
    }

    public AppHdr getAppHdr() {
        return appHdr;
    }

    public CreditTransfer getCreditTransfer() {
        return creditTransfer;
    }

    public void setAppHdr(AppHdr appHdr) {
        this.appHdr = appHdr;
    }

    public void setCreditTransfer(CreditTransfer creditTransfer) {
        this.creditTransfer = creditTransfer;
    }

    @Override
    public String toString() {
        return "Document [FileAppHdr=" + fileAppHdr + ",AppHdr= " + appHdr + ",CreditTransfer=" + creditTransfer +"]";
    }
}




