/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaz.panelesPrincipales;

/**
 *
 * @author danie
 */
public class PnlEstudiante extends javax.swing.JPanel {

    /**
     * Creates new form PnlEstudiante
     */
    public PnlEstudiante() {
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
        btnMatriculacionEtd = new javax.swing.JButton();
        btnRegistroEtd = new javax.swing.JButton();
        btnReportesEstudiante = new javax.swing.JButton();

        btnMatriculacionEtd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaInterfaz/Imagenes/Recurso 36.png"))); // NOI18N
        btnMatriculacionEtd.setText("Matriculación ");

        btnRegistroEtd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaInterfaz/Imagenes/Recurso 5.png"))); // NOI18N
        btnRegistroEtd.setText("Registro del Estudiante");

        btnReportesEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaInterfaz/Imagenes/Recurso 3.png"))); // NOI18N
        btnReportesEstudiante.setText("Reportes Estudiante");
        btnReportesEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnMatriculacionEtd, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(btnRegistroEtd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addComponent(btnReportesEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMatriculacionEtd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroEtd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportesEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportesEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesEstudianteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatriculacionEtd;
    private javax.swing.JButton btnRegistroEtd;
    private javax.swing.JButton btnReportesEstudiante;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
