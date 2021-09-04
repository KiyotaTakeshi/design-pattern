package com.kiyotakeshi.Bridge2;

import java.util.List;

// RefinedAbstraction = 機能クラスに機能を追加したもの
public class CustomDisplay extends Display {
    public CustomDisplay(DbImpl impl) {
        super(impl);
    }

    public void filterByAgeUnder(int age) {
        // call super class method
        List<Employee> employeeList = getEmployeeList();

        for (Employee employee : employeeList) {
            // 引数の年齢以下か判定
            if (employee.getAge() <= age) {
                System.out.println(employee);
            }
        }
    }
}
