import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "SttlmInf")
@XmlAccessorType(XmlAccessType.FIELD)
public class SttlmInf implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "SttlmMtd")
    private String sttlmMtd;
    @XmlElement(name = "ClrSys")
    private ClrSys clrSys;

    public SttlmInf() {
        super();
    }

    public SttlmInf(String sttlmMtd, ClrSys clrSys) {
        super();
        this.sttlmMtd = sttlmMtd;
        this.clrSys = clrSys;
    }

    public String getSttlmMtd() {
        return sttlmMtd;
    }

    public void setSttlmMtd(String sttlmMtd) {
        this.sttlmMtd = sttlmMtd;
    }

    public ClrSys getClrSys() {
        return clrSys;
    }

    public void setClrSys(ClrSys clrSys) {
        this.clrSys = clrSys;
    }

    @Override
    public String toString() {
        return "SttlmInf [SttlmMtd=" + sttlmMtd + ", ClrSys=" + clrSys + "]";}
}
