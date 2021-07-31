package src.controller;

import src.model.Department;
import src.model.Employee;
import src.model.University;

public class Controller {
    private University university = new University("UNESP");

    public void addDepartment(Department d) {
        university.addDepartment(d);
    }

    public Department searchDepartment(String name) {
        return university.searchDepartment(name);
    }
    // public void addTechnician()
    // university.addEmployee
    // )

    public void printDepartments() {
        university.printDepartments();
    }

    public Employee searchEmployeeByName(String name) {
        return university.searchEmployeeByName(name);
    }

    public Employee searchEmployeeById(String id) {
        return university.searchEmployeeById(id);
    }

    public String DepartmentReport() {
        return university.DepartmentReport();
    }

    public String DepartmentReportByCost(double min, double max) {
        return university.DepartmentReportByCost(min, max);
    }

    public String getAllEmployees() {
        return university.getAllEmployes();
    }
}
