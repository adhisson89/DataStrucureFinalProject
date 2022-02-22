/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaz.pnlsPrincipales;

import CapaInterfaz.pnlsSecundarios.pnlsEstudiante.FrmRecursos;
import CapaInterfaz.pnlsSecundarios.pnlsEstudiante.PnlMatriculacionEstudiante;
import CapaInterfaz.pnlsSecundarios.pnlsEstudiante.PnlRegistroEstudiante;
import CapaInterfaz.pnlsSecundarios.pnlsEstudiante.PnlReporteEstudiante;

public class PnlEstudiante extends javax.swing.JPanel {

    PnlMatriculacionEstudiante pnlMatriculacionEstudiante;
    PnlRegistroEstudiante pnlRegistroeEstudiante;
    PnlReporteEstudiante pnlReporteEstudiante;
        
    public PnlEstudiante() {
        
        initComponents();
        pnlMatriculacionEstudiante = new PnlMatriculacionEstudiante();
        pnlRegistroeEstudiante = new PnlRegistroEstudiante();
        pnlReporteEstudiante = new PnlReporteEstudiante();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pContenedor = new javax.swing.JPanel();
        btnMatriculacionEtd = new javax.swing.JButton();
        btnRegistroEtd = new javax.swing.JButton();
        btnReportesEstudiante = new javax.swing.JButton();
        btnRecursos = new javax.swing.JButton();

        btnMatriculacionEtd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaInterfaz/Imagenes/Recurso 36.png"))); // NOI18N
        btnMatriculacionEtd.setText("Matriculación ");
        btnMatriculacionEtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculacionEtdActionPerformed(evt);
            }
        });

        btnRegistroEtd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaInterfaz/Imagenes/Recurso 5.png"))); // NOI18N
        btnRegistroEtd.setText("Registro del Estudiante");
        btnRegistroEtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroEtdActionPerformed(evt);
            }
        });

        btnReportesEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaInterfaz/Imagenes/Recurso 3.png"))); // NOI18N
        btnReportesEstudiante.setText("Reportes Estudiante");
        btnReportesEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesEstudianteActionPerformed(evt);
            }
        });

        btnRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaInterfaz/Imagenes/Recurso 34.png"))); // NOI18N
        btnRecursos.setText("Recursos");
        btnRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecursosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pContenedorLayout = new javax.swing.GroupLayout(pContenedor);
        pContenedor.setLayout(pContenedorLayout);
        pContenedorLayout.setHorizontalGroup(
            pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContenedorLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReportesEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(btnMatriculacionEtd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(126, 126, 126)
                .addGroup(pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistroEtd, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(btnRecursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        pContenedorLayout.setVerticalGroup(
            pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContenedorLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMatriculacionEtd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroEtd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReportesEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportesEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesEstudianteActionPerformed
        limpiar();
        pContenedor.setVisible(false);
        pnlReporteEstudiante.setVisible(true);
        pnlReporteEstudiante.setSize(850, 529);
        pnlReporteEstudiante.setLocation(0, 0);
        add(pnlReporteEstudiante);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnReportesEstudianteActionPerformed

    private void btnMatriculacionEtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculacionEtdActionPerformed
        limpiar();
        pContenedor.setVisible(false);
        pnlMatriculacionEstudiante.setVisible(true);
        pnlMatriculacionEstudiante.setSize(850, 529);
        pnlMatriculacionEstudiante.setLocation(0, 0);
        add(pnlMatriculacionEstudiante);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnMatriculacionEtdActionPerformed

    private void btnRegistroEtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroEtdActionPerformed
        limpiar();
        pContenedor.setVisible(false);
        pnlRegistroeEstudiante.setVisible(true);
        pnlRegistroeEstudiante.setSize(850, 529);
        pnlRegistroeEstudiante.setLocation(0, 0);
        add(pnlRegistroeEstudiante);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnRegistroEtdActionPerformed

    private void btnRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecursosActionPerformed
        limpiar();      
        FrmRecursos abrir = new FrmRecursos();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null); 
    }//GEN-LAST:event_btnRecursosActionPerformed

    public void limpiar(){
        pnlMatriculacionEstudiante.setVisible(false);
        pnlReporteEstudiante.setVisible(false);
        pnlRegistroeEstudiante.setVisible(false);
        pContenedor.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatriculacionEtd;
    private javax.swing.JButton btnRecursos;
    private javax.swing.JButton btnRegistroEtd;
    private javax.swing.JButton btnReportesEstudiante;
    private javax.swing.JPanel pContenedor;
    // End of variables declaration//GEN-END:variables
}
