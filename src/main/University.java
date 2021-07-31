package src.main;

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
            if (departments[i].getName().equals(name))
                return this.departments[i];
        }

        return null;
    }

    public Employee searchEmployee(String name) {
        for (int i = 0; i < count; i++) {
            Employee e = this.departments[i].searchEmployee(name);

            if (e != null)
                return e;
        }

        return null;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}