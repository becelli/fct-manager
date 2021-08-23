package src.model;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.graalvm.compiler.phases.common.DeadCodeEliminationPhase;

public class University {
    private String name;
    private Department[] departments;
    private int max = 100;
    private int count = 0;
    private int totalEmployees = 0;

    public University() {
        this.name = "";
        this.departments = new Department[max];
    }

    public University(String name) {
        this.name = name;
        this.departments = new Department[max];
    }

    public void addDepartment(String name) {
        if (count < max) {
            departments[count] = new Department(Integer.toString(count + 1), name);
            count++;
        }
    }

    public Department searchDepartmentByName(String name) {
        for (int i = 0; i < count; i++) {
            if (departments[i] != null)
                if (departments[i].getName().equals(name))
                    return departments[i];
        }
        return null;
    }

    public Department searchDepartmentByCode(String code) {
        for (int i = 0; i < count; i++) {
            if (departments[i] != null)
                if (departments[i].getCode().equals(code))
                    return departments[i];
        }
        return null;
    }

    public String showDepartmentInfoByCode(String code) {
        Department d = searchDepartmentByCode(code);
        return d.report() + "\n" + d.getAllEmployees();
    }

    public String showDepartmentInfoByName(String name) {
        Department d = searchDepartmentByName(name);
        return d.report() + "\n" + d.getAllEmployees();
    }

    public String departmentReport() {
        String r = "";
        for (int i = 0; i < count; i++)
            if (departments[i] != null)
                r += departments[i].report() + "\n\n";
        return r;
    }

    public String getDepartments() {
        String all = "";
        for (int i = 0; i < count; i++)
            if (departments[i] != null)
                all += "Code: " + this.departments[i].getCode() + " Name: " + this.departments[i].getName();
        return all;
    }

    public String departmentReportByCost(double min, double max) {
        String d = "";
        for (int i = 0; i < count; i++) {
            if (departments[i] != null)
                if (departments[i].totalCost() > min && departments[i].totalCost() < max)
                    d += departments[i].report();
        }
        return d;
    }

    public String getAllEmployes() {
        String all = "";
        for (int i = 0; i < count; i++)
            if (departments[i] != null)
                all += departments[i].getAllEmployees();
        return all;
    }

    public String[] getAllDepartmentsName() {
        String all[] = new String[count];
        for (int i = 0; i < count; i++)
            if (departments[i] != null)
                all[i] = departments[i].getName();
        return all;
    }

    public String[] getAllDepartmentsCode() {
        String all[] = new String[count];
        for (int i = 0; i < count; i++)
            if (departments[i] != null)
                all[i] = departments[i].getCode();
        return all;
    }

    public void addTechnician(String department, String id, String name, double salary, String level, String function) {
        Employee e = new Technician(id, name, salary, level, function);
        addEmployeeToDepartment(department, e);
    }

    public void addSubstitute(String department, String id, String name, double salary, String level, String degree,
            int workLoad) {
        Employee e = new Substitute(id, name, salary, level, degree, workLoad);
        addEmployeeToDepartment(department, e);
    }

    public void addPermanent(String department, String id, String name, double salary, String level, String degree,
            String area) {
        Employee e = new Permanent(id, name, salary, level, degree, area);
        addEmployeeToDepartment(department, e);
    }

    public void addEmployeeToDepartment(String d, Employee e) {
        Department dptm = searchDepartmentByName(d);
        if (dptm != null) {
            totalEmployees++;
            dptm.addEmployee(e);
        }
    }

    public void removeEmployee(String data, boolean op) {
        boolean f = false;
        for (int i = 0; i < count; i++) {
            if (departments[i] != null) {
                if (op)
                    f = departments[i].removeEmployeeById(data);
                else
                    f = departments[i].removeEmployeeByName(data);
                if (f)
                    break;
            }
        }
    }

    public void removeDepartmentByCode(String code) {
        for (int i = 0; i < count; i++) {
            if (departments[i] != null) {
                if (departments[i].getCode().equals(code)) {
                    departments[i] = null;
                }
            }

        }
    }

    public void removeDepartmentByName(String name) {
        for (int i = 0; i < count; i++) {
            if (departments[i] != null) {
                if (departments[i].getName().equals(name)) {
                    departments[i] = null;
                }
            }
        }
    }

    public Employee searchEmployeeByName(String name) {
        Employee e;
        for (int i = 0; i < count; i++) {
            e = departments[i].searchEmployeeByName(name);
            if (e != null)
                return e;
        }
        return null;
    }

    public Employee searchEmployeeById(String id) {
        Employee e;
        for (int i = 0; i < count; i++) {
            e = departments[i].searchEmployeeById(id);
            if (e != null)
                return e;
        }
        return null;
    }

    public String employeeReportByCost(double min, double max) {
        String all = "";
        for (int i = 0; i < count; i++) {
            if (departments[i] != null) {
                int f = departments[i].getCount();
                for (int j = 0; j < f; j++) {
                    Employee e = departments[j].searchEmployeeByCost(min, max);
                    if (e != null)
                        all += departments[j].getEmployeeInfo(e) + "\n";
                }
            }
        }
        return all;
    }

    public String technicianReport() {
        String all = "";
        for (int i = 0; i < count; i++)
            if (departments[i] != null)
                all += departments[i].searchTechnician();
        return all;
    }

    public String substituteReport() {
        String all = "";
        for (int i = 0; i < count; i++)
            if (departments[i] != null)
                all += departments[i].searchSubstitute();
        return all;
    }

    public String permanentReport() {
        String all = "";
        for (int i = 0; i < count; i++)
            if (departments[i] != null)
                all += departments[i].searchPermanent();
        return all;
    }

    public String professorReport() {
        String all = "";
        for (int i = 0; i < count; i++)
            if (departments[i] != null)
                all += departments[i].searchProfessor();
        return all;
    }

    public String generalReport() {
        String all = "";
        for (int i = 0; i < count; i++) {
            if (departments[i] != null)
                all += departments[i].report() + "\n" + departments[i].getAllEmployees() + "\n";
        }
        return all;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }

    public Department search(String name) {
        Department d = searchDepartmentByName(name);
        if (d != null) {
            try {
                return d.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(University.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
