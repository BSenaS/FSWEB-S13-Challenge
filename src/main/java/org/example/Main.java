package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John Doe", "john@example.com", "password123", new String[]{"Plan1", "Plan2"});
        System.out.println(employee);
        Company company = new Company(2,"Batu",5000.50,new String[]{"Batu","Ahmet"});
        System.out.println(company);
        Healthplan healthplan = new Healthplan(3,"Batu", Plan.BASIC);
        System.out.println(healthplan);
    }
}