package src.controller;

import src.model.Department;
import src.model.Employee;
import src.model.University;

public class Controller {
    private University university = new University("UNESP");

    public void addDepartment(String name) {
        university.addDepartment(name);
    }

    public Department searchDepartmentByName(String name) {
        return university.searchDepartmentByName(name);
    }

    public Department searchDepartmentByCode(String code) {
        return university.searchDepartmentByCode(code);
    }

    public String showDepartmentInfo(String code) {
        return university.showDepartmentInfo(code);
    }

    public void addTechnician(String department, String id, String name, double salary, String level, String function) {
        university.addTechnician(department, id, name, salary, level, function);
    }

    public void addPermanent(String department, String id, String name, double salary, String level, String degree,
            String area) {
        university.addPermanent(department, id, name, salary, level, degree, area);
    }

    public void addSubstitute(String department, String id, String name, double salary, String level, String degree,
            int workLoad) {
        university.addSubstitute(department, id, name, salary, level, degree, workLoad);
    }

    public void printDepartments() {
        university.printDepartments();
    }

    public void printGeneralReport() {
        university.generalReport();
    }

    public Employee searchEmployeeByName(String name) {
        return university.searchEmployeeByName(name);
    }

    public Employee searchEmployeeById(String id) {
        return university.searchEmployeeById(id);
    }

    public String departmentReport() {
        return university.departmentReport();
    }

    public String departmentReportByCost(double min, double max) {
        return university.departmentReportByCost(min, max);
    }

    public String employeeReportByCost(double min, double max) {
        return university.employeeReportByCost(min, max);
    }

    public String technicianReport() {
        return university.technicianReport();
    }

    public String professorReport() {
        return university.professorReport();
    }

    public String permanentReport() {
        return university.permanentReport();
    }

    public String substituteReport() {
        return university.substituteReport();
    }

    public String getAllEmployees() {
        return university.getAllEmployes();
    }
}
