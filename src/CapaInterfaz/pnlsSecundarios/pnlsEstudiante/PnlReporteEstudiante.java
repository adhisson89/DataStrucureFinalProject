/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaz.pnlsSecundarios.pnlsEstudiante;


import CapaDatos.ClsMetodos;
import CapaInterfaz.FrmMenuPrincipal;
import CapaNegocio.ClsEstudiante;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PnlReporteEstudiante extends javax.swing.JPanel {
    DefaultTableModel dtmTablaNotas;
    ClsEstudiante estudiante;
    
    public PnlReporteEstudiante() {
        initComponents();  
        lblErrorEstudiante.setVisible(false);
        dtmTablaNotas = new DefaultTableModel();
        for(int i = 1; i <= 10;i++){
            dtmTablaNotas.addColumn("Nota " + i+ " :");
        }
        tblDatos.setModel(dtmTablaNotas);
    }
    
    public void llenarTabla() {
        // limpiar la dtmTablaNotas
        try {
            dtmTablaNotas.setRowCount(0);
            for (ClsEstudiante e : FrmMenuPrincipal.estudiantes) {
                if (estudiante == e) {
                    double[] calificaciones = e.getCalificaciones();
                    dtmTablaNotas.addRow(new Object[]{calificaciones[0], calificaciones[1],
                        calificaciones[2], calificaciones[3], calificaciones[4], calificaciones[5],
                        calificaciones[6], calificaciones[7], calificaciones[8], calificaciones[9]});
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblErrorEstudiante = new javax.swing.JLabel();
        txtDatos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Estudiante"));

        jLabel1.setText("Ingrese el número de cédula del estudiante:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblErrorEstudiante.setForeground(java.awt.Color.red);
        lblErrorEstudiante.setText("No se ha encontrado al estudiante");

        jLabel3.setText("Nombre y Apellido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btnBuscar)
                .addGap(316, 316, 316))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63)
                        .addComponent(txtDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(lblErrorEstudiante)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(lblErrorEstudiante)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        estudiante = ClsMetodos.buscarPersonaPorCIEstudiante(FrmMenuPrincipal.estudiantes, txtCedula.getText());
        if (estudiante == null) {
            lblErrorEstudiante.setVisible(true);
        } else {
            txtDatos.setText(estudiante.getNombre()+" "+estudiante.getApellido());
            lblErrorEstudiante.setVisible(false);
            llenarTabla();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorEstudiante;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDatos;
    // End of variables declaration//GEN-END:variables
}
