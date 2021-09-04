package com.kiyotakeshi.Bridge;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("hello, there."));
        Display d2 = new CountDisplay(new StringDisplayImpl("hello, world."));
        // サブクラスのクラス型に代入したので multiDisplay() が使える
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello, world."));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(3);
    }
}
