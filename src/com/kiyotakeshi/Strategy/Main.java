package com.kiyotakeshi.Strategy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SearchApi sequential = new SearchApi(new SequentialStrategy());
        SearchApi binary = new SearchApi(new BinaryStrategy());

        int random = new Random().nextInt(10000) + 1;
        System.out.printf("random number:%s\n\n", random);

        Employee employee1 = sequential.searchEmployee(random);
        System.out.println(employee1);

        System.out.println();

        Employee employee2 = binary.searchEmployee(random);
        System.out.println(employee2);
    }
}
