package acciones;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pedido extends javax.swing.JFrame {

    private Connection conexion;
    private String Codigo_Tienda;
    private String CodigoPedido;
    private String TiendaOrigen;
    private String Fecha;
    private String NITCliente;
    private String CodigoProducto;
    private int Cantidad;
    private double Total;
    private double Anticipo;
    private double Credito;

    private double CreditoCliente;
    private int Existencias;
    private double PrecioExistencias;
    /**
     * Crea un objeto de tipo Pedido
     * Agrega los productos en las otras tiendas para facilitar la realizacion de un pedido.
     * @param conexion La conexion con la base de datos
     * @param Codigo_Tienda El codigo de la Tienda en donde estamos
     */
    public Pedido(Connection conexion, String Codigo_Tienda) {
        initComponents();
        this.conexion = conexion;
        this.Codigo_Tienda = Codigo_Tienda;
        Texto3.setText(Codigo_Tienda);

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla2.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Producto WHERE Codigo_Tienda != ?";

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
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JTextField();
        TextoNombre = new javax.swing.JTextField();
        TextoDireccion = new javax.swing.JTextField();
        TextoCodigo = new javax.swing.JTextField();
        TextoTel1 = new javax.swing.JTextField();
        TextoHorario = new javax.swing.JTextField();
        TextoTel2 = new javax.swing.JTextField();
        TextoCorreo = new javax.swing.JTextField();
        Texto1 = new javax.swing.JTextField();
        Texto3 = new javax.swing.JTextField();
        Texto4 = new javax.swing.JTextField();
        Texto5 = new javax.swing.JTextField();
        Texto6 = new javax.swing.JTextField();
        Texto2 = new javax.swing.JTextField();
        Texto7 = new javax.swing.JTextField();
        BotonEliminar = new javax.swing.JButton();
        TextoAcciones = new javax.swing.JTextField();
        BotonLimpiar = new javax.swing.JButton();
        TextoHorario1 = new javax.swing.JTextField();
        TextoAnticipo = new javax.swing.JTextField();
        Texto8 = new javax.swing.JTextField();
        Texto9 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        Texto11 = new javax.swing.JTextField();
        TextoCredito = new javax.swing.JTextField();
        Texto10 = new javax.swing.JTextField();
        TextoCredito1 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        BotonListar = new javax.swing.JButton();
        BotonIngresar = new javax.swing.JButton();
        BotonAgregar = new javax.swing.JButton();
        BotonFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informacion");

        Titulo.setEditable(false);
        Titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo.setText("Pedidos de la empresa");

        TextoNombre.setEditable(false);
        TextoNombre.setForeground(new java.awt.Color(14, 7, 7));
        TextoNombre.setText("Codigo_Pedido");

        TextoDireccion.setEditable(false);
        TextoDireccion.setText("Codigo_TiendaOrigen");

        TextoCodigo.setEditable(false);
        TextoCodigo.setText("Codigo_TiendaDestino");

        TextoTel1.setEditable(false);
        TextoTel1.setText("Fecha");

        TextoHorario.setEditable(false);
        TextoHorario.setText("Cantidad");

        TextoTel2.setEditable(false);
        TextoTel2.setText("NIT_Cliente");

        TextoCorreo.setEditable(false);
        TextoCorreo.setText("Codigo_Producto");

        Texto3.setEditable(false);

        Texto6.setEditable(false);

        Texto2.setEditable(false);

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

        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        TextoHorario1.setEditable(false);
        TextoHorario1.setText("Total");

        TextoAnticipo.setEditable(false);
        TextoAnticipo.setText("Anticipo");

        Texto8.setEditable(false);

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

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_Pedido", "Codigo_Pedido", "Codigo_Tienda1", "Codigo_Tienda2", "Fecha", "NIT_Cliente", "Codigo_Producto", "Cantidad", "Total", "Anticipo", "Credito", "Estado", "FechaDeEntrega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
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

        Texto11.setEditable(false);

        TextoCredito.setEditable(false);
        TextoCredito.setText("Credito");

        TextoCredito1.setEditable(false);
        TextoCredito1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoCredito1.setText("Productos de otras tiendas");

        jTextField1.setText("Pedidos Realizados");

        BotonListar.setText("Listar Pedidos");
        BotonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarActionPerformed(evt);
            }
        });

        BotonIngresar.setText("IngresarPedido");
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });

        BotonAgregar.setText("Agregar Anticipo y Credito");
        BotonAgregar.setEnabled(false);
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        BotonFinalizar.setText("Finalizar Pedido");
        BotonFinalizar.setEnabled(false);
        BotonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoHorario1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoTel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto6, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto7, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto8, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Texto10, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Texto9, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Texto11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(216, 216, 216))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoCredito1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Texto11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonIngresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoHorario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Texto9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotonAgregar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonFinalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoCredito1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Limpia las cajas de texto de la interfaz
     * @param evt 
     */
    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        Texto1.setText(null);
        Texto2.setText(null);
        Texto4.setText(null);
        Texto5.setText(null);
        Texto6.setText(null);
        Texto7.setText(null);
        Texto8.setText(null);
        Texto9.setText(null);
        Texto10.setText(null);
        Texto11.setText(null);
    }//GEN-LAST:event_BotonLimpiarActionPerformed
    /**
     * Elimina un pedido de la base de datos 
     * @param evt 
     */
    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

        try {
            PreparedStatement PrSt;
            
            String SQLQuery = "DELETE FROM Pedido WHERE ID_Pedido = ?";
            PrSt = conexion.prepareStatement(SQLQuery);
            PrSt.setString(1, Texto11.getText());
            int resultado = PrSt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Informacion Eliminada");
                Texto11.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "Fallo al Eliminar");
            }
            PrSt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed
    /**
     * Obtiene el codigo y el codigo de la tienda de el producto para guardarlo en las cajas de texto
     * @param evt 
     */
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

                Texto2.setText(resultado.getString("Codigo_Tienda"));
                Texto6.setText(resultado.getString("Codigo"));

            }
            PrSt.close();
            resultado.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Tabla2MouseClicked
    /**
     * Obtiene el ID de el pedido para realizar acciones
     * @param evt 
     */
    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked

        try {
            PreparedStatement PrSt;
            ResultSet resultado = null;
            int Fila = Tabla1.getSelectedRow();
            String Codigo = Tabla1.getValueAt(Fila, 0).toString();
            PrSt = conexion.prepareStatement("SELECT * FROM Pedido WHERE ID_Pedido = ?");
            PrSt.setString(1, Codigo);
            resultado = PrSt.executeQuery();

            while (resultado.next()) {

                Texto11.setText(resultado.getString("ID_Pedido"));

            }
            PrSt.close();
            resultado.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Tabla1MouseClicked
    /**
     * Lista todos los pedidos realizados que no se han ingresado a la tienda
     * @param evt 
     */
    private void BotonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarActionPerformed
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Pedido WHERE Estado IS NULL";

            PrSt = conexion.prepareStatement(ComandoSQL);
            resultado = PrSt.executeQuery();

            ResultSetMetaData result = resultado.getMetaData();
            int Columnas = result.getColumnCount();

            modelo.addColumn("ID_Pedido");
            modelo.addColumn("Codigo_Pedido");
            modelo.addColumn("Codigo_Tienda1");
            modelo.addColumn("Codigo_Tienda2");
            modelo.addColumn("Fecha");
            modelo.addColumn("NIT_Cliente");
            modelo.addColumn("Codigo_Producto");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Total");
            modelo.addColumn("Anticipo");
            modelo.addColumn("Credito");
            modelo.addColumn("Estado");
            modelo.addColumn("FechaDeEntrega");

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
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_BotonListarActionPerformed
    /**
     * Ingresa un nuevo pedido
     * Comprueba que todos los datos de la caja de texto sean correctos
     * Obtiene el credito de el cliente por si se desea utilizarlo
     * Muestra el total a pagar de los productos pedidos
     * Muestra el anticipo minimo a ingresar
     * @param evt 
     */
    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        boolean comprobacion = true;

        try {
            PreparedStatement PrSt;
            ResultSet resultado;
            CodigoPedido = Texto1.getText();
            TiendaOrigen = Texto2.getText();
            Fecha = Texto4.getText();
            NITCliente = Texto5.getText();
            CodigoProducto = Texto6.getText();
            Cantidad = Integer.parseInt(Texto7.getText());

            if ("".equals(CodigoPedido)) {
                JOptionPane.showMessageDialog(null, "No ingresaste el codigo del pedido");
                comprobacion = false;
            }
            if ("".equals(TiendaOrigen)) {
                JOptionPane.showMessageDialog(null, "No ingresaste la tienda origen");
                comprobacion = false;
            }
            if ("".equals(Fecha)) {
                JOptionPane.showMessageDialog(null, "No ingresaste la fecha");
                comprobacion = false;
            }
            if ("".equals(NITCliente)) {
                JOptionPane.showMessageDialog(null, "No ingresaste el NIT del cliente");
                comprobacion = false;
            }
            if ("".equals(CodigoProducto)) {
                JOptionPane.showMessageDialog(null, "No ingresaste el codigo del producto");
                comprobacion = false;
            }

            if (comprobacion == true) {
                String QuerySQL = "SELECT * FROM Producto WHERE Codigo = ? AND Codigo_Tienda = ?";
                PrSt = conexion.prepareStatement(QuerySQL);
                PrSt.setString(1, CodigoProducto);
                PrSt.setString(2, TiendaOrigen);
                resultado = PrSt.executeQuery();
                if (resultado.next()) {
                    Existencias = resultado.getInt("Cantidad");
                    System.out.println("Exit1 = " + Existencias);
                    PrecioExistencias = resultado.getDouble("Precio");
                    int TotalExistencias;
                    TotalExistencias = Existencias - Cantidad;
                    if (TotalExistencias >= 0) {
                        Total = PrecioExistencias * Cantidad;
                        Texto8.setText(String.valueOf(Total));

                        String QuerySQL2 = "SELECT * FROM Cliente WHERE NIT = ?";
                        PrSt = conexion.prepareStatement(QuerySQL2);
                        PrSt.setString(1, NITCliente);
                        resultado = PrSt.executeQuery();
                        if (resultado.next()) {
                            CreditoCliente = resultado.getDouble("Credito");
                            JOptionPane.showMessageDialog(null, "El Cliente tiene un credito acumulado de: Q" + CreditoCliente);
                            double AnticipoMinimo = Total * 0.25;
                            JOptionPane.showMessageDialog(null, "El anticipo minimo debe de ser de: Q" + AnticipoMinimo);
                            BotonAgregar.setEnabled(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error en el NIT del cliente");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay existencias disponibles");
                    }
                }
                PrSt.close();
                resultado.close();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_BotonIngresarActionPerformed
    /**
     * Obtiene el anticipo y suma el credito que usa el cliente.
     * Comprueba que esta suma no sea mayor al total
     * @param evt 
     */
    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        try {
            double AnticipoMinimo = Total * 0.25;

            Anticipo = Double.parseDouble(Texto9.getText());
            Credito = Double.parseDouble(Texto10.getText());
            double TotalTotal = Anticipo + Credito;
            if (TotalTotal >= AnticipoMinimo) {
                if (TotalTotal <= Total) {
                    Anticipo = Anticipo + Credito;
                    Texto9.setText(String.valueOf(Anticipo));
                    BotonFinalizar.setEnabled(true);
                    BotonAgregar.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "El Anticipo es mayor que el pago Total");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Anticipo es menor del 25%");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

    }//GEN-LAST:event_BotonAgregarActionPerformed
    /**
     * Finaliza de comprobar los datos e ingresa el pedido a la base de datos
     * Descuenta los productos pedidos a los de la existencia
     * Descuenta el credito utilizado por el cliente.
     * @param evt 
     */
    private void BotonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFinalizarActionPerformed
        try {
            PreparedStatement PrSt;
            String Query1 = "INSERT INTO Pedido (Codigo_Pedido, Codigo_Tienda1, Codigo_Tienda2, Fecha, NIT_Cliente, Codigo_Producto, Cantidad, Total, Anticipo, Credito) VALUES (?,?,?,?,?,?,?,?,?,?)";

            PrSt = conexion.prepareStatement(Query1);
            PrSt.setString(1, CodigoPedido);
            PrSt.setString(2, TiendaOrigen);
            PrSt.setString(3, Codigo_Tienda);
            PrSt.setDate(4, Date.valueOf(Fecha));
            PrSt.setString(5, NITCliente);
            PrSt.setString(6, CodigoProducto);
            PrSt.setInt(7, Cantidad);
            PrSt.setDouble(8, Total);
            PrSt.setDouble(9, Anticipo);
            PrSt.setDouble(10, Credito);
            int resultado = PrSt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Pedido Ingresado");
                CreditoCliente = CreditoCliente - Credito;
                String QueryCliente = "UPDATE Cliente SET Credito = ? WHERE NIT = ?";
                PrSt = conexion.prepareStatement(QueryCliente);
                PrSt.setDouble(1, CreditoCliente);
                PrSt.setString(2, NITCliente);
                int EjecutarQuery = PrSt.executeUpdate();
                if (EjecutarQuery > 0) {
                    System.out.println(Existencias);
                    System.out.println(Cantidad);
                    int CantidadFinal = Existencias - Cantidad;
                    String QueryProducto = "UPDATE Producto SET Cantidad = ? WHERE Codigo = ? AND Codigo_Tienda = ?";
                    PrSt = conexion.prepareStatement(QueryProducto);
                    PrSt.setInt(1, CantidadFinal);
                    PrSt.setString(2, CodigoProducto);
                    PrSt.setString(3, TiendaOrigen);
                    int Ejecucion = PrSt.executeUpdate();
                    if (Ejecucion > 0) {
                        Texto1.setText(null);
                        Texto2.setText(null);
                        Texto4.setText(null);
                        Texto5.setText(null);
                        Texto6.setText(null);
                        Texto7.setText(null);
                        Texto8.setText(null);
                        Texto9.setText(null);
                        Texto10.setText(null);
                        BotonFinalizar.setEnabled(false);
                        BotonAgregar.setEnabled(false);

                        DefaultTableModel modelo = new DefaultTableModel();
                        Tabla2.setModel(modelo);
                        PreparedStatement parametro;
                        ResultSet resultado2 = null;
                        String ComandoSQL = "SELECT * FROM Producto WHERE Codigo_Tienda != ?";

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
                JOptionPane.showMessageDialog(null, "Error al ingresar el pedido");
            }
            PrSt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_BotonFinalizarActionPerformed
    /**
     * Ejecuta la ventana
     */
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
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedido(conexion, Codigo_Tienda).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonFinalizar;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonListar;
    private javax.swing.JTable Tabla1;
    private javax.swing.JTable Tabla2;
    private javax.swing.JTextField Texto1;
    private javax.swing.JTextField Texto10;
    private javax.swing.JTextField Texto11;
    private javax.swing.JTextField Texto2;
    private javax.swing.JTextField Texto3;
    private javax.swing.JTextField Texto4;
    private javax.swing.JTextField Texto5;
    private javax.swing.JTextField Texto6;
    private javax.swing.JTextField Texto7;
    private javax.swing.JTextField Texto8;
    private javax.swing.JTextField Texto9;
    private javax.swing.JTextField TextoAcciones;
    private javax.swing.JTextField TextoAnticipo;
    private javax.swing.JTextField TextoCodigo;
    private javax.swing.JTextField TextoCorreo;
    private javax.swing.JTextField TextoCredito;
    private javax.swing.JTextField TextoCredito1;
    private javax.swing.JTextField TextoDireccion;
    private javax.swing.JTextField TextoHorario;
    private javax.swing.JTextField TextoHorario1;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoTel1;
    private javax.swing.JTextField TextoTel2;
    private javax.swing.JTextField Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
