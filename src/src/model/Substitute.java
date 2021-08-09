package src.model;

public class Substitute extends Professor {
    private int workLoad;

    public Substitute() {
        super();
        workLoad = 0;
    }

    public Substitute(String id, String name, double salary, String level, String degree, int workLoad) {
        super(id, name, salary, level, degree);
        this.workLoad = workLoad;
    }

    @Override
    public double calculateSalary() {
        if (getLevel().equals("S1"))
            return getSalary() * 1.05;
        return getSalary() * 1.1;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }

    public int getWorkLoad() {
        return workLoad;
    }
}
