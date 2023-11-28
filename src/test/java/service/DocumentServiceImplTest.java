package service;

import lombok.val;
import models.Document;
import models.XmlField;
import org.apache.commons.jxpath.JXPathContext;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;
import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DocumentServiceImplTest {

    final XmlUtils xmlUtils = new XmlUtils();
    final DocumentService documentService = new DocumentServiceImpl();

    @Test
    void updateValueOfTheFieldWithIntegerTest() throws JAXBException {
        val document = getOriginalDocument();
        documentService.updateValueOfTheField(document, XmlField.NbOfBtchs, 45);
        documentService.updateValueOfTheField(document, XmlField.SttlmCycl, 77);
        documentService.updateValueOfTheField(document, XmlField.NbOfTxs, 66);
        writeDocument(document);
        val modifiedDocument = readModifiedDocument();

        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.NbOfBtchs.getPath()), 45);
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.SttlmCycl.getPath()), 77);
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.NbOfTxs.getPath()), 66);
    }

    @Test
    void updateValueOfTheFieldWithDoubleTest() throws JAXBException {
        val document = getOriginalDocument();
        documentService.updateValueOfTheField(document, XmlField.TtlIntrBkSttlmAmt, 44.0);
        writeDocument(document);
        val modifiedDocument = readModifiedDocument();
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.TtlIntrBkSttlmAmt.getPath()), 44.0);
    }

    @Test
    public void updateValueOfTheFieldWithStringTest() throws JAXBException {
        val document = getOriginalDocument();
        documentService.updateValueOfTheField(document, XmlField.BICFI, "New value for BICFI");
        documentService.updateValueOfTheField(document, XmlField.BizMsgIdr, "New value for BizMsgIdr");
        documentService.updateValueOfTheField(document, XmlField.MsgDefIdr, "New value for MsgDefIdr");
        documentService.updateValueOfTheField(document, XmlField.CreDt, "New value for CreDt");
        documentService.updateValueOfTheField(document, XmlField.MsgId, "New value for MsgId");
        documentService.updateValueOfTheField(document, XmlField.CreDtTm, "New value for CreDtTm");
        documentService.updateValueOfTheField(document, XmlField.IntrBkSttlmDt, "New value for IntrBkSttlmDt");
        documentService.updateValueOfTheField(document, XmlField.SttlmMtd, "New value for SttlmMtd");
        documentService.updateValueOfTheField(document, XmlField.Cd, "New value for Cd");
        writeDocument(document);
        val modifiedDocument = readModifiedDocument();
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.BICFI.getPath()), "New value for BICFI");
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.BizMsgIdr.getPath()), "New value for BizMsgIdr");
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.MsgDefIdr.getPath()), "New value for MsgDefIdr");
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.CreDt.getPath()), "New value for CreDt");
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.MsgId.getPath()), "New value for MsgId");
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.CreDtTm.getPath()), "New value for CreDtTm");
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.IntrBkSttlmDt.getPath()), "New value for IntrBkSttlmDt");
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.SttlmMtd.getPath()), "New value for SttlmMtd");
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.Cd.getPath()), "New value for Cd");
    }

    @Test
    public void updateValueOfTheFieldWithIndexForStringTest() throws JAXBException {
        val document = getOriginalDocument();
        documentService.updateValueOfTheField(document, XmlField.InstrId, 1, "New value for InstrId with index 1");
        documentService.updateValueOfTheField(document, XmlField.InstrId, 2, "New value for InstrId with index 2");
        documentService.updateValueOfTheField(document, XmlField.EndToEndId, 1, "New value for EndToEndId with index 1");
        documentService.updateValueOfTheField(document, XmlField.EndToEndId, 2, "New value for EndToEndId with index 2");
        documentService.updateValueOfTheField(document, XmlField.TxId, 1, "New value for TxId with index 1");
        documentService.updateValueOfTheField(document, XmlField.TxId, 2, "New value for TxId with index 2");
        documentService.updateValueOfTheField(document, XmlField.ClrSysRef, 1, "New value for ClrSysRef with index 1");
        documentService.updateValueOfTheField(document, XmlField.ClrSysRef, 2, "New value for ClrSysRef with index 2");
        writeDocument(document);
        val modifiedDocument = readModifiedDocument();
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.InstrId.applyIndexToPath(XmlField.InstrId,1 )),"New value for InstrId with index 1" );
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.InstrId.applyIndexToPath(XmlField.InstrId,2 )),"New value for InstrId with index 2" );
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.EndToEndId.applyIndexToPath(XmlField.EndToEndId,1 )),"New value for EndToEndId with index 1" );
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.EndToEndId.applyIndexToPath(XmlField.EndToEndId,2 )),"New value for EndToEndId with index 2" );
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.TxId.applyIndexToPath(XmlField.TxId,1 )),"New value for TxId with index 1" );
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.TxId.applyIndexToPath(XmlField.TxId,2 )),"New value for TxId with index 2" );
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.ClrSysRef.applyIndexToPath(XmlField.ClrSysRef,1 )),"New value for ClrSysRef with index 1" );
        assertEquals(JXPathContext.newContext(modifiedDocument).getValue(XmlField.ClrSysRef.applyIndexToPath(XmlField.ClrSysRef,2 )),"New value for ClrSysRef with index 2" );
    }

    private Document getOriginalDocument() throws JAXBException {
        val xmlFile = new File("C:\\Users\\ovozian\\technical task\\src\\main\\resources\\TechnicalTask.xml");
        return xmlUtils.unmarshalXmlFile(xmlFile);
    }

    private void writeDocument(Document document) throws JAXBException {
        val file = new File("C:\\Users\\ovozian\\technical task\\src\\main\\resources\\ModifiedTechnicalTask.xml");
        xmlUtils.marshalXmlFile(file, document);
    }

    private Document readModifiedDocument() throws JAXBException {
        val xmlFile = new File("C:\\Users\\ovozian\\technical task\\src\\main\\resources\\ModifiedTechnicalTask.xml");
        return xmlUtils.unmarshalXmlFile(xmlFile);
    }

}