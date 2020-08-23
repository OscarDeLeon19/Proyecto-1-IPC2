package informacion_empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Datos_Producto extends javax.swing.JFrame {

    private Connection conexion;

    /**
     * Inicializa un objeto de tipo Datos_Producto
     *
     * @param conexion La conexion de la base de datos
     */
    public Datos_Producto(Connection conexion) {
        initComponents();
        this.conexion = conexion;
        this.setLocationRelativeTo(null);
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
                            .addComponent(TextoCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextoFabricante, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextoCantidad)
                            .addComponent(TextoNombre)
                            .addComponent(TextoPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextoDecripcion)
                            .addComponent(TextoGarantia, javax.swing.GroupLayout.Alignment.TRAILING))
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
    /**
     * Lista todos los productos disponibles
     *
     * @param evt
     */
    private void BotonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarActionPerformed
        try {

            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Producto ORDER BY Codigo ASC";

            PrSt = conexion.prepareStatement(ComandoSQL);
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
    }//GEN-LAST:event_BotonListarActionPerformed
    /**
     * Lista todos los productos diponibles fintrados por su nombre
     *
     * @param evt
     */
    private void BotonListarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarNombreActionPerformed
        try {
            String Nombre = Texto1.getText();
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Producto WHERE Nombre = ? ORDER BY Codigo ASC";

            PrSt = conexion.prepareStatement(ComandoSQL);
            PrSt.setString(1, Nombre);
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
    }//GEN-LAST:event_BotonListarNombreActionPerformed
    /**
     * Lista todos los productos disponibles filtrados por su codigo
     *
     * @param evt
     */
    private void BotonListarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarCodigoActionPerformed
        try {
            String Codigo = Texto3.getText();
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Producto WHERE Codigo = ? ORDER BY Codigo ASC";

            PrSt = conexion.prepareStatement(ComandoSQL);
            PrSt.setString(1, Codigo);
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
    }//GEN-LAST:event_BotonListarCodigoActionPerformed
    /**
     * Agrega la fila seleccionada de la tabla a los cuadros de texto
     *
     * @param evt
     */
    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked

        try {
            PreparedStatement PrSt;
            ResultSet resultado = null;
            int Fila = Tabla1.getSelectedRow();
            String Codigo = Tabla1.getValueAt(Fila, 0).toString();
            PrSt = conexion.prepareStatement("SELECT * FROM Producto WHERE ID = ?");
            PrSt.setString(1, Codigo);
            resultado = PrSt.executeQuery();

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
            PrSt.close();
            resultado.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Tabla1MouseClicked
    /**
     * Ingresa un nuevo producto a la Tienda
     *
     * @param evt
     */
    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed

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
            PreparedStatement PrSt1;
            PreparedStatement PrSt2;
            ResultSet rs = null;
            String ComprobarQuery = "SELECT * FROM Producto WHERE Codigo = ? AND Codigo_Tienda = ?";
            PrSt2 = conexion.prepareCall(ComprobarQuery);
            PrSt2.setString(1, Codigo);
            PrSt2.setString(2, CodigoTienda);
            rs = PrSt2.executeQuery();

            if (rs.next()) {
                ProductoComprobado = true;
            }

            if (ProductoComprobado == false) {
                String SQLQuery = "INSERT INTO Producto (Nombre, Fabricante, Codigo, Cantidad, Precio, Codigo_Tienda, Descripcion, Garantia) VALUES(?,?,?,?,?,?,?,?)";
                PrSt1 = conexion.prepareStatement(SQLQuery);
                PrSt1.setString(1, Nombre);
                PrSt1.setString(2, Fabricante);
                PrSt1.setString(3, Codigo);
                PrSt1.setInt(4, Integer.parseInt(Cantidad));
                PrSt1.setDouble(5, Double.parseDouble(Precio));
                PrSt1.setString(6, CodigoTienda);
                PrSt1.setString(7, Descripcion);
                PrSt1.setInt(8, Integer.parseInt(Garantia));

                int resultado = PrSt1.executeUpdate();
                JOptionPane.showMessageDialog(null, "Informacion Ingresada");
                Limpiar();
                PrSt1.close();
            } else {
                JOptionPane.showMessageDialog(null, "Este producto ya esta ingresado en la tienda");
            }

            PrSt2.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_BotonIngresarActionPerformed
    /**
     * Llama al metodo para limpiar los cuadros
     *
     * @param evt
     */
    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_BotonLimpiarActionPerformed
    /**
     * Limpia los cuadros de texto de la interfaz
     */
    public void Limpiar() {
        Texto1.setText(null);
        Texto2.setText(null);
        Texto3.setText(null);
        Texto4.setText(null);
        Texto5.setText(null);
        Texto6.setText(null);
        Texto7.setText(null);
        Texto8.setText(null);
        Texto9.setText(null);
    }

    /**
     * Modifica los datos de un producto
     *
     * @param evt
     */
    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed

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

        try {
            PreparedStatement PrSt1;
            PreparedStatement PrSt2;
            ResultSet rs = null;
            String ComprobarQuery = "SELECT * FROM Producto WHERE Codigo = ? AND Codigo_Tienda = ?";
            PrSt1 = conexion.prepareCall(ComprobarQuery);
            PrSt1.setString(1, Codigo);
            PrSt1.setString(2, CodigoTienda);
            rs = PrSt1.executeQuery();

            if (rs.next()) {
                ProductoComprobado = true;
            }
            if (ProductoComprobado == false) {
                String SQLQuery = "UPDATE Producto SET Nombre =?, Fabricante =?, Codigo =?, Cantidad =?, Precio =?, Codigo_Tienda =?, Descripcion =?, Garantia = ? WHERE ID =?";
                PrSt2 = conexion.prepareStatement(SQLQuery);
                PrSt2.setString(1, Nombre);
                PrSt2.setString(2, Fabricante);
                PrSt2.setString(3, Codigo);
                PrSt2.setInt(4, Integer.parseInt(Cantidad));
                PrSt2.setDouble(5, Double.parseDouble(Precio));
                PrSt2.setString(6, CodigoTienda);
                PrSt2.setString(7, Descripcion);
                PrSt2.setInt(8, Integer.parseInt(Garantia));
                PrSt2.setInt(9, Integer.parseInt(Texto9.getText()));

                int resultado = PrSt2.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Informacion Modificada");
                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Fallo al modificar");
                }
                PrSt2.close();
            } else {
                JOptionPane.showMessageDialog(null, "No se puede modificar porque el producto ya existe");
            }
            PrSt1.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_BotonModificarActionPerformed
    /**
     * Elimina un producto de la tienda
     *
     * @param evt
     */
    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

        try {
            PreparedStatement PrSt;
            String SQLQuery = "DELETE FROM Producto WHERE ID = ?";
            PrSt = conexion.prepareStatement(SQLQuery);

            PrSt.setInt(1, Integer.parseInt(Texto9.getText()));

            int resultado = PrSt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Informacion Eliminada");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Fallo al Eliminar");
            }
            PrSt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed
    /**
     * Lista todos los productos disponibles filtrados por el codigo de la
     * tienda en la que esten
     *
     * @param evt
     */
    private void BotonListarCodigoTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarCodigoTiendaActionPerformed
        try {
            String Codigo = Texto6.getText();
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Producto WHERE Codigo_Tienda = ? ORDER BY Codigo ASC";

            PrSt = conexion.prepareStatement(ComandoSQL);
            PrSt.setString(1, Codigo);
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
    }//GEN-LAST:event_BotonListarCodigoTiendaActionPerformed
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
                new Datos_Producto(conexion).setVisible(true);
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
