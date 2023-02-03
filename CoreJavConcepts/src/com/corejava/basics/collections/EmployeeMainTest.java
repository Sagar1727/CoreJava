package com.corejava.basics.collections;

public class EmployeeMainTest {
    public static void main(String[] args) {
        EmployeeInter employeeInter = new EmployeeInterImpl();
        employeeInter.display();
        employeeInter.show();
    }
}
