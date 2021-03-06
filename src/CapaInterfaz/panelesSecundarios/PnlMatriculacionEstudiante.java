/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaz.panelesSecundarios;

import CapaInterfaz.FrmMenuPrincipal;
import CapaNegocio.ClsCategoria;
import CapaNegocio.ClsCurso;
import CapaNegocio.ClsEstudiante;
import CapaNegocio.ClsValidadores;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PnlMatriculacionEstudiante extends javax.swing.JPanel {
    DefaultTableModel tabla;
    
    ClsEstudiante e;
    /**
     * Creates new form PnlRegistroEstudiante
     */
    
    public PnlMatriculacionEstudiante() {
        initComponents();
        lblErrorCi.setVisible(false);   
        btnBuscar.setEnabled(false);
        
        tabla = new DefaultTableModel();
        tabla.addColumn("Nombre curso");
        tabla.addColumn("Nivel");
        tabla.addColumn("Descripción");
        tabla.addColumn("Duración");
        tblDatos.setModel(tabla);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblErrorCi = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnMatricular = new javax.swing.JButton();

        jLabel1.setText("CI:");

        jLabel2.setText("Estudiante: ");

        jLabel3.setText("Categoria: ");

        txtCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCIKeyReleased(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblErrorCi.setForeground(java.awt.Color.red);
        lblErrorCi.setText("Ingrese una cédula válida");

        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        btnMatricular.setText("Matricular");
        btnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCI)
                    .addComponent(txtNombre)
                    .addComponent(lblErrorCi)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btnMatricular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblErrorCi)
                            .addComponent(btnBuscar))
                        .addGap(3, 3, 3)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMatricular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        // llamar al metodo buscar estudiante por CI
        e = ClsEstudiante.buscarEstudiantePorCI(FrmMenuPrincipal.estudiantes,txtCI.getText());
        
        // evaluar los dos casos mencionados
        if (e == null){
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
        } else {
            txtNombre.setText(e.getNombre() + " " + e.getApellido());
        }

        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIKeyReleased
        // TODO add your handling code here:
        if(ClsValidadores.validadorCedulaIdentidad(txtCI.getText())){
            lblErrorCi.setVisible(false);
            btnBuscar.setEnabled(true);
        } else {
            lblErrorCi.setVisible(true);
            btnBuscar.setEnabled(false);
        }
    }//GEN-LAST:event_txtCIKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyReleased

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
        if (cmbCategoria.getSelectedIndex() != -1) {
            ClsCategoria categoriaSelecionada = FrmMenuPrincipal.categorias.get(cmbCategoria.getSelectedIndex());
            tabla.setRowCount(0);// limpiar la tabla
            for (ClsCurso c : categoriaSelecionada.getCursos()) {
                tabla.addRow(new Object[]{c.getNombre(), c.getNivel().getNombre(),
                    c.getDescripcion(), c.getDuracion()});
            }
        }


    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularActionPerformed
        // TODO add your handling code here:
        try {
            // obtener el indice del curso seleccionado
            int indiceCursoSelecionado = tblDatos.getSelectedRow();

            // identificar el curso oara matricular el estudiante
            ClsCategoria categoriaSelecionada = FrmMenuPrincipal.categorias.get(cmbCategoria.getSelectedIndex());
            e.agregarCurso(categoriaSelecionada.getCursos().get(indiceCursoSelecionado));
        } catch ( Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btnMatricularActionPerformed
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMatricular;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorCi;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
