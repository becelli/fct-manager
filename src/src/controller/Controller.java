package src.controller;

import src.model.Department;
import src.model.Employee;
import src.model.University;

public class Controller {
    private University university = new University("UNESP");

    public void addDepartment(String name) {
        university.addDepartment(name);
    }

    public int getNewDepartmentCode() {
        return university.getCount();
    }

    public int getTotalEmployees() {
        return university.getTotalEmployees();
    }

    public Department searchDepartmentByName(String name) {
        return university.searchDepartmentByName(name);
    }

    public Department searchDepartmentByCode(String code) {
        return university.searchDepartmentByCode(code);
    }

    public String showDepartmentInfoByCode(String code) {
        return university.showDepartmentInfoByCode(code);
    }

    public String showDepartmentInfoByName(String name) {
        return university.showDepartmentInfoByName(name);
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
    
    public void removeEmployeeByName(String name) {
        university.removeEmployeeByName(name);
    }
    
    public void removeEmployeeById(String id) {
        university.removeEmployeeById(id);
    }
    
    public String getDepartments() {
        return university.getDepartments();
    }

    public String getGeneralReport() {
        return university.generalReport();
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

    public Department search(String name) {
        return university.search(name);
    }

    public String[] getAllDepartmentsName() {
        return university.getAllDepartmentsName();
    }

    public String[] getAllDepartmentsCode() {
        return university.getAllDepartmentsCode();
    }
    
}
