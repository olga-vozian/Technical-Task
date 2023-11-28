package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@XmlRootElement(name = "CreditTransfer")
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreditTransfer implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "FIToFICstmrCdtTrf")
    private FIToFICstmrCdtTrf fiToFICstmrCdtTrf;

}