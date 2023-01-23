package com.corejava.basics.abstraction;

public class AbstractClassDemo {

    public static void main(String[] args) {

    }

}

abstract class Shape {

    private double length;
    private double breadth;
    private double height;
    private double radius;
    private double side;

    void display() {
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(height);
        System.out.println(radius);
        System.out.println(side);
    }

    public abstract double area();
}

class Square extends Shape {

    @Override
    public double area() {
        return 0;
    }
}


class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee() {

    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

    void displayOnlyIdAndName() {
        System.out.println(id);
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class PermanentEmployee extends Employee {
}

// Concrete class Vs Abstract class

// concrete method vs abstract method

//Abstraction: Without discussing internal details just we concentrate/focus on external things(interfaces)

//Definition of method mean body

// Abstract class : Not full defined class
