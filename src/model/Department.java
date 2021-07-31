package src.model;

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

    public Employee searchEmployeeById(String id) {
        for (int i = 0; i < count; i++)
            if (employees[i].getId().equals(id))
                return employees[i];
        return null;
    }

    public Employee searchEmployeeByName(String name) {
        for (int i = 0; i < count; i++)
            if (employees[i].getName().equals(name))
                return employees[i];
        return null;
    }

    public String report() {
        return this.getName() + "\n" + count + "\n" + totalCost();
    }

    public String getAllEmployees() {
        String all = "";
        for (int i = 0; i < count; i++) {
            Employee e = employees[i];
            all.concat(e.getId()).concat("\n").concat(e.getName()).concat("\n")
                    .concat(Double.toString(e.calculateSalary())).concat("\n").concat(e.getLevel()).concat("\n");
            if (employees[i] instanceof Technician) {
                Technician t = (Technician) employees[i];
                all.concat(t.getFunction()).concat("\n\n");
            } else {
                Professor prof = (Professor) employees[i];
                all.concat(prof.getDegree().concat("\n"));
                if (prof instanceof Effective) {
                    Effective ef = (Effective) prof;
                    all.concat(ef.getArea().concat("\n\n"));
                } else {
                    Substitute subs = (Substitute) prof;
                    all.concat(Double.toString(subs.getWorkLoad()).concat("\n\n"));
                }
            }
        }
        return all;
    }

    public double totalCost() {
        double cost = 0.0;
        for (int i = 0; i < count; i++)
            cost += employees[i].calculateSalary();
        return cost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }
}