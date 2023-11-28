package service;

import lombok.val;
import models.Document;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;
import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DocumentServiceImplTest {

    final XmlUtils xmlUtils = new XmlUtils();
    final DocumentService documentService = new DocumentServiceImpl();

    final File originalXmlFile = new File("C:\\Users\\ovozian\\technical task\\src\\main\\resources\\TechnicalTask.xml");
    final File modifiedXmlFile = new File("C:\\Users\\ovozian\\technical task\\src\\main\\resources\\ModifiedTechnicalTask.xml");

    @Test
    void updateSttlmCycl() throws JAXBException {
        val document = getOriginalDocument();
        documentService.updateSttlmCycl(document, 12);
        writeDocument(document);
        val modifiedDocument = readModifiedDocument();

        assertEquals(modifiedDocument.getFileAppHdr().getSttlmCycl(), new Integer(12));
    }

    @Test
    void updateCreDt() throws JAXBException {
        val document = getOriginalDocument();
        documentService.updateCreDt(document, "2025-08-07T12:00:42Z");
        writeDocument(document);
        val modifiedDocument = readModifiedDocument();

        assertEquals(modifiedDocument.getAppHdr().getCreDt(), "2025-08-07T12:00:42Z");

    }

    @Test
    void updateBicfi() throws JAXBException {
        val document = getOriginalDocument();
        documentService.updateBicfi(document, "49Af55");
        writeDocument(document);
        val modifiedDocument = readModifiedDocument();

        assertEquals(modifiedDocument.getAppHdr().getFinInstnId().getBicfi(), "49Af55");
    }

    @Test
    void updateNbOfTxs() throws JAXBException {
        val document = getOriginalDocument();
        documentService.updateNbOfTxs(document, 89);
        writeDocument(document);
        val modifiedDocument = readModifiedDocument();

        assertEquals(modifiedDocument.getCreditTransfer().getFIToFICstmrCdtTrf().getGrpHdr().getNbOfTxs(), 89);
    }

    @Test
    void updateSttlmMtd() throws JAXBException {
        val document = getOriginalDocument();
        documentService.updateSttlmMtd(document, "CCCC");
        writeDocument(document);
        val modifiedDocument = readModifiedDocument();

        assertEquals(modifiedDocument.getCreditTransfer().getFIToFICstmrCdtTrf().getGrpHdr().getSttlmInf().getSttlmMtd(), "CCCC");
    }

    @Test
    void updateCd() throws JAXBException {
        val document = getOriginalDocument();
        documentService.updateCd(document, "Z56");
        writeDocument(document);
        val modifiedDocument = readModifiedDocument();

        assertEquals(modifiedDocument.getCreditTransfer().getFIToFICstmrCdtTrf().getGrpHdr().getSttlmInf().getClrSys().getCd(), "Z56");
    }

    @Test
    void updateInstrId() throws JAXBException {
        val document = getOriginalDocument();
        documentService.updateInstrId(document, "00000000000000000", 0);
        documentService.updateInstrId(document, "11111111111111", 1);
        writeDocument(document);
        val modifiedDocument = readModifiedDocument();

        assertEquals(modifiedDocument.getCreditTransfer().getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getPmtId().getInstrId(), "00000000000000000");
        assertEquals(modifiedDocument.getCreditTransfer().getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(1).getPmtId().getInstrId(), "11111111111111");
    }

    @Test
    void updateInstrIdWithIndexExceedingTagNumbers() throws JAXBException {
        val document = getOriginalDocument();
        documentService.updateInstrId(document, "00000000000000000", 0);
        documentService.updateInstrId(document, "11111111111111", 1);
        documentService.updateInstrId(document, "33333333333333", 3);
        writeDocument(document);
        val modifiedDocument = readModifiedDocument();

        assertEquals(modifiedDocument.getCreditTransfer().getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getPmtId().getInstrId(), "33333333333333");
    }

    @Test
    void updateInstrIdWithNullIndex() throws JAXBException {
        val document = getOriginalDocument();
        documentService.updateInstrId(document, "00000000000000000", 0);
        documentService.updateInstrId(document, "11111111111111", 1);
        documentService.updateInstrId(document, "44444444444444", null);
        writeDocument(document);
        val modifiedDocument = readModifiedDocument();

        assertEquals(modifiedDocument.getCreditTransfer().getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getPmtId().getInstrId(), "44444444444444");
    }

    Document getOriginalDocument() throws JAXBException {
        return xmlUtils.unmarshalXmlFile(originalXmlFile);
    }

    void writeDocument(Document document) throws JAXBException {
        xmlUtils.marshalXmlFile(modifiedXmlFile, document);
    }

    Document readModifiedDocument() throws JAXBException {
        return xmlUtils.unmarshalXmlFile(modifiedXmlFile);
    }

}