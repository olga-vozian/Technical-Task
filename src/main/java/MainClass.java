import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

//    static String xmlString =
//          "<FileAppHdr>\n" +
//          " <NbOfBtchs>1</NbOfBtchs>\n" +
//          " <SttlmCycl>1</SttlmCycl>\n" +
//          "</FileAppHdr>";

    public static void main(String[] args) throws JAXBException, IOException {
        File xmlFile = new File("C:\\Users\\ovozian\\technical task\\src\\main\\resources\\TechnicalTask.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Document document = (Document) jaxbUnmarshaller.unmarshal(xmlFile);
        System.out.println(document);

        //document.setCreditTransfer(new FIToFICstmrCdtTrf(new CdtTrfTxInf(new PmtId().setInstrId("1111111111111"))));
        FileAppHdr existentFileAppHdr = document.getFileAppHdr();
        existentFileAppHdr.setsttlmCycl(12);

        AppHdr existentAppHdr = document.getAppHdr();
        existentAppHdr.setCreDt("2025-08-07T12:00:42Z");

        FinInstnId existentFinInstnId = document.getAppHdr().getFinInstnId();
        existentFinInstnId.setBicfi("AAAAAAAAAAAAAAAAAAAA");

        GrpHdr existentGrpHdr = document.getCreditTransfer().getfIToFICstmrCdtTrf().getGrpHdr();
        existentGrpHdr.setNbOfTxs(89);

        SttlmInf existentSttlmInf = document.getCreditTransfer().getfIToFICstmrCdtTrf().getGrpHdr().getSttlmInf();
        existentSttlmInf.setSttlmMtd("CCCC");

        ClrSys existentClrSys = document.getCreditTransfer().getfIToFICstmrCdtTrf().getGrpHdr().getSttlmInf().getClrSys();
        existentClrSys.setCd("Z56");

        PmtId existentPmtId1 = document.getCreditTransfer().getfIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getPmtId();
        existentPmtId1.setInstrId("00000000000000000");

        PmtId existentPmtId2 = document.getCreditTransfer().getfIToFICstmrCdtTrf().getCdtTrfTxInf().get(1).getPmtId();
        existentPmtId2.setInstrId("11111111111111");
        //Create Marshaller
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        //Required formatting??
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        //Store XML to File
        File file = new File("C:\\Users\\ovozian\\technical task\\src\\main\\resources\\ModifiedTechnicalTask.xml");

        //Writes XML file to file-system
        jaxbMarshaller.marshal(document, file);
    }

    //JAXBContext jaxbContext = JAXBContext.newInstance(FileAppHdr.class);
    //Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    //FileAppHdr fileAppHdr = (FileAppHdr) jaxbUnmarshaller.unmarshal(new StringReader(xmlFile));
    //System.out.println(fileAppHdr);
}
   /* public void unmarshal() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Document.class);
        Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
        JAXBElement<Document> jaxbElement = (JAXBElement<Document>) jaxbUnmarshaller
                .unmarshal(new StreamSource(new FileReader("C:/Olga/TechicalTask.xml")), Document.class);
        //return (Document) context.createUnmarshaller()
                //.unmarshal(new FileReader("C:/Olga/TechicalTask.xml"));
    }*/

    /*public static void main (String [] args)throws JAXBException, IOException{
        MainClass ob = new MainClass();
        ob.unmarshal();
    }*/

