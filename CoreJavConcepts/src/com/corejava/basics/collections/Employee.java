package com.corejava.basics.collections;

public class Employee implements Comparable<Employee> {
    private Integer id;
    private String name;
    private Double salary;

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

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(Employee employee) {
        if (this.name.compareTo(employee.name) != 0) {
            return this.name.compareTo(employee.name);
        } else if (this.name.compareTo(employee.name) == 0) {
            if (this.salary.compareTo(employee.salary) != 0) {
                return this.salary.compareTo(employee.salary);
            } else {
                return this.id.compareTo(employee.id);
            }
        }
        return 0;
    }
}
