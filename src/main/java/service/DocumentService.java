package service;

import models.Document;

public interface DocumentService {

    Document updateSttlmCycl(Document document, Integer sttlmCyclNewValue);
    Document updateCreDt(Document document, String creDtNewValue);
    Document updateBicfi(Document document, String bicfiNewValue);
    Document updateNbOfTxs(Document document, Integer nbOfTxsNewValue);
    Document updateSttlmMtd(Document document, String sttlmMtdNewValue);
    Document updateCd(Document document, String cdNewValue);
    Document updateInstrId(Document document, String instrIdNewValue, Integer index);

}
