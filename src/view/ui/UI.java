package src.view.ui;

public class UI extends javax.swing.JFrame {
    public UI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JMenuBar();
        menuCadastro1 = new javax.swing.JMenu();
        addDepartment2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        menuCadastro2 = new javax.swing.JMenu();
        addDepartment4 = new javax.swing.JMenuItem();
        addDepartment5 = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        addDepartment = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro UNESP");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(95, 95, 95));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        menuCadastro1.setText("Cadastrar");
        menuCadastro1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        addDepartment2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addDepartment2.setText("Departamento");
        addDepartment2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDepartment2ActionPerformed(evt);
            }
        });
        menuCadastro1.add(addDepartment2);

        jMenu5.setText("Funcionário");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem12.setText("Técnico");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenu6.setText("Docente");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem10.setText("Efetivo");
        jMenu6.add(jMenuItem10);

        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem16.setText("Substituto");
        jMenu6.add(jMenuItem16);

        jMenu5.add(jMenu6);

        menuCadastro1.add(jMenu5);

        Menu.add(menuCadastro1);

        menuCadastro2.setText("Excluir");
        menuCadastro2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        addDepartment4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addDepartment4.setText("Departamento");
        addDepartment4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDepartment4ActionPerformed(evt);
            }
        });
        menuCadastro2.add(addDepartment4);

        addDepartment5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addDepartment5.setText("Funcionário");
        addDepartment5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDepartment5ActionPerformed(evt);
            }
        });
        menuCadastro2.add(addDepartment5);

        Menu.add(menuCadastro2);

        menuRelatorios.setText("Buscar");
        menuRelatorios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu1.setText("Departamento");

        jMenuItem3.setText("Código");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem7.setText("Nome");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        menuRelatorios.add(jMenu1);

        jMenu4.setText("Funcionário");

        jMenuItem8.setText("Registro");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Nome");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem25.setText("Faixa Salarial");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem25);

        menuRelatorios.add(jMenu4);

        Menu.add(menuRelatorios);

        menuCadastro.setText("Relatório");
        menuCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        addDepartment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addDepartment.setText("Geral");
        addDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDepartmentActionPerformed(evt);
            }
        });
        menuCadastro.add(addDepartment);

        jMenu2.setText("Departamentos");

        jMenuItem4.setText("Resumo geral");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem17.setText("Resumo por faixa salarial");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem17);

        jMenuItem19.setText("Exibir informações...");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem19);

        menuCadastro.add(jMenu2);

        jMenu3.setText("Funcionários");

        jMenuItem5.setText("Todos os funcionários");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem18.setText("Resumo por faixa salarial");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem18);

        jMenuItem6.setText("Técnicos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem20.setText("Docentes");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem20);

        jMenuItem21.setText("Docentes efetivos");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem21);

        jMenuItem22.setText("Docentes substitutos");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem22);

        menuCadastro.add(jMenu3);

        Menu.add(menuCadastro);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDepartment2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addDepartment2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_addDepartment2ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem12ActionPerformed

    private void addDepartment4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addDepartment4ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_addDepartment4ActionPerformed

    private void addDepartment5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addDepartment5ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_addDepartment5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem25ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem25ActionPerformed

    private void addDepartmentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addDepartmentActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDepartment().setVisible(true);
            }
        });
    }// GEN-LAST:event_addDepartmentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem addDepartment;
    private javax.swing.JMenuItem addDepartment2;
    private javax.swing.JMenuItem addDepartment4;
    private javax.swing.JMenuItem addDepartment5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuCadastro1;
    private javax.swing.JMenu menuCadastro2;
    private javax.swing.JMenu menuRelatorios;
    // End of variables declaration//GEN-END:variables
}
