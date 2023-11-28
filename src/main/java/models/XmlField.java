package models;

public enum XmlField {

    NbOfBtchs("fileAppHdr/nbOfBtchs"),
    SttlmCycl("fileAppHdr/sttlmCycl"),
    BICFI("appHdr/finInstnId/bicfi"),
    BizMsgIdr("appHdr/bizMsgIdr"),
    MsgDefIdr("appHdr/msgDefIdr"),
    CreDt("appHdr/creDt"),
    MsgId("creditTransfer/fiToFICstmrCdtTrf/grpHdr/msgId"),
    CreDtTm("creditTransfer/fiToFICstmrCdtTrf/grpHdr/creDtTm"),
    NbOfTxs("creditTransfer/fiToFICstmrCdtTrf/grpHdr/nbOfTxs"),
    TtlIntrBkSttlmAmt("creditTransfer/fiToFICstmrCdtTrf/grpHdr/ttlIntrBkSttlmAmt"),
    IntrBkSttlmDt("creditTransfer/fiToFICstmrCdtTrf/grpHdr/intrBkSttlmDt"),
    SttlmMtd("creditTransfer/fiToFICstmrCdtTrf/grpHdr/sttlmInf/sttlmMtd"),
    Cd("creditTransfer/fiToFICstmrCdtTrf/grpHdr/sttlmInf/clrSys/cd"),
    InstrId("creditTransfer/fiToFICstmrCdtTrf/cdtTrfTxInf[index]/pmtId/instrId"),
    EndToEndId("creditTransfer/fiToFICstmrCdtTrf/cdtTrfTxInf[index]/pmtId/endToEndId"),
    TxId("creditTransfer/fiToFICstmrCdtTrf/cdtTrfTxInf[index]/pmtId/txId"),
    ClrSysRef("creditTransfer/fiToFICstmrCdtTrf/cdtTrfTxInf[index]/pmtId/clrSysRef");

    private String path;

    XmlField(String envPath) {
        this.path = envPath;
    }

    public String getPath() {
        return path;
    }

    public String applyIndexToPath(XmlField xmlField, int index) {
        switch (xmlField) {
            case InstrId:
                return "creditTransfer/fiToFICstmrCdtTrf/cdtTrfTxInf[" + index + "]/pmtId/instrId";
            case EndToEndId:
                return "creditTransfer/fiToFICstmrCdtTrf/cdtTrfTxInf[" + index + "]/pmtId/endToEndId";
            case TxId:
                return "creditTransfer/fiToFICstmrCdtTrf/cdtTrfTxInf[" + index + "]/pmtId/txId";
            case ClrSysRef:
                return "creditTransfer/fiToFICstmrCdtTrf/cdtTrfTxInf[" + index + "]/pmtId/clrSysRef";
        }
        return xmlField.getPath();
    }

}

