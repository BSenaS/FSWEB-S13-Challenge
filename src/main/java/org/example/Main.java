package org.example;
import org.example.enums.Plan;
public class Main {

    public static void main(String[] args) {

        printResults();

    }

    public static void printResults() {

        Employee employee = new Employee(1, "John Doe", "john@example.com", "password123", new String[]{"Plan1", "Plan2"});

        System.out.println(employee.toString());




        Company company = new Company(1, "ABC Company", 10000, new String[]{"Developer1", "Developer2"});

        System.out.println(company.toString());




        Healthplan healthPlan = new Healthplan(1, "My Health Plan", Plan.BASIC);

        System.out.println(healthPlan.toString());

    }

}