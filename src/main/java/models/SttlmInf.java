package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "SttlmInf")
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SttlmInf implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "SttlmMtd")
    private String sttlmMtd;
    @XmlElement(name = "ClrSys")
    private ClrSys clrSys;

}
