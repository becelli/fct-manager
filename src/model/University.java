package src.model;

public class University {
    private String name;
    private Department[] departments;
    private int max = 100;
    private int count = 0;

    public University() {
        this.name = "";
        this.departments = new Department[max];
    }

    public University(String name) {
        this.name = name;
        this.departments = new Department[max];
    }

    public void addDepartment(Department d) {

        if (count < max) {
            this.departments[count] = d;
            this.count++;
        }
    }

    public Department searchDepartment(String name) {

        for (int i = 0; i < count; i++) {
            if (this.departments[i].getName().equals(name))
                return this.departments[i];
        }

        return null;
    }

    public void printDepartments() {
        for (int i = 0; i < count; i++)
            System.out.println("Code: " + this.departments[i].getCode() + " Name: " + this.departments[i].getName());
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

    public String DepartmentReport() {
        String r = "";
        for (int i = 0; i < count; i++)
            r.concat(departments[i].report()).concat("\n");
        return r;
    }

    public String DepartmentReportByCost(double min, double max) {
        String d = "";
        for (int i = 0; i < count; i++) {
            if (departments[i].totalCost() > min && departments[i].totalCost() < max)
                d.concat(departments[i].report()).concat("\n\n");
        }
        return d;
    }

    public String getAllEmployes() {
        String all = "";
        for (int i = 0; i < count; i++) {
            all.concat(departments[i].getAllEmployees()).concat("\n\n\n");
        }
        return all;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}