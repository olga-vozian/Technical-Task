import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "ClrSys")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClrSys implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "Cd")
    private String cd;

    public ClrSys() {
        super();
    }

    public ClrSys(String cd) {
        super();
        this.cd = cd;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    @Override
    public String toString() {
        return "ClrSys [Cd=" + cd + "]";}
}
