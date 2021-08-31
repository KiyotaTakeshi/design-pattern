package com.kiyotakeshi.Builder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

// ConcreteBuilder
public class TextBuilder implements Builder {
    private StringBuffer sb = new StringBuffer();

    @Override
    public void makeHeader() {
        sb
                .append("---------\n")
                .append("employee list\n")
                .append("---------\n");
    }

    @Override
    public void makeEmployeeList(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            sb
                    .append("name: " + employee.getName() + "\n")
                    .append("age: " + employee.getAge() + "\n")
                    .append("department: " + employee.getDepartment() + "\n")
                    .append("\n");
        }
    }

    public String getResult() {
        String fileName = "employee.txt";
        File file = new File(fileName);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }
}
