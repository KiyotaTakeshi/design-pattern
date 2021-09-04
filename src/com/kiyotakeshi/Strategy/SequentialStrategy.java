package com.kiyotakeshi.Strategy;

import java.util.List;

// ConcreteStrategy
public class SequentialStrategy implements Strategy {

    @Override
    public Employee search(List<Employee> employeeList, int id) {
        Employee result = null;

        long startTime = System.nanoTime();

        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                result = employee;
                break;
            }
        }
        long endTime = System.nanoTime();

        System.out.println("sequential strategy time: " + (endTime - startTime) + "/ns");

        return result;
    }
}
