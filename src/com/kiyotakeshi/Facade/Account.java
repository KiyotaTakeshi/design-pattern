package com.kiyotakeshi.Facade;

public class Account {
    private int branchNumber;
    private String accountNumber;
    private String accountType;
    private String accountHolder;
    private int deposit;
    private int loan;
    private int repaymentStatus;

    public Account(int branchNumber, String accountNumber, String accountType, String accountHolder, int deposit, int loan, int repaymentStatus) {
        this.branchNumber = branchNumber;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountHolder = accountHolder;
        this.deposit = deposit;
        this.loan = loan;
        this.repaymentStatus = repaymentStatus;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getLoan() {
        return loan;
    }

    public void setLoan(int loan) {
        this.loan = loan;
    }

    public int getRepaymentStatus() {
        return repaymentStatus;
    }

    public void setRepaymentStatus(int repaymentStatus) {
        this.repaymentStatus = repaymentStatus;
    }
}
