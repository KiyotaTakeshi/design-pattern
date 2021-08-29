package com.kiyotakeshi.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 12; i++){
            // .getInstance() が呼ばれた際に、 Singleton クラスのインスタンスが生成される
            Quadruple quadruple = Quadruple.getInstance(i % 4);
            System.out.println(i + ":" + quadruple);
        }
        System.out.println("End.");
    }
}
