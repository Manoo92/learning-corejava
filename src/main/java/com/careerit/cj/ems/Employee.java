package com.careerit.cj.ems;

public class Employee extends Person {
    private String employeeId;
    private double salary;
    private Car car = new Car();

    public Employee() {
    }

    public Employee(String name, int age, String email, String employeeId, double salary, Car car) {
        super(name, age, email);
        this.employeeId = employeeId;
        this.salary = salary;
        this.car = car;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}