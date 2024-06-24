package org.example.upcastingdowncasting.employees;

public class PartTimeEmployee extends Employee {

    private double hourlyRate;

    public PartTimeEmployee(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    public void calculatePay(int hoursWorked) {
        System.out.println(getName() + " received " + (hoursWorked * hourlyRate) + " dollars for " + hoursWorked + " hours of work.");
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
