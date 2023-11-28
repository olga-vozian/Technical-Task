package service;

import lombok.val;
import models.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class XmlUtils {

    public Document unmarshalXmlFile(File xmlFile) throws JAXBException {
        return (Document) JAXBContext.newInstance(Document.class)
                .createUnmarshaller().unmarshal(xmlFile);
    }

    public void marshalXmlFile(File xmlFile, Document document) throws JAXBException {
        val jaxbMarshaller = JAXBContext.newInstance(Document.class)
                .createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        jaxbMarshaller.marshal(document, xmlFile);
    }

}
