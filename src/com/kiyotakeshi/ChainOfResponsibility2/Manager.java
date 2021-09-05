package com.kiyotakeshi.ChainOfResponsibility2;

public class Manager extends ApprovalPerson {

    private final int documentTypeLimit;

    public Manager(String name, int documentTypeLimit) {
        super(name);
        this.documentTypeLimit = documentTypeLimit;
    }

    @Override
    protected boolean judge(DecisionRequest request) {
        if (request.getDocumentType() <= documentTypeLimit) {
            // TODO: 稟議に関する処理
            return true;
        }
        return false;
    }
}
