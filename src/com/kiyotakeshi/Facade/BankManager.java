package com.kiyotakeshi.Facade;

// Facade
// シンプルな窓口(takeLoan)を client に対して提供
public class BankManager {
    private static final int SUCCESS = 0;
    private static final int ERROR = 1;

    public static int takeLoan(String accountNumber, int loanAmount) {

        boolean existsAccount = BankSystem.existsAccount(accountNumber);
        if (!existsAccount) {
            System.out.println("account not exists");
            return ERROR;
        }

        boolean checkRepaymentStatus = BankSystem.isTakeLoan(accountNumber);
        if(!checkRepaymentStatus){
            System.out.println("sorry, cannot take more loan, you've already have loan");
            return ERROR;
        }

        boolean takeLoan = BankSystem.takeLoan(accountNumber, loanAmount);
        if(!takeLoan){
            System.out.println("fail to take loan");
            return ERROR;
        }
        System.out.println("take loan");

        return SUCCESS;
    }
}
