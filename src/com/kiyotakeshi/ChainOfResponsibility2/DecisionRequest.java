package com.kiyotakeshi.ChainOfResponsibility2;

public class DecisionRequest {
    private String documentName;
    private int documentType;

    public DecisionRequest(String documentName, int documentType) {
        this.documentName = documentName;
        this.documentType = documentType;
    }

    public int getDocumentType() {
        return documentType;
    }

    @Override
    public String toString() {
        return "DecisionRequest{" +
                "documentName='" + documentName + '\'' +
                ", documentType=" + documentType +
                '}';
    }
}
