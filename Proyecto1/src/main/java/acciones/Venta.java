package acciones;

import informacion_empresa.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.Conexion;

public class Venta extends javax.swing.JFrame {

    private Connection conexion;
    private String Codigo_Tienda;
    private String Codigo_Producto;
    private String NIT_Cliente;
    private int Cantidad;
    private String Fecha;
    private int Existencias;
    private Double PrecioExistencias;
    private double Paga;
    private double Credito;
    private double CreditoCliente;

    public Venta(Connection conexion, String Codigo_Tienda) {
        initComponents();
        this.conexion = conexion;
        this.Codigo_Tienda = Codigo_Tienda;
        Texto2.setText(this.Codigo_Tienda);

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            Tabla2.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Producto WHERE Codigo_Tienda = ?";

            PrSt = conexion.prepareStatement(ComandoSQL);
            PrSt.setString(1, Codigo_Tienda);
            resultado = PrSt.executeQuery();

            ResultSetMetaData result = resultado.getMetaData();
            int Columnas = result.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Fabricante");
            modelo.addColumn("Codigo");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio");
            modelo.addColumn("Codigo_Tienda");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Garantia");

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Titulo = new javax.swing.JTextField();
        TextoNombre = new javax.swing.JTextField();
        TextoCodigo = new javax.swing.JTextField();
        TextoTel1 = new javax.swing.JTextField();
        TextoTel2 = new javax.swing.JTextField();
        TextoCorreo = new javax.swing.JTextField();
        Texto1 = new javax.swing.JTextField();
        Texto3 = new javax.swing.JTextField();
        Texto5 = new javax.swing.JTextField();
        Texto6 = new javax.swing.JTextField();
        Texto7 = new javax.swing.JTextField();
        Texto2 = new javax.swing.JTextField();
        BotonListar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        TextoAcciones = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        Texto8 = new javax.swing.JTextField();
        BotonLimpiar = new javax.swing.JButton();
        TextoCodigo1 = new javax.swing.JTextField();
        Texto4 = new javax.swing.JTextField();
        TextoCodigoTienda = new javax.swing.JTextField();
        BotonIngresar = new javax.swing.JButton();
        BotonComprobar = new javax.swing.JButton();
        BotonCredito = new javax.swing.JButton();
        BotonVenta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venta");

        Titulo.setEditable(false);
        Titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo.setText("Ventas de la Empresa");

        TextoNombre.setEditable(false);
        TextoNombre.setForeground(new java.awt.Color(14, 7, 7));
        TextoNombre.setText("Codigo_Producto");

        TextoCodigo.setEditable(false);
        TextoCodigo.setText("NIT_Cliente");

        TextoTel1.setEditable(false);
        TextoTel1.setText("Pago");

        TextoTel2.setEditable(false);
        TextoTel2.setText("Credito");

        TextoCorreo.setEditable(false);
        TextoCorreo.setText("Fecha");

        Texto1.setEditable(false);

        Texto5.setEditable(false);

        Texto6.setText("0");

        Texto2.setEditable(false);

        BotonListar.setText("Listar");
        BotonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarActionPerformed(evt);
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
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_Venta", "Codigo_Producto", "Codigo_Tienda", "NIT_Cliente", "Cantidad", "Pago", "Credito", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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

        TextoCodigo1.setEditable(false);
        TextoCodigo1.setText("Cantidad");

        TextoCodigoTienda.setText("Codigo_Tienda");

        BotonIngresar.setText("Ingresar Venta");
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });

        BotonComprobar.setText("Comprobar");
        BotonComprobar.setEnabled(false);
        BotonComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComprobarActionPerformed(evt);
            }
        });

        BotonCredito.setText("Añadir Credito");
        BotonCredito.setEnabled(false);
        BotonCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCreditoActionPerformed(evt);
            }
        });

        BotonVenta.setText("Finalizar Venta");
        BotonVenta.setEnabled(false);
        BotonVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVentaActionPerformed(evt);
            }
        });

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Fabricante", "Codigo", "Cantidad", "Precio", "Codigo_Tienda", "Descripcion", "Garantia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla2);

        jTextField1.setText("Ventas Realizadas");

        jTextField2.setText("Productos de la Tienda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextoCorreo)
                            .addComponent(TextoCodigo)
                            .addComponent(TextoTel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoTel2)
                            .addComponent(TextoCodigo1)
                            .addComponent(TextoNombre)
                            .addComponent(TextoCodigoTienda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonComprobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Texto6, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Texto7, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Texto8, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(TextoAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(BotonListar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(BotonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(BotonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonListar)
                    .addComponent(TextoCodigoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonLimpiar)
                    .addComponent(BotonComprobar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonIngresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCredito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarActionPerformed
        try {

            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Venta";

            PrSt = conexion.prepareStatement(ComandoSQL);
            resultado = PrSt.executeQuery();

            ResultSetMetaData result = resultado.getMetaData();
            int Columnas = result.getColumnCount();

            modelo.addColumn("ID_Venta");
            modelo.addColumn("Codigo_Producto");
            modelo.addColumn("Codigo_Tienda");
            modelo.addColumn("NIT_Cliente");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Pago");
            modelo.addColumn("Credito");
            modelo.addColumn("Fecha");

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

    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked

        try {
            PreparedStatement PrSt;
            ResultSet resultado = null;
            int Fila = Tabla1.getSelectedRow();
            String Codigo = Tabla1.getValueAt(Fila, 0).toString();
            PrSt = conexion.prepareStatement("SELECT * FROM Venta WHERE ID_Venta = ?");
            PrSt.setString(1, Codigo);
            resultado = PrSt.executeQuery();

            while (resultado.next()) {

                Texto8.setText(resultado.getString("ID_Venta"));
            }
            PrSt.close();
            resultado.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Tabla1MouseClicked

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        Texto1.setText(null);
        Texto3.setText(null);
        Texto6.setText("0");
        Texto7.setText(null);
        Texto4.setText(null);
        Texto8.setText(null);
        BotonComprobar.setEnabled(false);
        BotonCredito.setEnabled(false);
        BotonVenta.setEnabled(false);
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

        try {
            PreparedStatement PrSt;
            String SQLQuery = "DELETE FROM Tienda WHERE Codigo = ?";
            PrSt = conexion.prepareStatement(SQLQuery);

            PrSt.setString(1, Texto8.getText());

            int resultado = PrSt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Informacion Eliminada");
                Texto1.setText(null);
                Texto3.setText(null);
                Texto6.setText("0");
                Texto7.setText(null);
                Texto4.setText(null);
                Texto8.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "Fallo al Eliminar");
            }
            PrSt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void Tabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla2MouseClicked

        try {
            PreparedStatement PrSt;
            ResultSet resultado = null;
            int Fila = Tabla2.getSelectedRow();
            String Codigo = Tabla2.getValueAt(Fila, 0).toString();
            PrSt = conexion.prepareStatement("SELECT * FROM Producto WHERE ID = ?");
            PrSt.setString(1, Codigo);
            resultado = PrSt.executeQuery();

            while (resultado.next()) {

                Texto1.setText(resultado.getString("Codigo"));
            }
            PrSt.close();
            resultado.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Tabla2MouseClicked

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        BotonComprobar.setEnabled(true);
    }//GEN-LAST:event_BotonIngresarActionPerformed

    private void BotonComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComprobarActionPerformed
        boolean comprobacion = false;

        try {
            PreparedStatement PrSt;
            ResultSet resultado;
            Codigo_Producto = Texto1.getText();
            NIT_Cliente = Texto3.getText();
            Cantidad = Integer.parseInt(Texto4.getText());

            Fecha = Texto7.getText();

            if ("".equals(Codigo_Producto)) {
                JOptionPane.showMessageDialog(null, "No hay codigo del producto");
                comprobacion = true;
            }
            if ("".equals(NIT_Cliente)) {
                JOptionPane.showMessageDialog(null, "No hay NIT del Cliete");
                comprobacion = true;
            }
            if ("".equals(Fecha)) {
                JOptionPane.showMessageDialog(null, "No hay fecha");
                comprobacion = true;
            }

            if (comprobacion == false) {
                String QuerySQL = "SELECT * FROM Producto WHERE Codigo = ?";
                PrSt = conexion.prepareStatement(QuerySQL);
                PrSt.setString(1, Codigo_Producto);
                resultado = PrSt.executeQuery();
                if (resultado.next()) {
                    Existencias = Integer.parseInt(resultado.getString("Cantidad"));
                    PrecioExistencias = Double.parseDouble(resultado.getString("Precio"));
                    int TotalExistencias;
                    TotalExistencias = Existencias - Cantidad;
                    if (TotalExistencias >= 0) {
                        Paga = PrecioExistencias * Cantidad;
                        Texto5.setText(String.valueOf(Paga));

                        String QuerySQL2 = "SELECT * FROM Cliente WHERE NIT = ?";
                        PrSt = conexion.prepareStatement(QuerySQL2);
                        PrSt.setString(1, NIT_Cliente);
                        resultado = PrSt.executeQuery();
                        if (resultado.next()) {
                            CreditoCliente = resultado.getDouble("Credito");
                            JOptionPane.showMessageDialog(null, "El Cliente tiene un credito acumulado de: Q" + CreditoCliente);
                            BotonCredito.setEnabled(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error en el NIT del cliente");
                        }
                        PrSt.close();
                        resultado.close();
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay existencias disponibles");
                    }
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_BotonComprobarActionPerformed

    private void BotonCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCreditoActionPerformed
        try {
            double TotalCredito;
            double TotalPaga;
            Credito = Double.parseDouble(Texto6.getText());
            TotalCredito = CreditoCliente - Credito;
            if (TotalCredito >= 0) {
                TotalPaga = Paga - Credito;
                if (TotalPaga >= 0) {
                    Paga = Paga - Credito;
                    Texto5.setText(String.valueOf(Paga));
                    BotonCredito.setEnabled(false);
                    BotonVenta.setEnabled(true);
                } else if (TotalPaga < 0) {
                    JOptionPane.showMessageDialog(null, "El credito no puede superar a la paga total");

                }
            } else {
                JOptionPane.showMessageDialog(null, "El credito ingresado es mayor al del cliente");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonCreditoActionPerformed

    private void BotonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVentaActionPerformed
        

        try {
            PreparedStatement PrSt;
            String SQLQuery = "INSERT INTO Venta (Codigo_Producto, Codigo_Tienda, NIT_Cliente, Cantidad, Pago, Credito, Fecha) VALUES(?,?,?,?,?,?,?)";
            PrSt = conexion.prepareStatement(SQLQuery);
            PrSt.setString(1, Codigo_Producto);
            PrSt.setString(2, Codigo_Tienda);
            PrSt.setString(3, NIT_Cliente);
            PrSt.setInt(4, Cantidad);
            PrSt.setDouble(5, Paga);
            PrSt.setDouble(6, Credito);
            PrSt.setDate(7, Date.valueOf(Fecha));
            int resultado = PrSt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Informacion Ingresada");
                CreditoCliente = CreditoCliente - Credito;
                String QueryCliente = "UPDATE Cliente SET Credito = ? WHERE NIT = ?";
                PrSt = conexion.prepareStatement(QueryCliente);
                PrSt.setDouble(1, CreditoCliente);
                PrSt.setString(2, NIT_Cliente);
                int EjecutarQuery = PrSt.executeUpdate();
                if (EjecutarQuery > 0) {
                    int CantidadFinal = Existencias - Cantidad;
                    String QueryProducto = "UPDATE Producto SET Cantidad = ? WHERE Codigo = ? AND Codigo_Tienda = ?";
                    PrSt = conexion.prepareStatement(QueryProducto);
                    PrSt.setInt(1, CantidadFinal);
                    PrSt.setString(2, Codigo_Producto);
                    PrSt.setString(3, Codigo_Tienda);
                    int Ejecucion = PrSt.executeUpdate();
                    if (Ejecucion > 0) {
                        Texto1.setText(null);
                        Texto3.setText(null);
                        Texto6.setText("0");
                        Texto7.setText(null);
                        Texto4.setText(null);
                        Texto8.setText(null);
                        BotonComprobar.setEnabled(false);
                        BotonCredito.setEnabled(false);
                        BotonVenta.setEnabled(false);

                        DefaultTableModel modelo = new DefaultTableModel();
                        Tabla2.setModel(modelo);
                        PreparedStatement parametro;
                        ResultSet resultado2 = null;
                        String ComandoSQL = "SELECT * FROM Producto WHERE Codigo_Tienda = ?";

                        parametro = conexion.prepareStatement(ComandoSQL);
                        parametro.setString(1, Codigo_Tienda);
                        resultado2 = parametro.executeQuery();

                        ResultSetMetaData result = resultado2.getMetaData();
                        int Columnas = result.getColumnCount();

                        modelo.addColumn("ID");
                        modelo.addColumn("Nombre");
                        modelo.addColumn("Fabricante");
                        modelo.addColumn("Codigo");
                        modelo.addColumn("Cantidad");
                        modelo.addColumn("Precio");
                        modelo.addColumn("Codigo_Tienda");
                        modelo.addColumn("Descripcion");
                        modelo.addColumn("Garantia");

                        while (resultado2.next()) {
                            Object[] filas = new Object[Columnas];
                            for (int i = 0; i < Columnas; i++) {
                                filas[i] = resultado2.getObject(i + 1);

                            }
                            modelo.addRow(filas);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Fallo al actualizar productos");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Fallo al actualizar credito");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fallo al realizar venta");
            }
            PrSt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonVentaActionPerformed

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta(conexion, Codigo_Tienda).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonComprobar;
    private javax.swing.JButton BotonCredito;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonListar;
    private javax.swing.JButton BotonVenta;
    private javax.swing.JTable Tabla1;
    private javax.swing.JTable Tabla2;
    private javax.swing.JTextField Texto1;
    private javax.swing.JTextField Texto2;
    private javax.swing.JTextField Texto3;
    private javax.swing.JTextField Texto4;
    private javax.swing.JTextField Texto5;
    private javax.swing.JTextField Texto6;
    private javax.swing.JTextField Texto7;
    private javax.swing.JTextField Texto8;
    private javax.swing.JTextField TextoAcciones;
    private javax.swing.JTextField TextoCodigo;
    private javax.swing.JTextField TextoCodigo1;
    private javax.swing.JTextField TextoCodigoTienda;
    private javax.swing.JTextField TextoCorreo;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoTel1;
    private javax.swing.JTextField TextoTel2;
    private javax.swing.JTextField Titulo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
