package com.kiyotakeshi.Mediator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen();
        boolean play = true;

        String message = "h:HomeButton, a:ApplicationButton, e:Exit";

        while (play) {
            System.out.println(screen);
            System.out.println(message);

            // 入力を受け付ける
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            if ("h".equals(line)) {
                screen.getHomeButton().press();
            } else if ("a".equals(line)) {
                screen.getApplicationButton().press();
            } else if ("e".equals(line)) {
                play = false;
                System.out.println("Finish");
            } else {
                System.out.println("Invalid input");
            }

            System.out.println();
        }
    }
}
