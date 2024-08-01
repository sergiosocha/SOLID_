package main;
public class SalaryCalculator {

    private calculateSalary calculateSalary;

    public SalaryCalculator(calculateSalary calculateSalary){
        this.calculateSalary = calculateSalary;
    }
    public double calculateSalaryOp(String name) {
        return calculateSalary.calculateSalaryOp(name);
    }
}
