/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author user
 */
public class VistaDiagnostico extends javax.swing.JFrame {

    /**
     * Creates new form VistaDiagnostico
     */
    public VistaDiagnostico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CheckBox1 = new javax.swing.JCheckBox();
        CheckBox2 = new javax.swing.JCheckBox();
        CheckBox3 = new javax.swing.JCheckBox();
        CheckBox4 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CheckBox5 = new javax.swing.JCheckBox();
        CheckBox6 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CheckBox7 = new javax.swing.JCheckBox();
        CheckBox8 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CheckBox9 = new javax.swing.JCheckBox();
        CheckBox10 = new javax.swing.JCheckBox();
        CheckBox11 = new javax.swing.JCheckBox();
        CheckBox12 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        jLabel1.setText("Pregunta 2");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("La definici??n de una variable se realiza de la sieguiente manera");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, -1, 30));

        CheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox1.setText("cout << \"biblioteca\";");
        CheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        CheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox2.setText("#include (stdlib)");
        CheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        CheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox3.setText("#include<stdlib>");
        CheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        CheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox4.setText("cin >> Variable 1;");
        CheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        jLabel4.setText("Pregunta 4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("La sentencia Escribir en Pseudoc??digo equivales a cout << en el lenguaje de C++");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, 30));

        CheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox5.setText("Verdadero");
        CheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        CheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox6.setText("Falso");
        CheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox6ActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, -1, -1));

        jLabel6.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        jLabel6.setText("Pregunta 1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Para incluir una biblioteca en C++ se utliza la siguente sentencia:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, 30));

        CheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox7.setText("int variable1=25;");
        CheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox7ActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, -1, -1));

        CheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox8.setText("include variable1;");
        CheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox8ActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, -1, -1));

        jLabel8.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        jLabel8.setText("Pregunta 3");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("La sentencia cin >> var 1, se utiliza para ingresar un valor a una variable desde teclado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, 30));

        CheckBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox9.setText("Verdadero");
        CheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox9ActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, -1));

        CheckBox10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox10.setText("Falso");
        CheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox10ActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, -1, -1));

        CheckBox11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox11.setText("const int variable1=25;");
        CheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox11ActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, -1, -1));

        CheckBox12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox12.setText("int variable1;");
        CheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox12ActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Diagnosticoinicio.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox1ActionPerformed

    private void CheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox2ActionPerformed

    private void CheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox3ActionPerformed

    private void CheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox4ActionPerformed

    private void CheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox5ActionPerformed

    private void CheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox6ActionPerformed

    private void CheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox7ActionPerformed

    private void CheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox8ActionPerformed

    private void CheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox9ActionPerformed

    private void CheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox10ActionPerformed

    private void CheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox11ActionPerformed

    private void CheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDiagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox1;
    private javax.swing.JCheckBox CheckBox10;
    private javax.swing.JCheckBox CheckBox11;
    private javax.swing.JCheckBox CheckBox12;
    private javax.swing.JCheckBox CheckBox2;
    private javax.swing.JCheckBox CheckBox3;
    private javax.swing.JCheckBox CheckBox4;
    private javax.swing.JCheckBox CheckBox5;
    private javax.swing.JCheckBox CheckBox6;
    private javax.swing.JCheckBox CheckBox7;
    private javax.swing.JCheckBox CheckBox8;
    private javax.swing.JCheckBox CheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
