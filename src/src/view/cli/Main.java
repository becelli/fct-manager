package src.view.cli;

import java.util.Random;

import src.controller.Controller;
import src.model.Permanent;

public class Main {
    public static void main(String args[]) {
        Controller c = new Controller();
        c.addDepartment("MATEMATICA");
        c.addDepartment("FÍSICA");
        c.addTechnician("MATEMATICA", "001", "GUSTAVO", 3000.0, "T1", "Assessor");
        c.addTechnician("MATEMATICA", "001", "GUSTAO", 3000.0, "T2", "Faxineiro");
        c.addTechnician("FÍSICA", "001", "GUSTAO", 3000.0, "T3", "Cavalheiro");
        c.addSubstitute("FÍSICA", "001", "GUSTAVO", 1500.0, "T1", "PHD", 12);
        c.addPermanent("MATEMATICA", "001", "GUSTAVO", 3000.0, "T1", "Mestre", "Astrofísica");
        // c.addTechnician("MATEMATICA", "002", "GUSTAV3", 3000.0, "T2", "Assessor");
        // c.printGeneralReport();
        // System.out.println(c.getAllEmployees());
        // System.out.println(c.departmentReport());
        // System.out.println(c.employeeReportByCost(1000, 2000));
        // System.out.println(c.technicianReport());
        // System.out.println(c.professorReport());
        // System.out.println(c.permanentReport());
        // System.out.println(c.substituteReport());
        System.out.println(c.showDepartmentInfo(Integer.toString(2)));

        // int MAX = 20;
        // Random rand = new Random();
        // for (int i = 0; i < MAX; i++) {
        // int f = rand.nextInt(3);
        // if (f == 0) {
        // double s = rand.nextDouble() > 0.7 ? 7000.0 : 6000.0;
        // int t = rand.nextInt(3);
        // String nivel;
        // if (t == 1)
        // nivel = "T1";
        // else if (t == 2)
        // nivel = "T2";
        // else
        // nivel = "T3";
        // int u = rand.nextInt(5);
        // String degree;
        // if (u == 0)
        // degree = "Graduação";
        // else if (u == 1)
        // degree = "Doutorado";
        // else if (u == 2)
        // degree = "Titular";
        // else if (u == 3)
        // degree = "Mestrado";
        // else if (u == 4)
        // degree = "Livre-Docente";
        // else
        // degree = "Titular";

        // int v = rand.nextInt(4);
        // String area;
        // if (v == 0)
        // area = "Biológicas";
        // else if (v == 1)
        // area = "Exatas";
        // else if (v == 2)
        // area = "Humanas";
        // else
        // area = "Saúde";
        // c.addPermanent("Matematica", Integer.toString(i + 1), "Fátima", s, nivel,
        // degree, area);
        // } else if (f == 1) {
        // double s = rand.nextDouble() > 0.7 ? 4000.0 : 3000.0;
        // int t = rand.nextInt(2);
        // String nivel;
        // if (t == 1)
        // nivel = "S1";
        // else
        // nivel = "S2";
        // int u = rand.nextInt(4);
        // String degree;
        // if (u == 0) {
        // degree = "Livre-Docente";
        // } else if (u == 1) {
        // degree = "Mestrado";
        // } else if (u == 2)
        // degree = "Titular";
        // else
        // degree = "Saúde";
        // int workload = rand.nextDouble() > 0.5 ? 12 : 24;
        // c.addSubstitute("Sapo", Integer.toString(i + 1), "Cleiton", s, nivel, degree,
        // workload);
        // } else {
        // double s = rand.nextDouble() > 0.7 ? 3000.0 : 2000.0;
        // int t = rand.nextInt(2);
        // String nivel;
        // if (t == 1)
        // nivel = "T1";
        // else
        // nivel = "T2";
        // int u = rand.nextInt(3);
        // String funcao;
        // if (u == 0) {
        // funcao = "Assessor";
        // } else if (u == 1) {
        // funcao = "Laboratório";
        // } else
        // funcao = "Secretário";
        // c.addTechnician("Mat", Integer.toString(i + 1), "Jackson", s, nivel, funcao);
        // }
        // }for(

        // int i = 0;i<MAX;i++)
        // {
        // if (employee[i] instanceof Technician) {
        // Technician e = (Technician) employee[i];
        // System.out.println(e.getId() + " " + e.getName() + " " + e.calculateSalary()
        // + " " + e.getLevel() + " "
        // + e.getFunction());
        // } else if (employee[i] instanceof Substitute) {
        // Substitute e = (Substitute) employee[i];
        // System.out.println(e.getId() + " " + e.getName() + " " + e.calculateSalary()
        // + " " + e.getLevel() + " "
        // + e.getDegree() + " " + e.getWorkLoad());
        // } else {
        // Permanent e = (Permanent) employee[i];
        // System.out.println(e.getId() + " " + e.getName() + " " + e.calculateSalary()
        // + " " + e.getLevel() + " "
        // + e.getDegree() + " " + e.getArea());
        // }
        // }
    }
}
