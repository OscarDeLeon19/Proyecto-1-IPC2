/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import principal.Conexion;

public class Trabajador extends javax.swing.JFrame {

    Conexion ClaseConexion;

    public Trabajador(Conexion ClaseConexion) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ClaseConexion = ClaseConexion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton1 = new javax.swing.JButton();
        BotonComprobar = new javax.swing.JButton();
        BotonIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        Boton1.setText("Cargar Archivos");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        BotonComprobar.setText("Comprobar Base de datos");
        BotonComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComprobarActionPerformed(evt);
            }
        });

        BotonIniciar.setText("Iniciar ");
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
                    .addComponent(Boton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        CargarArchivo cargararchivo = new CargarArchivo(ClaseConexion);
        cargararchivo.Ejecutar();


    }//GEN-LAST:event_Boton1ActionPerformed

    private void BotonComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComprobarActionPerformed
        Connection con = ClaseConexion.getConnection2();
        try {

            PreparedStatement ps;
            ResultSet res = null;

            ps = con.prepareStatement("SELECT * FROM Tienda");
            res = ps.executeQuery();

            if (res.next()) {
                JOptionPane.showMessageDialog(null, "Ya hay datos en la base de datos");
                BotonIniciar.setEnabled(true);
                Boton1.setEnabled(false);
            } else {
                Boton1.setEnabled(true);
                JOptionPane.showMessageDialog(null, "No hay datos en la base de datos");
            }
             con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
       
    }//GEN-LAST:event_BotonComprobarActionPerformed

    private void BotonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarActionPerformed
        ElegirTienda Elegir = new ElegirTienda(ClaseConexion);
        Elegir.Ejecutar();
        dispose();
    }//GEN-LAST:event_BotonIniciarActionPerformed
    

    public void Ejecutar() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Trabajador(ClaseConexion).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton BotonComprobar;
    private javax.swing.JButton BotonIniciar;
    // End of variables declaration//GEN-END:variables
}
