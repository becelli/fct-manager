package src.model;

public class Technician extends Employee {
    private String function;

    public Technician() {
        super();
        function = "T1";
    }

    public Technician(String id, String name, double salary, String level, String function) {
        super(id, name, salary, level);
        this.function = function;
    }

    @Override
    public double calculateSalary() {
        if (getLevel().equals("T1"))
            return getSalary() * 1.1;
        return getSalary() * 1.2;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}