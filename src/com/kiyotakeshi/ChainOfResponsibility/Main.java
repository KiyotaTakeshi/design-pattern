package com.kiyotakeshi.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Support mike = new NoSupport("Mike");
        Support popcorn = new LimitSupport("Popcorn", 100);
        Support special = new SpecialSupport("Special", 396);
        Support jackson = new LimitSupport("Jackson", 300);
        Support johnson = new OddSupport("johnson");

        mike
                .setNext(popcorn)
                .setNext(special)
                .setNext(jackson)
                .setNext(johnson);

        for(int i = 0; i < 400; i += 44){
            mike.support(new Trouble(i));
        }
    }
}
