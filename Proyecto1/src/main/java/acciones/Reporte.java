package acciones;

import informacion_empresa.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Reporte extends javax.swing.JFrame {

    private Connection conexion;
    private String TiendaActual;
    private Date Fecha1;
    private Date Fecha2;
    private Date FechaTemporal;
    private Date FechaPedido;

    public Reporte(Connection conexion, String TiendaActual) {
        initComponents();
        this.conexion = conexion;
        this.TiendaActual = TiendaActual;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informacion");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Generacion de Reportes");

        Boton1.setText("Lista de todos los pedidos que llegaran a la tienda");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setText("Listado de pedidos que están en tiempo de estar en la tienda pero debe verificarse su ingreso");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton3.setText("Listado de todos los pedidos atrasados que llegarán a la tienda");

        Boton4.setText("Listado de todos los pedidos que salieron de la tienda y están en tránsito");

        Boton5.setText("Listado de todas las compras realizadas por un cliente");

        Boton6.setText("Listado de todos los pedidos en curso de un cliente");

        Boton7.setText("Listado de los diez productos más vendidos en un intervalo de tiempo");

        Boton8.setText("Listado de los productos más vendidos por tienda en un intervalo de tiempo");

        Boton9.setText("Listado de productos que nunca se han vendido por tienda");

        Area1.setEditable(false);
        Area1.setColumns(20);
        Area1.setRows(5);
        jScrollPane1.setViewportView(Area1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1)
                        .addComponent(Boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        try {
            Area1.setText(null);
            Area1.append("Pedido/ID_Pedido/Codigo_Pedido/Codigo_Tienda1/Codigo_Tienda2/Fecha/NIT_Cliente/Cantidad/Total/Anticipo/Credito");
            Area1.append("\n");
            PreparedStatement PrSt;
            ResultSet rs;
            String Query = "SELECT * FROM Pedido WHERE Codigo_Tienda2 = ? AND Estado IS NULL";
            PrSt = conexion.prepareStatement(Query);
            PrSt.setString(1, TiendaActual);
            rs = PrSt.executeQuery();

            while (rs.next()) {
                String ID = rs.getString("ID_Pedido");
                String Pedido = rs.getString("Codigo_Pedido");
                String Tienda1 = rs.getString("Codigo_Tienda1");
                String Tienda2 = rs.getString("Codigo_Tienda2");
                String Fecha = rs.getString("Fecha");
                String NIT = rs.getString("NIT_Cliente");
                String Cantidad = rs.getString("Cantidad");
                String Total = rs.getString("Total");
                String Anticipo = rs.getString("Anticipo");
                String Credito = rs.getString("Credito");

                String Cadena = "PEDIDO/" + ID + "/" + Pedido + "/" + Tienda1 + "/" + Tienda2 + "/" + Fecha + "/" + NIT + "/" + Cantidad + "/" + Total + "/" + Anticipo + "/" + Credito;
                Area1.append(Cadena);
                Area1.append("\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        
    }//GEN-LAST:event_Boton2ActionPerformed

    public void Ejecutar() {
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
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte(conexion, TiendaActual).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
