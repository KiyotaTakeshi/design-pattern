package com.kiyotakeshi.Builder;

import java.util.ArrayList;
import java.util.List;

// Client
public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee mike = new Employee("mike", 28, "sales");
        employeeList.add(mike);

        Employee popcorn = new Employee("popcorn", 29, "marketing");
        employeeList.add(popcorn);

        CsvBuilder csvBuilder = new CsvBuilder();
        Director csvDirector = new Director(csvBuilder);
        // Director にインスタンス作成の依頼
        csvDirector.construct(employeeList);
        String contents = csvBuilder.getResult();
        System.out.println(contents);
        System.out.println();

        TextBuilder textBuilder = new TextBuilder();
        Director textDirector = new Director(textBuilder);
        textDirector.construct(employeeList);
        String fileName = textBuilder.getResult();
        System.out.printf("created %s", fileName);
    }
}
