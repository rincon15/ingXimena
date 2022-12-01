package Vistas;

import javax.swing.JLabel;

public class Vistamodulos extends javax.swing.JFrame {

    public Vistamodulos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        textName = new javax.swing.JLabel();
        Modulo3 = new javax.swing.JButton();
        Modulo2 = new javax.swing.JButton();
        Modulo1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textName.setText("YULIANA ESTEFANIA CASTELLANO ANAYA");
        jPanel1.add(textName, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, -1, -1));

        Modulo3.setBackground(new java.awt.Color(255, 255, 255));
        Modulo3.setFont(new java.awt.Font("Verdana", 0, 32)); // NOI18N
        Modulo3.setText("PRACTICA");
        jPanel1.add(Modulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 310, 40));

        Modulo2.setBackground(new java.awt.Color(255, 255, 255));
        Modulo2.setFont(new java.awt.Font("Verdana", 0, 32)); // NOI18N
        Modulo2.setText("LECCIONES");
        Modulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modulo2ActionPerformed(evt);
            }
        });
        jPanel1.add(Modulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 310, 40));

        Modulo1.setBackground(new java.awt.Color(255, 255, 255));
        Modulo1.setFont(new java.awt.Font("Verdana", 0, 32)); // NOI18N
        Modulo1.setText("DIAGNOSTICO");
        Modulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modulo1ActionPerformed(evt);
            }
        });
        jPanel1.add(Modulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 310, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Vistamodulos.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Modulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modulo1ActionPerformed
        // TODO add your handling code here:
        new VistaDiagnostico().setVisible(true);
    }//GEN-LAST:event_Modulo1ActionPerformed

    private void Modulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modulo2ActionPerformed
        // TODO add your handling code here:
        new Vistaaprendizaje().setVisible(true);
    }//GEN-LAST:event_Modulo2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Vistamodulos().setVisible(true);
            }
        });
    }

    public JLabel getTextName() {
        return textName;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modulo1;
    private javax.swing.JButton Modulo2;
    private javax.swing.JButton Modulo3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textName;
    // End of variables declaration//GEN-END:variables
}
