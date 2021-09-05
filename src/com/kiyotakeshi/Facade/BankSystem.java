package com.kiyotakeshi.Facade;

import com.kiyotakeshi.Prototype2.prototype.Item;

import java.util.HashMap;
import java.util.Map;

public class BankSystem {

    private static Map<String, Account> accountMap = new HashMap<>();

    // static initialize
    static {
        Account mike = new Account(1, "001", "normal", "mike", 1000, 10000, 1);
        Account popcorn = new Account(1, "002", "normal", "popcorn", 100000, 0, 0);

        accountMap.put("001", mike);
        accountMap.put("002", popcorn);
    }

    private static Account getAccount(String accountNumber) {
        return accountMap.get(accountNumber);
    }

    public static boolean existsAccount(String accountNumber) {
        Account account = getAccount(accountNumber);
        return account != null;
    }

    public static boolean isTakeLoan(String accountNumber) {
        Account account = getAccount(accountNumber);

        // 1 以外なら true
        return account.getRepaymentStatus() != 1;
    }

    public static boolean takeLoan(String accountNumber, int loanAmount) {
        Account account = getAccount(accountNumber);
        account.setDeposit(account.getDeposit() + loanAmount);
        account.setLoan(account.getLoan() + loanAmount);
        return true;
    }
}
