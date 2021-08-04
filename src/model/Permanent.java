package src.model;

public class Permanent extends Professor {
    private String area;

    public Permanent() {
        super();
        this.area = "";
    }

    public Permanent(String id, String name, double salary, String level, String degree, String area) {
        super(id, name, salary, level, degree);
        this.area = area;
    }

    @Override
    public double calculateSalary() {
        double wage = getSalary();
        if (getLevel().equals("D1"))
            wage *= 1.05;
        else if (getLevel().equals("D2"))
            wage *= 1.1;
        else
            wage *= 1.2;
        return wage + getSalary() * 0.05;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }
}
