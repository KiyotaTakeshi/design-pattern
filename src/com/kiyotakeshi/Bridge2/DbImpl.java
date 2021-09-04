package com.kiyotakeshi.Bridge2;

import java.util.ArrayList;
import java.util.List;

public abstract class DbImpl {

    public abstract void connect();

    public List<Employee> findAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();

        Employee mike = new Employee("mike", 20);
        employeeList.add(mike);
        Employee popcorn = new Employee("popcorn", 25);
        employeeList.add(popcorn);

        return employeeList;
    }

    public abstract void close();
}
