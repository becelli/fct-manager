
package src.view;

import java.util.Random;

public class Main {
    public static void main(String args[]) {
        int MAX = 20;
        Random rand = new Random();
        for (int i = 0; i < MAX; i++) {
            int f = rand.nextInt(3);
            if (f == 0) {
                double s = rand.nextDouble() > 0.7 ? 7000.0 : 6000.0;
                int t = rand.nextInt(3);
                String nivel;
                if (t == 1)
                    nivel = "T1";
                else if (t == 2)
                    nivel = "T2";
                else
                    nivel = "T3";
                int u = rand.nextInt(5);
                String degree;
                if (u == 0)
                    degree = "Graduação";
                else if (u == 1)
                    degree = "Doutorado";
                else if (u == 2)
                    degree = "Titular";
                else if (u == 3)
                    degree = "Mestrado";
                else if (u == 4)
                    degree = "Livre-Docente";
                else
                    degree = "Titular";

                int v = rand.nextInt(4);
                String area;
                if (v == 0)
                    area = "Biológicas";
                else if (v == 1)
                    area = "Exatas";
                else if (v == 2)
                    area = "Humanas";
                else
                    area = "Saúde";
                employee[i] = new Effective(Integer.toString(i + 1), "Fátima", s, nivel, degree, area);
            } else if (f == 1) {
                double s = rand.nextDouble() > 0.7 ? 4000.0 : 3000.0;
                int t = rand.nextInt(2);
                String nivel;
                if (t == 1)
                    nivel = "S1";
                else
                    nivel = "S2";
                int u = rand.nextInt(4);
                String degree;
                if (u == 0) {
                    degree = "Livre-Docente";
                } else if (u == 1) {
                    degree = "Mestrado";
                } else if (u == 2)
                    degree = "Titular";
                else
                    degree = "Saúde";
                int workload = rand.nextDouble() > 0.5 ? 12 : 24;
                employee[i] = new Substitute(Integer.toString(i + 1), "Cleiton", s, nivel, degree, workload);
            } else {
                double s = rand.nextDouble() > 0.7 ? 3000.0 : 2000.0;
                int t = rand.nextInt(2);
                String nivel;
                if (t == 1)
                    nivel = "T1";
                else
                    nivel = "T2";
                int u = rand.nextInt(3);
                String funcao;
                if (u == 0) {
                    funcao = "Assessor";
                } else if (u == 1) {
                    funcao = "Laboratório";
                } else
                    funcao = "Secretário";
                employee[i] = new Technician(Integer.toString(i + 1), "Jackson", s, nivel, funcao);
            }
        }
        for (int i = 0; i < MAX; i++) {
            if (employee[i] instanceof Technician) {
                Technician e = (Technician) employee[i];
                System.out.println(e.getId() + " " + e.getName() + " " + e.calculateSalary() + " " + e.getLevel() + " "
                        + e.getFunction());
            } else if (employee[i] instanceof Substitute) {
                Substitute e = (Substitute) employee[i];
                System.out.println(e.getId() + " " + e.getName() + " " + e.calculateSalary() + " " + e.getLevel() + " "
                        + e.getDegree() + " " + e.getWorkLoad());
            } else {
                Effective e = (Effective) employee[i];
                System.out.println(e.getId() + " " + e.getName() + " " + e.calculateSalary() + " " + e.getLevel() + " "
                        + e.getDegree() + " " + e.getArea());
            }
        }
    }
}
