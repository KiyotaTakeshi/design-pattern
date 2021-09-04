package com.kiyotakeshi.Strategy;

import java.util.List;

// ConcreteStrategy
public class BinaryStrategy implements Strategy {

    @Override
    public Employee search(List<Employee> employeeList, int id) {
        Employee result = null;

        int left = 1; // 最小
        int right = employeeList.size(); // 最大
        int searchCount = 0;

        long startTime = System.nanoTime();

        while (left < right) {

            searchCount++;

            // 中央値
            int median = left + (right - left) / 2;

            if (median == id) {
                result = employeeList.get(median);
                break;
            } else if (id < median) {
                // 中央値より id が小さい場合は
                // 最大値を中央値にして再探索
                right = median;
            } else if (median < id) {
                left = median + 1;
            }
        }
        long endTime = System.nanoTime();

        System.out.println("binary strategy time: " + (endTime - startTime) + "/ns");
        System.out.println("search count: " + searchCount);

        return result;
    }
}
