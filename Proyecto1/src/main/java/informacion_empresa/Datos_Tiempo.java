package informacion_empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.Conexion;

public class Datos_Tiempo extends javax.swing.JFrame {

    private Connection conexion;
    private String Codigo_Tienda;

    public Datos_Tiempo(Connection conexion, String Codigo_Tienda) {
        initComponents();
        this.conexion = conexion;
        this.Codigo_Tienda = Codigo_Tienda;
        Texto1.setText(Codigo_Tienda);

        try {

            DefaultTableModel ModeloTienda = new DefaultTableModel();
            Tabla2.setModel(ModeloTienda);
            PreparedStatement ps;
            ResultSet res = null;
            String ComandoSQL = "SELECT * FROM Tienda";

            ps = conexion.prepareStatement(ComandoSQL);
            res = ps.executeQuery();

            ResultSetMetaData resultado = res.getMetaData();
            int Columnas = resultado.getColumnCount();

            ModeloTienda.addColumn("Nombre");
            ModeloTienda.addColumn("Direccion");
            ModeloTienda.addColumn("Codigo");
            ModeloTienda.addColumn("Telefono_1");
            ModeloTienda.addColumn("Telefono_2");
            ModeloTienda.addColumn("Correo");
            ModeloTienda.addColumn("Horario");

            while (res.next()) {
                Object[] filas = new Object[Columnas];
                for (int i = 0; i < Columnas; i++) {
                    filas[i] = res.getObject(i + 1);

                }
                ModeloTienda.addRow(filas);
            }
            ps.close();
            res.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JTextField();
        TextoCodigoTienda1 = new javax.swing.JTextField();
        TextoCodigoTienda2 = new javax.swing.JTextField();
        TextoTiempo = new javax.swing.JTextField();
        Texto1 = new javax.swing.JTextField();
        Texto3 = new javax.swing.JTextField();
        Texto2 = new javax.swing.JTextField();
        BotonListar = new javax.swing.JButton();
        BotonIngresar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        TextoAcciones = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        Texto8 = new javax.swing.JTextField();
        BotonLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        TextoSub = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informacion");

        Titulo.setEditable(false);
        Titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo.setText("Informacion sobre los tiempos entre las tiendas");

        TextoCodigoTienda1.setEditable(false);
        TextoCodigoTienda1.setForeground(new java.awt.Color(14, 7, 7));
        TextoCodigoTienda1.setText("Codigo_Tienda1");

        TextoCodigoTienda2.setEditable(false);
        TextoCodigoTienda2.setText("Codigo_Tienda2");

        TextoTiempo.setEditable(false);
        TextoTiempo.setText("Tiempo");

        BotonListar.setText("Listar");
        BotonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarActionPerformed(evt);
            }
        });

        BotonIngresar.setText("Ingresar");
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });

        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        TextoAcciones.setEditable(false);
        TextoAcciones.setForeground(new java.awt.Color(14, 7, 7));
        TextoAcciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoAcciones.setText("Acciones");

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Codigo_Tienda1", "Codigo_Tienda2", "Tiempo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla1);

        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Direccion", "Codigo", "Telefono_1", "Telefono_2", "Correo", "Horario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla2);

        TextoSub.setText("Tiendas Disponibles");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextoTiempo)
                            .addComponent(TextoCodigoTienda2)
                            .addComponent(TextoCodigoTienda1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(TextoAcciones)
                            .addComponent(BotonListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(Texto8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(BotonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCodigoTienda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCodigoTienda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonIngresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonLimpiar)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarActionPerformed
        Texto1.setText(Codigo_Tienda);
        Texto2.setText(null);
        Texto3.setText(null);
        Texto8.setText(null);
        try {

            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Tiempo WHERE Codigo_Tienda1 =? OR Codigo_Tienda2 =? ORDER BY Tiempo ASC";

            PrSt = conexion.prepareStatement(ComandoSQL);
            PrSt.setString(1, Texto1.getText());
            PrSt.setString(2, Texto1.getText());
            resultado = PrSt.executeQuery();

            ResultSetMetaData result = resultado.getMetaData();
            int Columnas = result.getColumnCount();

            modelo.addColumn("ID_Tiempo");
            modelo.addColumn("Codigo_Tienda1");
            modelo.addColumn("Codigo_Tienda2");
            modelo.addColumn("Tiempo");

            while (resultado.next()) {
                Object[] filas = new Object[Columnas];
                for (int i = 0; i < Columnas; i++) {
                    filas[i] = resultado.getObject(i + 1);

                }
                modelo.addRow(filas);
            }
            PrSt.close();
            resultado.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonListarActionPerformed

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        boolean comprobacion = false;

        Texto8.setText(null);
        String Codigo1 = Texto1.getText();
        String Codigo2 = Texto2.getText();
        String Tiempo = Texto3.getText();

        if ("".equals(Codigo1)) {
            Codigo1 = null;
        }
        if ("".equals(Codigo2)) {
            Codigo2 = null;
        }
        if ("".equals(Tiempo)) {
            Tiempo = null;
        }
        try {
            PreparedStatement PrSt;
            PreparedStatement Q1;
            PreparedStatement Q2;
            ResultSet RS;
            String Query = "SELECT * FROM Tiempo WHERE Codigo_Tienda1 = ? AND Codigo_Tienda2 = ?";

            Q1 = conexion.prepareStatement(Query);
            Q1.setString(1, Codigo1);
            Q1.setString(2, Codigo2);
            RS = Q1.executeQuery();
            if (RS.next()) {
                comprobacion = true;
            }

            Q2 = conexion.prepareStatement(Query);
            Q2.setString(1, Codigo2);
            Q2.setString(2, Codigo1);
            RS = Q2.executeQuery();
            if (RS.next()) {
                comprobacion = true;
            }

            if (comprobacion == false) {
                String SQLQuery = "INSERT INTO Tiempo (Codigo_Tienda1, Codigo_Tienda2, Tiempo) VALUES(?,?,?)";
                PrSt = conexion.prepareStatement(SQLQuery);
                PrSt.setString(1, Codigo1);
                PrSt.setString(2, Codigo2);
                PrSt.setString(3, Tiempo);

                int resultado = PrSt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Informacion Ingresada");
                PrSt.close();
            } else {
                JOptionPane.showMessageDialog(null, "El tiempo entre esas tientas ya esta establecido");
            }
            Q1.close();
            Q2.close();
            RS.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonIngresarActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        Texto1.setText(null);
        Texto2.setText(null);
        Texto3.setText(null);
        Texto8.setText(null);
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        String Codigo1 = Texto1.getText();
        String Codigo2 = Texto2.getText();
        String Tiempo = Texto3.getText();

        if ("".equals(Codigo1)) {
            Codigo1 = null;
        }
        if ("".equals(Codigo2)) {
            Codigo2 = null;
        }
        if ("".equals(Tiempo)) {
            Tiempo = null;
        }

        try {
            PreparedStatement PrSt;
            String SQLQuery = "UPDATE Tiempo SET Tiempo =? WHERE ID_Tiempo =?";
            PrSt = conexion.prepareStatement(SQLQuery);
            PrSt.setString(1, Tiempo);
            PrSt.setString(8, Texto8.getText());

            int resultado = PrSt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Informacion Modificada");
                Texto1.setText(null);
                Texto2.setText(null);
                Texto3.setText(null);
                Texto8.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "Fallo al modificar");
            }
            PrSt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

        try {
            PreparedStatement PrSt;
            String SQLQuery = "DELETE FROM Tiempo WHERE ID_Tiempo = ?";
            PrSt = conexion.prepareStatement(SQLQuery);

            PrSt.setString(1, Texto8.getText());

            int resultado = PrSt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Informacion Eliminada");
                Texto1.setText(null);
                Texto2.setText(null);
                Texto3.setText(null);
                Texto8.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "Fallo al Eliminar");
            }
            PrSt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked

        try {
            PreparedStatement PrSt;
            ResultSet resultado = null;

            int Fila = Tabla1.getSelectedRow();
            String Codigo = Tabla1.getValueAt(Fila, 0).toString();
            PrSt = conexion.prepareStatement("SELECT * FROM Tiempo WHERE ID_Tiempo = ?");
            PrSt.setString(1, Codigo);
            resultado = PrSt.executeQuery();

            while (resultado.next()) {
                Texto8.setText(resultado.getString("ID_Tiempo"));
                Texto1.setText(resultado.getString("Codigo_Tienda1"));
                Texto2.setText(resultado.getString("Codigo_Tienda2"));
                Texto3.setText(resultado.getString("Tiempo"));
            }
            PrSt.close();
            resultado.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Tabla1MouseClicked

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
            java.util.logging.Logger.getLogger(Datos_Tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos_Tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos_Tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos_Tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos_Tiempo(conexion, Codigo_Tienda).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonListar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JTable Tabla1;
    private javax.swing.JTable Tabla2;
    private javax.swing.JTextField Texto1;
    private javax.swing.JTextField Texto2;
    private javax.swing.JTextField Texto3;
    private javax.swing.JTextField Texto8;
    private javax.swing.JTextField TextoAcciones;
    private javax.swing.JTextField TextoCodigoTienda1;
    private javax.swing.JTextField TextoCodigoTienda2;
    private javax.swing.JTextField TextoSub;
    private javax.swing.JTextField TextoTiempo;
    private javax.swing.JTextField Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
