package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "AppHdr")
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AppHdr implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "FinInstnId")
    private FinInstnId finInstnId;
    @XmlElement(name = "BizMsgIdr")
    private String bizMsgIdr;
    @XmlElement(name = "MsgDefIdr")
    private String msgDefIdr;
    @XmlElement(name = "CreDt")
    private String creDt;

}
