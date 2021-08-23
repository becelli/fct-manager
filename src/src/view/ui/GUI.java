package src.view.ui;

import java.util.Random;

import src.controller.Controller;
import view.ui.addDepartment;

public class GUI extends javax.swing.JFrame {
    private static Controller c = new Controller();

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        Menu = new javax.swing.JMenuBar();
        addMenu = new javax.swing.JMenu();
        addDepartment = new javax.swing.JMenuItem();
        addEmployee = new javax.swing.JMenu();
        addTechnician = new javax.swing.JMenuItem();
        addProfessor = new javax.swing.JMenu();
        addEffective = new javax.swing.JMenuItem();
        addSubstitute = new javax.swing.JMenuItem();
        removeMenu = new javax.swing.JMenu();
        removeDepartment = new javax.swing.JMenuItem();
        removeEmployee = new javax.swing.JMenuItem();
        searchMenu = new javax.swing.JMenu();
        searchDepartment = new javax.swing.JMenu();
        searchDepartmentByCode = new javax.swing.JMenuItem();
        searchDepartmentByName = new javax.swing.JMenuItem();
        searchEmployee = new javax.swing.JMenu();
        searchEmployeeById = new javax.swing.JMenuItem();
        searchEmployeeByName = new javax.swing.JMenuItem();
        searchEmployeeBySalary = new javax.swing.JMenuItem();
        reportMenu = new javax.swing.JMenu();
        generalReport = new javax.swing.JMenuItem();
        departmentReport = new javax.swing.JMenu();
        departmentGeneralReport = new javax.swing.JMenuItem();
        departmentSalaryReport = new javax.swing.JMenuItem();
        departmentGeneralInfo = new javax.swing.JMenuItem();
        employeeReport = new javax.swing.JMenu();
        employeeGeneralReport = new javax.swing.JMenuItem();
        employeeBySalarylReport = new javax.swing.JMenuItem();
        technicianReport = new javax.swing.JMenuItem();
        professorReport = new javax.swing.JMenuItem();
        effectiveReport = new javax.swing.JMenuItem();
        substituteReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Universidade Estadual Paulista");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(33, 150, 243));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        setForeground(java.awt.Color.darkGray);
        setMinimumSize(new java.awt.Dimension(480, 270));

        jLabel1.setBackground(new java.awt.Color(0, 147, 221));
        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Copyright © 2021 - Cadastro UNESP");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        jLabel2.setText("Cadastro UNESP");

        jSeparator1.setForeground(new java.awt.Color(33, 150, 243));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel3.setText("Seja bem-vindo(a) ao cadastro de departamentos e funcionários da Universidade Estadual Paulista.");
        jLabel3.setPreferredSize(new java.awt.Dimension(620, 10));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setText("O que você gostaria de fazer?");
        jLabel4.setPreferredSize(new java.awt.Dimension(171, 15));

        jButton1.setBackground(new java.awt.Color(33, 150, 243));
        jButton1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(33, 150, 243));
        jToggleButton1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(240, 240, 240));
        jToggleButton1.setText("Buscar");
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setOpaque(true);

        Menu.setForeground(new java.awt.Color(240, 240, 240));
        Menu.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        Menu.setMaximumSize(new java.awt.Dimension(400, 32769));

        addMenu.setText("Cadastrar");
        addMenu.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        addDepartment.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        addDepartment.setText("Departamento");
        addDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDepartmentActionPerformed(evt);
            }
        });
        addMenu.add(addDepartment);

        addEmployee.setText("Funcionário");
        addEmployee.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        addTechnician.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        addTechnician.setText("Técnico");
        addTechnician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTechnicianActionPerformed(evt);
            }
        });
        addEmployee.add(addTechnician);

        addProfessor.setText("Docente");
        addProfessor.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        addEffective.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        addEffective.setText("Efetivo");
        addEffective.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEffectiveActionPerformed(evt);
            }
        });
        addProfessor.add(addEffective);

        addSubstitute.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        addSubstitute.setText("Substituto");
        addSubstitute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubstituteActionPerformed(evt);
            }
        });
        addProfessor.add(addSubstitute);

        addEmployee.add(addProfessor);

        addMenu.add(addEmployee);

        Menu.add(addMenu);

        removeMenu.setText("Excluir");
        removeMenu.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        removeDepartment.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        removeDepartment.setText("Departamento");
        removeMenu.add(removeDepartment);

        removeEmployee.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        removeEmployee.setText("Funcionário");
        removeEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEmployeeActionPerformed(evt);
            }
        });
        removeMenu.add(removeEmployee);

        Menu.add(removeMenu);

        searchMenu.setText("Buscar");
        searchMenu.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        searchDepartment.setText("Departamento");
        searchDepartment.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        searchDepartmentByCode.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        searchDepartmentByCode.setText("Código");
        searchDepartmentByCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDepartmentByCodeActionPerformed(evt);
            }
        });
        searchDepartment.add(searchDepartmentByCode);

        searchDepartmentByName.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        searchDepartmentByName.setText("Nome");
        searchDepartmentByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDepartmentByNameActionPerformed(evt);
            }
        });
        searchDepartment.add(searchDepartmentByName);

        searchMenu.add(searchDepartment);

        searchEmployee.setText("Funcionário");
        searchEmployee.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        searchEmployeeById.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        searchEmployeeById.setText("Registro");
        searchEmployee.add(searchEmployeeById);

        searchEmployeeByName.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        searchEmployeeByName.setText("Nome");
        searchEmployee.add(searchEmployeeByName);

        searchEmployeeBySalary.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        searchEmployeeBySalary.setText("Faixa Salarial");
        searchEmployee.add(searchEmployeeBySalary);

        searchMenu.add(searchEmployee);

        Menu.add(searchMenu);

        reportMenu.setText("Relatório");
        reportMenu.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        generalReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        generalReport.setText("Geral");
        generalReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generalReportActionPerformed(evt);
            }
        });
        reportMenu.add(generalReport);

        departmentReport.setText("Departamentos");
        departmentReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        departmentGeneralReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        departmentGeneralReport.setText("Resumo geral");
        departmentReport.add(departmentGeneralReport);

        departmentSalaryReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        departmentSalaryReport.setText("Resumo por faixa salarial");
        departmentReport.add(departmentSalaryReport);

        departmentGeneralInfo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        departmentGeneralInfo.setText("Exibir informações...");
        departmentReport.add(departmentGeneralInfo);

        reportMenu.add(departmentReport);

        employeeReport.setText("Funcionários");
        employeeReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        employeeGeneralReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        employeeGeneralReport.setText("Todos os funcionários");
        employeeReport.add(employeeGeneralReport);

        employeeBySalarylReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        employeeBySalarylReport.setText("Resumo por faixa salarial");
        employeeReport.add(employeeBySalarylReport);

        technicianReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        technicianReport.setText("Técnicos");
        employeeReport.add(technicianReport);

        professorReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        professorReport.setText("Docentes");
        employeeReport.add(professorReport);

        effectiveReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        effectiveReport.setText("Docentes efeitvos");
        employeeReport.add(effectiveReport);

        substituteReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        substituteReport.setText("Docentes substitutos");
        employeeReport.add(substituteReport);

        reportMenu.add(employeeReport);

        Menu.add(reportMenu);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleName("Unesp");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addEffectiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEffectiveActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addPermanent(c).setVisible(true);
            }
        });
    }//GEN-LAST:event_addEffectiveActionPerformed

    private void generalReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generalReportActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new generalReport(c).setVisible(true);
            }
        });
    }//GEN-LAST:event_generalReportActionPerformed

    private void searchDepartmentByCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDepartmentByCodeActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchDepartmentByCode(c).setVisible(true);
            }
        });
    }//GEN-LAST:event_searchDepartmentByCodeActionPerformed

    private void searchDepartmentByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDepartmentByNameActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchDepartmentByName(c).setVisible(true);
            }
        });
    }//GEN-LAST:event_searchDepartmentByNameActionPerformed

    private void removeEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEmployeeActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new removeEmployee(c).setVisible(true);
            }
        }); 
    }//GEN-LAST:event_removeEmployeeActionPerformed

    private void addSubstituteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addSubstituteActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addSubstitute(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_addSubstituteActionPerformed

    private void addDepartmentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addDepartmentActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDepartment(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_addDepartmentActionPerformed

    private void addTechnicianActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addTechnicianActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addTechnician(c).setVisible(true);
            }
        });
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
    }

    public static void main(String args[]) {
        c.addDepartment("Dep. do Jackson");
        c.addDepartment("Dep. do Cleiton");
        c.addDepartment("Dep. da Fátima");
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
                c.addPermanent("Dep. da Fátima", Integer.toString(i + 1), "Fátima", s, nivel, degree, area);
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
                c.addSubstitute("Dep. do Cleiton", Integer.toString(i + 1), "Cleiton", s, nivel, degree, workload);
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
                c.addTechnician("Dep. do Jackson", Integer.toString(i + 1), "Jackson", s, nivel, funcao);
            }
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem addDepartment;
    private javax.swing.JMenuItem addEffective;
    private javax.swing.JMenu addEmployee;
    private javax.swing.JMenu addMenu;
    private javax.swing.JMenu addProfessor;
    private javax.swing.JMenuItem addSubstitute;
    private javax.swing.JMenuItem addTechnician;
    private javax.swing.JMenuItem departmentGeneralInfo;
    private javax.swing.JMenuItem departmentGeneralReport;
    private javax.swing.JMenu departmentReport;
    private javax.swing.JMenuItem departmentSalaryReport;
    private javax.swing.JMenuItem effectiveReport;
    private javax.swing.JMenuItem employeeBySalarylReport;
    private javax.swing.JMenuItem employeeGeneralReport;
    private javax.swing.JMenu employeeReport;
    private javax.swing.JMenuItem generalReport;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenuItem professorReport;
    private javax.swing.JMenuItem removeDepartment;
    private javax.swing.JMenuItem removeEmployee;
    private javax.swing.JMenu removeMenu;
    private javax.swing.JMenu reportMenu;
    private javax.swing.JMenu searchDepartment;
    private javax.swing.JMenuItem searchDepartmentByCode;
    private javax.swing.JMenuItem searchDepartmentByName;
    private javax.swing.JMenu searchEmployee;
    private javax.swing.JMenuItem searchEmployeeById;
    private javax.swing.JMenuItem searchEmployeeByName;
    private javax.swing.JMenuItem searchEmployeeBySalary;
    private javax.swing.JMenu searchMenu;
    private javax.swing.JMenuItem substituteReport;
    private javax.swing.JMenuItem technicianReport;
    // End of variables declaration//GEN-END:variables
}
