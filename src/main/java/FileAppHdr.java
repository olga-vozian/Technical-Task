import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "FileAppHdr")
@XmlAccessorType(XmlAccessType.FIELD)
public class FileAppHdr implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "NbOfBtchs")
    private Integer nbOfBtchs;
    @XmlElement(name = "SttlmCycl")
    private Integer sttlmCycl;

    public FileAppHdr() {

    }

    public FileAppHdr(Integer nbOfBtchs, Integer sttlmCycl) {
        this.nbOfBtchs = nbOfBtchs;
        this.sttlmCycl = sttlmCycl;
    }

    public Integer getnbOfBtchs() {
        return nbOfBtchs;
    }

    public void setnbOfBtchs(String nbOfBths) {
        this.nbOfBtchs = nbOfBtchs;
    }

    public Integer getsttlmCycl() {
        return sttlmCycl;
    }

    public void setsttlmCycl(Integer sttlmCycl) {
        this.sttlmCycl = sttlmCycl;
    }

    @Override
    public String toString() {
        return "FileAppHdr [NbOfBtchs=" + nbOfBtchs + ", SttlmCycl=" + sttlmCycl + "]";
    }
}