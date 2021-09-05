package com.kiyotakeshi.Facade;

public class Main {
    public static void main(String[] args) {

        String mikeAccount = "001";
        int mikeResult = BankManager.takeLoan(mikeAccount, 1500000);

        String popcornAccount = "002";
        int popcornResult = BankManager.takeLoan(popcornAccount, 1500000);

        System.out.println();
    }
}
