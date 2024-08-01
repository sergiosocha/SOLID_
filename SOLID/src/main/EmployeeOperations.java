package com.SOLID.src.main;

public interface EmployeeOperations {
    void addEmployee(String name);

    void removeEmployee(String name);

    double calculateSalary(String name);

    void saveToFile(String name);
}
