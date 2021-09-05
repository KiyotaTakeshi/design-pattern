package com.kiyotakeshi.ChainOfResponsibility2;

public class GeneralAffairs extends ApprovalPerson {

    public GeneralAffairs(String name) {
        super(name);
    }

    @Override
    protected boolean judge(DecisionRequest request) {
        return false;
    }
}
