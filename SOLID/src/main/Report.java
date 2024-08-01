package main;

public class Report {
    
    private ReportGenerator reportGenerator;

    public Report(ReportGenerator reportGenerator){
        this.reportGenerator= reportGenerator;
    }

    public void generateReport(EmployeeManager employeeManager) {
        System.out.println("Generando un reporte");
        reportGenerator.generateReport(employeeManager);
    }

}
