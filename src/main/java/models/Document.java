package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "Document")
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Document implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "FileAppHdr")
    private FileAppHdr fileAppHdr;
    @XmlElement(name = "AppHdr")
    private AppHdr appHdr;
    @XmlElement(name = "CreditTransfer")
    private CreditTransfer creditTransfer;

}




