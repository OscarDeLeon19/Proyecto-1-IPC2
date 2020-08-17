package informacion_empresa;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.Conexion;

public class Datos_Producto extends javax.swing.JFrame {

    private Conexion ClaseConexion;
    private Connection conexion;

    public Datos_Producto(Conexion ClaseConexion) {
        initComponents();
        this.ClaseConexion = ClaseConexion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JTextField();
        TextoNombre = new javax.swing.JTextField();
        TextoFabricante = new javax.swing.JTextField();
        TextoCodigo = new javax.swing.JTextField();
        TextoCantidad = new javax.swing.JTextField();
        TextoGarantia = new javax.swing.JTextField();
        TextoPrecio = new javax.swing.JTextField();
        TextoDecripcion = new javax.swing.JTextField();
        Texto1 = new javax.swing.JTextField();
        Texto3 = new javax.swing.JTextField();
        Texto4 = new javax.swing.JTextField();
        Texto5 = new javax.swing.JTextField();
        Texto6 = new javax.swing.JTextField();
        Texto2 = new javax.swing.JTextField();
        Texto7 = new javax.swing.JTextField();
        BotonListarNombre = new javax.swing.JButton();
        BotonListarCodigo = new javax.swing.JButton();
        BotonListar = new javax.swing.JButton();
        BotonIngresar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        Texto9 = new javax.swing.JTextField();
        BotonLimpiar = new javax.swing.JButton();
        TextoCodigo_Tienda = new javax.swing.JTextField();
        Texto8 = new javax.swing.JTextField();
        BotonListarCodigoTienda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informacion");

        Titulo.setEditable(false);
        Titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo.setText("Informacion sobre los productos");

        TextoNombre.setEditable(false);
        TextoNombre.setForeground(new java.awt.Color(14, 7, 7));
        TextoNombre.setText("Nombre");
        TextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNombreActionPerformed(evt);
            }
        });

        TextoFabricante.setEditable(false);
        TextoFabricante.setText("Fabricante");

        TextoCodigo.setEditable(false);
        TextoCodigo.setText("Codigo");

        TextoCantidad.setEditable(false);
        TextoCantidad.setText("Cantidad");

        TextoGarantia.setEditable(false);
        TextoGarantia.setText("Garantia");

        TextoPrecio.setEditable(false);
        TextoPrecio.setText("Precio");

        TextoDecripcion.setEditable(false);
        TextoDecripcion.setText("Descripcion");

        BotonListarNombre.setText("Listar");
        BotonListarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarNombreActionPerformed(evt);
            }
        });

        BotonListarCodigo.setText("Listar");
        BotonListarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarCodigoActionPerformed(evt);
            }
        });

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

        jTextField11.setEditable(false);
        jTextField11.setForeground(new java.awt.Color(14, 7, 7));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("Acciones");

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
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

        TextoCodigo_Tienda.setEditable(false);
        TextoCodigo_Tienda.setText("Codigo_Tienda");

        BotonListarCodigoTienda.setText("Listar");
        BotonListarCodigoTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarCodigoTiendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextoCodigo_Tienda)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TextoCodigo)
                                .addComponent(TextoFabricante)
                                .addComponent(TextoCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextoPrecio)
                                .addComponent(TextoDecripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addComponent(TextoGarantia)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonListarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonListarCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Texto8, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto7, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Texto6, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonListarCodigoTienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(jTextField11)
                            .addComponent(BotonListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(Texto9)
                            .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(82, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonListarNombre)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonListarCodigo)
                    .addComponent(BotonIngresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonModificar))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCodigo_Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonListarCodigoTienda)
                    .addComponent(BotonLimpiar)
                    .addComponent(Texto6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoDecripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarActionPerformed
        try {

            conexion = ClaseConexion.getConnection2();
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement parametro;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Producto ORDER BY Codigo ASC";

            parametro = conexion.prepareStatement(ComandoSQL);
            resultado = parametro.executeQuery();

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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonListarActionPerformed

    private void BotonListarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarNombreActionPerformed
        try {
            String Nombre = Texto1.getText();
            conexion = ClaseConexion.getConnection2();
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement parametro;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Producto WHERE Nombre = '" + Nombre + "' ORDER BY Codigo ASC";

            parametro = conexion.prepareStatement(ComandoSQL);
            resultado = parametro.executeQuery();

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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonListarNombreActionPerformed

    private void BotonListarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarCodigoActionPerformed
        try {
            String Codigo = Texto3.getText();
            conexion = ClaseConexion.getConnection2();
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement parametro;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Producto WHERE Codigo = '" + Codigo + "' ORDER BY Codigo ASC";

            parametro = conexion.prepareStatement(ComandoSQL);
            resultado = parametro.executeQuery();

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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonListarCodigoActionPerformed

    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked
        PreparedStatement accion;
        ResultSet resultado = null;

        try {
            conexion = ClaseConexion.getConnection2();
            int Fila = Tabla1.getSelectedRow();
            String Codigo = Tabla1.getValueAt(Fila, 0).toString();
            accion = conexion.prepareStatement("SELECT * FROM Producto WHERE ID = ?");
            accion.setString(1, Codigo);
            resultado = accion.executeQuery();

            while (resultado.next()) {

                Texto1.setText(resultado.getString("Nombre"));
                Texto2.setText(resultado.getString("Fabricante"));
                Texto3.setText(resultado.getString("Codigo"));
                Texto4.setText(String.valueOf(resultado.getInt("Cantidad")));
                Texto5.setText(String.valueOf(resultado.getDouble("Precio")));
                Texto6.setText(resultado.getString("Codigo_Tienda"));
                Texto7.setText(resultado.getString("Descripcion"));
                Texto8.setText(String.valueOf(resultado.getInt("Garantia")));
                Texto9.setText(String.valueOf(resultado.getInt("ID")));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Tabla1MouseClicked

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        PreparedStatement accion;
        PreparedStatement Comprobacion;
        ResultSet rs = null;
        boolean ProductoComprobado = false;
        Texto9.setText(null);
        String Nombre = Texto1.getText();
        String Fabricante = Texto2.getText();
        String Codigo = Texto3.getText();
        String Cantidad = Texto4.getText();
        String Precio = Texto5.getText();
        String CodigoTienda = Texto6.getText();
        String Descripcion = Texto7.getText();
        String Garantia = Texto8.getText();

        if ("".equals(Nombre)) {
            Nombre = null;
        }
        if ("".equals(Fabricante)) {
            Fabricante = null;
        }
        if ("".equals(Codigo)) {
            Codigo = null;
        }
        if ("".equals(Cantidad)) {
            Cantidad = null;
        }
        if ("".equals(Precio)) {
            Precio = null;
        }
        if ("".equals(CodigoTienda)) {
            CodigoTienda = null;
        }
        if ("".equals(Descripcion)) {
            Descripcion = null;
        }
        if ("".equals(Garantia)) {
            Garantia = "0";
        }
        try {
            conexion = ClaseConexion.getConnection2();
            String ComprobarQuery = "SELECT * FROM Producto WHERE Codigo = ? AND Codigo_Tienda = ?";
            Comprobacion = conexion.prepareCall(ComprobarQuery);
            Comprobacion.setString(1, Codigo);
            Comprobacion.setString(2, CodigoTienda);
            rs = Comprobacion.executeQuery();

            if (rs.next()) {
                ProductoComprobado = true;
            }

            if (ProductoComprobado == false) {
                String SQLQuery = "INSERT INTO Producto (Nombre, Fabricante, Codigo, Cantidad, Precio, Codigo_Tienda, Descripcion, Garantia) VALUES(?,?,?,?,?,?,?,?)";
                accion = conexion.prepareStatement(SQLQuery);
                accion.setString(1, Nombre);
                accion.setString(2, Fabricante);
                accion.setString(3, Codigo);
                accion.setInt(4, Integer.parseInt(Cantidad));
                accion.setDouble(5, Double.parseDouble(Precio));
                accion.setString(6, CodigoTienda);
                accion.setString(7, Descripcion);
                accion.setInt(8, Integer.parseInt(Garantia));

                int resultado = accion.executeUpdate();
                JOptionPane.showMessageDialog(null, "Informacion Ingresada");
            } else {
                JOptionPane.showMessageDialog(null, "Este producto ya esta ingresado en la tienda");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonIngresarActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        Texto1.setText(null);
        Texto2.setText(null);
        Texto3.setText(null);
        Texto4.setText(null);
        Texto5.setText(null);
        Texto6.setText(null);
        Texto7.setText(null);
        Texto8.setText(null);
        Texto9.setText(null);
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        PreparedStatement Comprobacion;
        ResultSet rs = null;
        boolean ProductoComprobado = false;
        String Nombre = Texto1.getText();
        String Fabricante = Texto2.getText();
        String Codigo = Texto3.getText();
        String Cantidad = Texto4.getText();
        String Precio = Texto5.getText();
        String CodigoTienda = Texto6.getText();
        String Descripcion = Texto7.getText();
        String Garantia = Texto8.getText();

        if ("".equals(Nombre)) {
            Nombre = null;
        }
        if ("".equals(Fabricante)) {
            Fabricante = null;
        }
        if ("".equals(Codigo)) {
            Codigo = null;
        }
        if ("".equals(Cantidad)) {
            Cantidad = null;
        }
        if ("".equals(Precio)) {
            Precio = null;
        }
        if ("".equals(CodigoTienda)) {
            CodigoTienda = null;
        }
        if ("".equals(Descripcion)) {
            Descripcion = null;
        }
        if ("".equals(Garantia)) {
            Garantia = "0";
        }
        PreparedStatement accion;
        try {
            conexion = ClaseConexion.getConnection2();
            String ComprobarQuery = "SELECT * FROM Producto WHERE Codigo = ? AND Codigo_Tienda = ?";
            Comprobacion = conexion.prepareCall(ComprobarQuery);
            Comprobacion.setString(1, Codigo);
            Comprobacion.setString(2, CodigoTienda);
            rs = Comprobacion.executeQuery();

            if (rs.next()) {
                ProductoComprobado = true;
            }
            if (ProductoComprobado == false) {
                String SQLQuery = "UPDATE Producto SET Nombre =?, Fabricante =?, Codigo =?, Cantidad =?, Precio =?, Codigo_Tienda =?, Descripcion =?, Garantia = ? WHERE ID =?";
                accion = conexion.prepareStatement(SQLQuery);
                accion.setString(1, Nombre);
                accion.setString(2, Fabricante);
                accion.setString(3, Codigo);
                accion.setInt(4, Integer.parseInt(Cantidad));
                accion.setDouble(5, Double.parseDouble(Precio));
                accion.setString(6, CodigoTienda);
                accion.setString(7, Descripcion);
                accion.setInt(8, Integer.parseInt(Garantia));
                accion.setInt(9, Integer.parseInt(Texto9.getText()));

                int resultado = accion.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Informacion Modificada");
                    Texto1.setText(null);
                    Texto2.setText(null);
                    Texto3.setText(null);
                    Texto4.setText(null);
                    Texto5.setText(null);
                    Texto6.setText(null);
                    Texto7.setText(null);
                    Texto8.setText(null);
                    Texto9.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Fallo al modificar");
                }

            } else {
                JOptionPane.showMessageDialog(null, "No se puede modificar porque el producto ya existe");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        PreparedStatement accion;
        try {
            conexion = ClaseConexion.getConnection2();
            String SQLQuery = "DELETE FROM Producto WHERE ID = ?";
            accion = conexion.prepareStatement(SQLQuery);

            accion.setInt(1, Integer.parseInt(Texto9.getText()));

            int resultado = accion.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Informacion Eliminada");
                Texto1.setText(null);
                Texto2.setText(null);
                Texto3.setText(null);
                Texto4.setText(null);
                Texto5.setText(null);
                Texto6.setText(null);
                Texto7.setText(null);
                Texto8.setText(null);
                Texto9.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "Fallo al Eliminar");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void TextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNombreActionPerformed

    private void BotonListarCodigoTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarCodigoTiendaActionPerformed
        try {
            String Codigo = Texto6.getText();
            conexion = ClaseConexion.getConnection2();
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement parametro;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Producto WHERE Codigo_Tienda = '" + Codigo + "' ORDER BY Codigo ASC";

            parametro = conexion.prepareStatement(ComandoSQL);
            resultado = parametro.executeQuery();

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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonListarCodigoTiendaActionPerformed

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
            java.util.logging.Logger.getLogger(Datos_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos_Producto(ClaseConexion).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonListar;
    private javax.swing.JButton BotonListarCodigo;
    private javax.swing.JButton BotonListarCodigoTienda;
    private javax.swing.JButton BotonListarNombre;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JTable Tabla1;
    private javax.swing.JTextField Texto1;
    private javax.swing.JTextField Texto2;
    private javax.swing.JTextField Texto3;
    private javax.swing.JTextField Texto4;
    private javax.swing.JTextField Texto5;
    private javax.swing.JTextField Texto6;
    private javax.swing.JTextField Texto7;
    private javax.swing.JTextField Texto8;
    private javax.swing.JTextField Texto9;
    private javax.swing.JTextField TextoCantidad;
    private javax.swing.JTextField TextoCodigo;
    private javax.swing.JTextField TextoCodigo_Tienda;
    private javax.swing.JTextField TextoDecripcion;
    private javax.swing.JTextField TextoFabricante;
    private javax.swing.JTextField TextoGarantia;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoPrecio;
    private javax.swing.JTextField Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField11;
    // End of variables declaration//GEN-END:variables
}
