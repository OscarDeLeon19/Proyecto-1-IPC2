/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Ventana_Trabajador extends javax.swing.JFrame {

    Connection conexion;

    /**
     * Constructor de la clase Trabajador
     *
     * @param conexion Conexion con la base de datos
     */
    public Ventana_Trabajador(Connection conexion) {
        initComponents();
        this.conexion = conexion;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonCargar = new javax.swing.JButton();
        BotonComprobar = new javax.swing.JButton();
        BotonIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Principal");

        BotonCargar.setText("Cargar Archivos");
        BotonCargar.setEnabled(false);
        BotonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargarActionPerformed(evt);
            }
        });

        BotonComprobar.setText("Comprobar datos");
        BotonComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComprobarActionPerformed(evt);
            }
        });

        BotonIniciar.setText("Iniciar ");
        BotonIniciar.setEnabled(false);
        BotonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonComprobar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonCargar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Crea una clase CargarArchivo y la ejecuta.
     *
     * @param evt
     */
    private void BotonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargarActionPerformed
        CargarArchivo cargararchivo = new CargarArchivo(conexion);
        cargararchivo.Ejecutar();
    }//GEN-LAST:event_BotonCargarActionPerformed
    /**
     * Comprueba si hay datos en la base de datos Busca si hay tiendas en la
     * base de datos. Si hay habilita los demas botones de la ventana.
     *
     * @param evt
     */
    private void BotonComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComprobarActionPerformed

        try {
            Connection con = conexion;
            PreparedStatement ps;
            ResultSet res = null;

            ps = con.prepareStatement("SELECT * FROM Tienda");
            res = ps.executeQuery();

            if (res.next()) {
                JOptionPane.showMessageDialog(null, "Ya hay datos en la base de datos");
                BotonIniciar.setEnabled(true);
                BotonCargar.setEnabled(false);
            } else {
                BotonCargar.setEnabled(true);
                JOptionPane.showMessageDialog(null, "No hay datos en la base de datos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonComprobarActionPerformed
    /**
     * Crea un objeto ElejirTienda
     *
     * @param evt
     */
    private void BotonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarActionPerformed
        Menu_Tienda Elegir = new Menu_Tienda(conexion);
        Elegir.Ejecutar();
        dispose();
    }//GEN-LAST:event_BotonIniciarActionPerformed
    /**
     * Ejecuta la ventana
     */
    public void Ejecutar() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana_Trabajador(conexion).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCargar;
    private javax.swing.JButton BotonComprobar;
    private javax.swing.JButton BotonIniciar;
    // End of variables declaration//GEN-END:variables
}
