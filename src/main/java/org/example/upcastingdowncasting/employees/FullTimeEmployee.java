package org.example.upcastingdowncasting.employees;

public class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void paySalary() {
        System.out.println(getName() + " received " + salary + " dollars as salary.");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
