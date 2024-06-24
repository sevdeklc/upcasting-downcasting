package org.example.upcastingdowncasting;

import org.example.upcastingdowncasting.employees.Employee;
import org.example.upcastingdowncasting.employees.FullTimeEmployee;
import org.example.upcastingdowncasting.employees.PartTimeEmployee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John", 5000);
        employees.add(fullTimeEmployee); // Upcasting

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane", 20);
        employees.add(partTimeEmployee); // Upcasting

        for (Employee employee : employees) {
            employee.work();

            if (employee instanceof FullTimeEmployee) {
                FullTimeEmployee full = (FullTimeEmployee) employee; // Downcasting
                full.paySalary();
            } else if (employee instanceof PartTimeEmployee) {
                PartTimeEmployee part = (PartTimeEmployee) employee; // Downcasting
                part.calculatePay(100);
            }

            //To get a ClassCastException error, remove the instanceof check and add this.
/*            PartTimeEmployee part = (PartTimeEmployee) employee;
            part.calculatePay(100);*/
        }
    }
}