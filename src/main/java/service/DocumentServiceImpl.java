package service;

import models.Document;

public class DocumentServiceImpl implements DocumentService {

    @Override
    public Document updateSttlmCycl(Document document, Integer sttlmCyclNewValue) {
        document.getFileAppHdr().setSttlmCycl(sttlmCyclNewValue);
        return document;

    }

    @Override
    public Document updateCreDt(Document document, String creDtNewValue) {
        document.getAppHdr().setCreDt(creDtNewValue);
        return document;
    }

    @Override
    public Document updateBicfi(Document document, String bicfiNewValue) {
        document.getAppHdr().getFinInstnId().setBicfi(bicfiNewValue);
        return document;
    }

    @Override
    public Document updateNbOfTxs(Document document, Integer nbOfTxsNewValue) {
        document.getCreditTransfer().getFIToFICstmrCdtTrf().getGrpHdr().setNbOfTxs(nbOfTxsNewValue);
        return document;
    }

    @Override
    public Document updateSttlmMtd(Document document, String sttlmMtdNewValue) {
        document.getCreditTransfer().getFIToFICstmrCdtTrf().getGrpHdr().getSttlmInf().setSttlmMtd(sttlmMtdNewValue);
        return document;
    }

    @Override
    public Document updateCd(Document document, String cdNewValue) {
        document.getCreditTransfer().getFIToFICstmrCdtTrf().getGrpHdr().getSttlmInf().getClrSys().setCd(cdNewValue);
        return document;
    }

    @Override
    public Document updateInstrId(Document document, String instrIdNewValue, Integer index) {
        if (index != null && index < document.getCreditTransfer().getFIToFICstmrCdtTrf().getCdtTrfTxInf().size()) {
            document.getCreditTransfer().getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(index).getPmtId().setInstrId(instrIdNewValue);
        } else {
            document.getCreditTransfer().getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getPmtId().setInstrId(instrIdNewValue);
        }
        return document;
    }

}
