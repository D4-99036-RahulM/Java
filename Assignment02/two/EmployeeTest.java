package com.sunbeam.two;

public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Rahul", "Sharma", 50000.0);
        Employee emp2 = new Employee("Priya", "Patel", 65000.0);

        
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " Yearly Salary: " + (emp1.getMonthlySalary() * 12));
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " Yearly Salary: " + (emp2.getMonthlySalary() * 12));

       
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        System.out.println("\n--- After 10% Raise ---");

       
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " New Yearly Salary: " + (emp1.getMonthlySalary() * 12));
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " New Yearly Salary: " + (emp2.getMonthlySalary() * 12));
    }
}
