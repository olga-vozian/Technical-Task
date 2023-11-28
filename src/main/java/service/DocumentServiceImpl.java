package service;

import models.Document;
import models.XmlField;
import org.apache.commons.jxpath.JXPathContext;

public class DocumentServiceImpl implements DocumentService {

    @Override
    public Document updateValueOfTheField(Document document, XmlField xmlField, int intValue) {
        JXPathContext.newContext(document).setValue(xmlField.getPath(), intValue);
        return document;
    }

    @Override
    public Document updateValueOfTheField(Document document, XmlField xmlField, double doubleValue) {
        JXPathContext.newContext(document).setValue(xmlField.getPath(), doubleValue);
        return document;
    }

    @Override
    public Document updateValueOfTheField(Document document, XmlField xmlField, String stringValue) {
        JXPathContext.newContext(document).setValue(xmlField.getPath(), stringValue);
        return document;
    }

    @Override
    public Document updateValueOfTheField(Document document, XmlField xmlField, int index, String stringValue) {
        JXPathContext.newContext(document).setValue(xmlField.applyIndexToPath(xmlField, index), stringValue);
        return document;
    }

}