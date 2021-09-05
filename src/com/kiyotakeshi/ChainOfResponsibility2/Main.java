package com.kiyotakeshi.ChainOfResponsibility2;

public class Main {
    public static void main(String[] args) {
        ApprovalPerson yamada = new GeneralAffairs("yamada");
        ApprovalPerson tanaka = new Manager("tanaka", 10);
        ApprovalPerson sato = new GeneralManager("sato", 20);

        yamada
                .setNext(tanaka)
                .setNext(sato);

        DecisionRequest holiday = new DecisionRequest("holiday", 1);
        DecisionRequest retire = new DecisionRequest("retire", 11);
        DecisionRequest hire = new DecisionRequest("hire", 20);
        DecisionRequest ma = new DecisionRequest("M&A", 30);

        yamada.decision(holiday);
        yamada.decision(retire);
        yamada.decision(hire);
        yamada.decision(ma);
    }
}
