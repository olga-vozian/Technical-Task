package service;

import models.Document;
import models.XmlField;

public interface DocumentService {

    Document updateValueOfTheField(Document document, XmlField xmlField, int intValue);
    Document updateValueOfTheField(Document document, XmlField xmlField, double doubleValue);
    Document updateValueOfTheField(Document document, XmlField xmlField, String stringValue);
    Document updateValueOfTheField(Document document, XmlField xmlField, int index, String stringValue);

}