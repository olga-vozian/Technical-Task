package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "PmtId")
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@AllArgsConstructor
@Data
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

}
