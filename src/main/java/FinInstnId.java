import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "FinInstnId")
@XmlAccessorType(XmlAccessType.FIELD)
public class FinInstnId implements Serializable{

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "BICFI")
    private String bicfi;

    public FinInstnId() {
        super();
    }

    public FinInstnId(String bicfi ) {
        super();
        this.bicfi = bicfi;
    }

    public String getBicfi() {
        return bicfi;
    }

    public void setBicfi(String bicfi) {
        this.bicfi = bicfi;
    }

    @Override
    public String toString() {
        return "FinInstnId [BICFI=" + bicfi + "]";}
}
