package com.kiyotakeshi.Bridge2;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new MySqlImpl());
        d1.showEmployeeList();

        Display d2 = new CustomDisplay(new PostgreSqlImpl());
        d2.showEmployeeList();

        CustomDisplay d3 = new CustomDisplay(new PostgreSqlImpl());
        System.out.println("call filterByAgeUnder");
        d3.filterByAgeUnder(22);
    }
}
