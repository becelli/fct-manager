package src.main;

public class Department {
    private String code;
    private String name;
    private Employee employees[];
    private int count;
    private final int MAX = 100;

    public Department() {
        code = "";
        name = "";
        count = 0;
        employees = new Employee[MAX];
    }

    public Department(String code, String name) {
        this.code = code;
        this.name = name;
        count = 0;
    }

    public void addEmployee(Employee e) {
        if (count < MAX) {
            employees[count] = e;
            count++;
        }
    }

    public Employee searchEmployee(String name) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getName().equals(name)) {
                return employees[i];
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode() {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getCount() {
        return count;
    }
}