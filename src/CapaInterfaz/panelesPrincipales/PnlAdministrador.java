/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaz.panelesPrincipales;

import CapaInterfaz.panelesSecundarios.PnlNivel;

/**
 *
 * @author Adhisson Cedeño adhisson.cedeno@epn.edu.ec
 */
public class PnlAdministrador extends javax.swing.JPanel {
    
    PnlNivel pnlNivel;

    public PnlAdministrador() {
        initComponents();
        pnlNivel = new PnlNivel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pContenedor = new javax.swing.JPanel();
        btnNivel = new javax.swing.JButton();
        btnCurso = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        btnDocente = new javax.swing.JButton();
        btnEstudiante = new javax.swing.JButton();

        btnNivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaInterfaz/Imagenes/Recurso 22.png"))); // NOI18N
        btnNivel.setText("Agregar Nivel");
        btnNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNivelActionPerformed(evt);
            }
        });

        btnCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaInterfaz/Imagenes/Recurso 2.png"))); // NOI18N
        btnCurso.setText("Agregar Curso");

        btnCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaInterfaz/Imagenes/Recurso 23.png"))); // NOI18N
        btnCategoria.setText("Agregar Categoría");

        btnDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaInterfaz/Imagenes/Recurso 9.png"))); // NOI18N
        btnDocente.setText("Modificar Docente");

        btnEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaInterfaz/Imagenes/Recurso 6.png"))); // NOI18N
        btnEstudiante.setText("Modificar Estudiante");

        javax.swing.GroupLayout pContenedorLayout = new javax.swing.GroupLayout(pContenedor);
        pContenedor.setLayout(pContenedorLayout);
        pContenedorLayout.setHorizontalGroup(
            pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContenedorLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addGroup(pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDocente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
            .addGroup(pContenedorLayout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(btnEstudiante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pContenedorLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCategoria, btnCurso, btnDocente, btnEstudiante, btnNivel});

        pContenedorLayout.setVerticalGroup(
            pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContenedorLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCurso))
                .addGap(66, 66, 66)
                .addGroup(pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDocente)
                    .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnEstudiante)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pContenedorLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCategoria, btnCurso, btnDocente, btnEstudiante, btnNivel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pContenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNivelActionPerformed
        // TODO add your handling code here:
        pContenedor.setVisible(false);
        pnlNivel.setVisible(true);
        pnlNivel.setSize(850, 529);
        pnlNivel.setLocation(0, 0);
        this.add(pnlNivel);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnNivelActionPerformed
    
    public void limpiarV2(){
        pnlNivel.setVisible(false);
        pContenedor.setVisible(true);
        pContenedor.setSize(850, 529);
        pContenedor.setLocation(0, 0);
        add(pContenedor);
        revalidate();
        repaint();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnCurso;
    private javax.swing.JButton btnDocente;
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JButton btnNivel;
    private javax.swing.JPanel pContenedor;
    // End of variables declaration//GEN-END:variables
}
