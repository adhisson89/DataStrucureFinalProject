/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaz;

import CapaDatos.ClsDatos;
import CapaInterfaz.pnlsPrincipales.PnlAcercaDe;
import CapaInterfaz.pnlsPrincipales.PnlAdministrador;
import CapaInterfaz.pnlsPrincipales.PnlDocente;
import CapaInterfaz.pnlsPrincipales.PnlEstudiante;
import CapaNegocio.ClsNivel;
import CapaNegocio.ClsCategoria;
import CapaNegocio.ClsCurso;
import CapaNegocio.ClsDocente;
import CapaNegocio.ClsEstudiante;
import java.util.ArrayList;
import java.util.Vector;


public class FrmMenuPrincipal extends javax.swing.JFrame {

    //Paneles Nuevos
    PnlAdministrador panelAdministrador;
    PnlDocente panelDocente;
    PnlEstudiante panelEstudiante;
    PnlAcercaDe panelAcercaDe;
    
    
   /* public static ArrayList <ClsNivel> niveles;
    public static ArrayList <ClsCategoria> categorias;
    public static ArrayList <ClsCurso> cursos;
    public static ArrayList <ClsDocente> docentes;
    public static Vector <ClsEstudiante> estudiantes;*/
    
    public FrmMenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        revalidate();
        repaint();
        
        /*niveles = new ArrayList<>();
        categorias = new ArrayList<>();
        cursos = new ArrayList<>();
        docentes = new ArrayList<>();
        estudiantes = new Vector<>();*/
        
        ClsDatos.inicializarListas();
        panelAdministrador = new PnlAdministrador();
        panelDocente = new PnlDocente();
        panelEstudiante = new PnlEstudiante();
        panelAcercaDe = new PnlAcercaDe();
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnAdministrador = new javax.swing.JMenu();
        mnDocente = new javax.swing.JMenu();
        mnEstudiante = new javax.swing.JMenu();
        mnAcercaDe = new javax.swing.JMenu();

        jPanel2.setForeground(new java.awt.Color(0, 0, 250));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gotitas del Saber");
        setResizable(false);

        mnAdministrador.setText("Administrador");
        mnAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnAdministradorMousePressed(evt);
            }
        });
        jMenuBar1.add(mnAdministrador);

        mnDocente.setText("Docente");
        mnDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnDocenteMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnDocente);

        mnEstudiante.setText("Estudiante");
        mnEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnEstudianteMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnEstudiante);

        mnAcercaDe.setText("Acerca De");
        mnAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnAcercaDeMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnAcercaDe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnAdministradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAdministradorMousePressed
        limpiarFrame();
        panelAdministrador.setVisible(true);
        panelAdministrador.setSize(850, 530);
        panelAdministrador.setLocation(0,0);
        add(panelAdministrador);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnAdministradorMousePressed

    private void mnDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnDocenteMouseClicked
        limpiarFrame();
        panelDocente.setVisible(true);
        panelDocente.setSize(850, 530);
        panelDocente.setLocation(0,0);
        add(panelDocente);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnDocenteMouseClicked

    private void mnEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnEstudianteMouseClicked
        limpiarFrame();
        panelEstudiante.setVisible(true);
        panelEstudiante.setSize(850, 530);
        panelEstudiante.setLocation(0,0);
        add(panelEstudiante);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnEstudianteMouseClicked

    private void mnAcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAcercaDeMouseClicked
        limpiarFrame();
        panelAcercaDe.setVisible(true);
        panelAcercaDe.setSize(850, 530);
        panelAcercaDe.setLocation(0,0);
        add(panelAcercaDe);
        revalidate();
        repaint();
    }//GEN-LAST:event_mnAcercaDeMouseClicked
     
    private void limpiarFrame(){
        panelEstudiante.setVisible(false);
        panelDocente.setVisible(false);
        panelAdministrador.setVisible(false);
        panelAcercaDe.setVisible(false);
        panelAdministrador.limpiar();
        panelEstudiante.limpiar();
        panelDocente.limpiar();

    }
    
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
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu mnAcercaDe;
    private javax.swing.JMenu mnAdministrador;
    private javax.swing.JMenu mnDocente;
    private javax.swing.JMenu mnEstudiante;
    // End of variables declaration//GEN-END:variables
}
