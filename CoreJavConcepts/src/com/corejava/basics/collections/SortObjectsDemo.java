package com.corejava.basics.collections;

import java.util.*;

public class SortObjectsDemo {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Girirsh", "Sunny", "Mahesh");

        String str = new String("Java Programming");

        System.out.println(str);

        Employee employee1 = new Employee(1, "Girish", 30000);

        Employee employee2 = new Employee(2, "Suresh", 60000);

        System.out.println("Result:" + employee1.compareTo(employee2));

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Suresh", 30000));
        employeeList.add(new Employee(6, "Suresh", 30000));
        employeeList.add(new Employee(2, "Suresh", 30000));
        employeeList.add(new Employee(3, "Bharath", 10000));
        employeeList.add(new Employee(4, "Sunny", 3000));
        employeeList.add(new Employee(5, "Mahesh", 300000));

        System.out.println("Before Sorting");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        Collections.sort(employeeList);

        System.out.println("After Sorting");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }



        SortObjectsDemo sortObjectsDemo = new SortObjectsDemo();
        sortObjectsDemo.display();

    }

























    void display() {
        System.out.println("Display method");
    }
}
