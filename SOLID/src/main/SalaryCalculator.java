package main;

public class SalaryCalculator {

    public double calculateSalary(String name) {
        main.EmployeeManager employeeManager = new main.EmployeeManager();
        return employeeManager.calculateSalary(name);
    }
}
