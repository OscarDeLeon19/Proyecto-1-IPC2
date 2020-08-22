package opciones_cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.Conexion;

public class Catalogo_Producto extends javax.swing.JFrame {

    private Connection conexion;
    private String QueryTodos;
    private String QueryNombre;
    private String QueryFabricante;
    private String QueryCodigo;
    private String Nombre;
    private String Fabricante;
    private String Codigo;

    public Catalogo_Producto(Connection conexion) {
        initComponents();
        this.conexion = conexion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JTextField();
        TextoNombre = new javax.swing.JTextField();
        TextoFabricante = new javax.swing.JTextField();
        TextoCodigo = new javax.swing.JTextField();
        Texto1 = new javax.swing.JTextField();
        Texto3 = new javax.swing.JTextField();
        Texto2 = new javax.swing.JTextField();
        BotonListarNombre = new javax.swing.JButton();
        BotonListarCodigo = new javax.swing.JButton();
        BotonListar = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        TextoSub = new javax.swing.JTextField();
        BotonNombre = new javax.swing.JButton();
        BotonFabricante = new javax.swing.JButton();
        BotonCodigo = new javax.swing.JButton();
        BotonCantidad = new javax.swing.JButton();
        BotonPrecio = new javax.swing.JButton();
        BotonListarFabricante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informacion");

        Titulo.setEditable(false);
        Titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo.setText("Productos de la empresa");

        TextoNombre.setEditable(false);
        TextoNombre.setForeground(new java.awt.Color(14, 7, 7));
        TextoNombre.setText("Nombre");

        TextoFabricante.setEditable(false);
        TextoFabricante.setText("Fabricante");

        TextoCodigo.setEditable(false);
        TextoCodigo.setText("Codigo");

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

        BotonListar.setText("Todos");
        BotonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarActionPerformed(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setForeground(new java.awt.Color(14, 7, 7));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("Ordenar en base a");

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
        jScrollPane1.setViewportView(Tabla1);

        TextoSub.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoSub.setText("Ver Productos");

        BotonNombre.setText("Nombre");
        BotonNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNombreActionPerformed(evt);
            }
        });

        BotonFabricante.setText("Fabricante");
        BotonFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFabricanteActionPerformed(evt);
            }
        });

        BotonCodigo.setText("Codigo");
        BotonCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCodigoActionPerformed(evt);
            }
        });

        BotonCantidad.setText("Cantidad");
        BotonCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCantidadActionPerformed(evt);
            }
        });

        BotonPrecio.setText("Precio");
        BotonPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPrecioActionPerformed(evt);
            }
        });

        BotonListarFabricante.setText("Listar");
        BotonListarFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarFabricanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextoCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextoFabricante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(TextoNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotonListar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(BotonListarCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotonListarFabricante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TextoSub, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                            .addComponent(BotonListarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonListarNombre)
                    .addComponent(BotonNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonFabricante)
                    .addComponent(BotonListarFabricante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonListarCodigo)
                    .addComponent(BotonCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonListar)
                    .addComponent(BotonCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonPrecio)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarActionPerformed
        try {
            QueryNombre = null;
            QueryFabricante = null;
            QueryCodigo = null;
            DefaultTableModel modelo = new DefaultTableModel();

            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Producto";

            PrSt = conexion.prepareStatement(ComandoSQL);
            resultado = PrSt.executeQuery();
            QueryTodos = ComandoSQL;

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
    }//GEN-LAST:event_BotonListarActionPerformed

    private void BotonListarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarNombreActionPerformed
        try {
            QueryTodos = null;
            QueryFabricante = null;
            QueryCodigo = null;
            Nombre = Texto1.getText();
            Nombre = "%" + Nombre + "%";
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Producto WHERE Nombre LIKE ? ";

            PrSt = conexion.prepareStatement(ComandoSQL);
            PrSt.setString(1, Nombre);
            resultado = PrSt.executeQuery();
            QueryNombre = ComandoSQL;
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
    }//GEN-LAST:event_BotonListarNombreActionPerformed

    private void BotonListarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarCodigoActionPerformed
        try {
            QueryTodos = null;
            QueryNombre = null;
            QueryFabricante = null;
            Codigo = Texto3.getText();
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Producto WHERE Codigo = ? ";

            PrSt = conexion.prepareStatement(ComandoSQL);
            PrSt.setString(1, Codigo);
            resultado = PrSt.executeQuery();
            QueryCodigo = ComandoSQL;
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
    }//GEN-LAST:event_BotonListarCodigoActionPerformed

    private void BotonListarFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarFabricanteActionPerformed
        try {
            QueryTodos = null;
            QueryNombre = null;
            QueryCodigo = null;
            Fabricante = Texto2.getText();
            Fabricante = "%" + Fabricante + "%";
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Producto WHERE Fabricante LIKE ? ";

            PrSt = conexion.prepareStatement(ComandoSQL);
            PrSt.setString(1, Fabricante);
            resultado = PrSt.executeQuery();
            QueryFabricante = ComandoSQL;
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

    }//GEN-LAST:event_BotonListarFabricanteActionPerformed

    private void BotonNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNombreActionPerformed
        try {
            PreparedStatement PrSt = null;
            ResultSet rs = null;
            if (QueryTodos != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryTodos + " ORDER BY Nombre ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                } else {
                    QueryTemporal = QueryTodos + " ORDER BY Nombre DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                }

            }
            if (QueryNombre != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryNombre + " ORDER BY Nombre ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Nombre);
                } else {
                    QueryTemporal = QueryNombre + " ORDER BY Nombre DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Nombre);
                }
            }
            if (QueryFabricante != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryFabricante + " ORDER BY Nombre ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Fabricante);
                } else {
                    QueryTemporal = QueryFabricante + " ORDER BY Nombre DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Fabricante);
                }
            }

            if (QueryCodigo != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryCodigo + " ORDER BY Nombre ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Codigo);
                } else {
                    QueryTemporal = QueryCodigo + " ORDER BY Nombre DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Codigo);
                }
            }

            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            rs = PrSt.executeQuery();
            ResultSetMetaData result = rs.getMetaData();
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

            while (rs.next()) {
                Object[] filas = new Object[Columnas];
                for (int i = 0; i < Columnas; i++) {
                    filas[i] = rs.getObject(i + 1);

                }
                modelo.addRow(filas);
            }
            PrSt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_BotonNombreActionPerformed

    private void BotonFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFabricanteActionPerformed
        try {
            PreparedStatement PrSt = null;
            ResultSet rs = null;
            if (QueryTodos != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryTodos + " ORDER BY Fabricante ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                } else {
                    QueryTemporal = QueryTodos + " ORDER BY Fabricante DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                }

            }
            if (QueryNombre != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryNombre + " ORDER BY Fabricante ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Nombre);
                } else {
                    QueryTemporal = QueryNombre + " ORDER BY Fabricante DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Nombre);
                }
            }
            if (QueryFabricante != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryFabricante + " ORDER BY Fabricante ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Fabricante);
                } else {
                    QueryTemporal = QueryFabricante + " ORDER BY Fabricante DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Fabricante);
                }
            }

            if (QueryCodigo != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryCodigo + " ORDER BY Fabricante ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Codigo);
                } else {
                    QueryTemporal = QueryCodigo + " ORDER BY Fabricante DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Codigo);
                }
            }

            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            rs = PrSt.executeQuery();
            ResultSetMetaData result = rs.getMetaData();
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

            while (rs.next()) {
                Object[] filas = new Object[Columnas];
                for (int i = 0; i < Columnas; i++) {
                    filas[i] = rs.getObject(i + 1);

                }
                modelo.addRow(filas);
            }
            PrSt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_BotonFabricanteActionPerformed

    private void BotonCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCodigoActionPerformed
        try {
            PreparedStatement PrSt = null;
            ResultSet rs = null;
            if (QueryTodos != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryTodos + " ORDER BY Codigo ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                } else {
                    QueryTemporal = QueryTodos + " ORDER BY Codigo DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                }

            }
            if (QueryNombre != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryNombre + " ORDER BY Codigo ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Nombre);
                } else {
                    QueryTemporal = QueryNombre + " ORDER BY Codigo DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Nombre);
                }
            }
            if (QueryFabricante != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryFabricante + " ORDER BY Codigo ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Fabricante);
                } else {
                    QueryTemporal = QueryFabricante + " ORDER BY Codigo DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Fabricante);
                }
            }

            if (QueryCodigo != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryCodigo + " ORDER BY Codigo ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Codigo);
                } else {
                    QueryTemporal = QueryCodigo + " ORDER BY Codigo DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Codigo);
                }
            }

            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            rs = PrSt.executeQuery();
            ResultSetMetaData result = rs.getMetaData();
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

            while (rs.next()) {
                Object[] filas = new Object[Columnas];
                for (int i = 0; i < Columnas; i++) {
                    filas[i] = rs.getObject(i + 1);

                }
                modelo.addRow(filas);
            }
            PrSt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_BotonCodigoActionPerformed

    private void BotonCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCantidadActionPerformed
        try {
            PreparedStatement PrSt = null;
            ResultSet rs = null;
            if (QueryTodos != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryTodos + " ORDER BY Cantidad ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                } else {
                    QueryTemporal = QueryTodos + " ORDER BY Cantidad DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                }

            }
            if (QueryNombre != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryNombre + " ORDER BY Cantidad ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Nombre);
                } else {
                    QueryTemporal = QueryNombre + " ORDER BY Cantidad DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Nombre);
                }
            }
            if (QueryFabricante != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryFabricante + " ORDER BY Cantidad ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Fabricante);
                } else {
                    QueryTemporal = QueryFabricante + " ORDER BY Cantidad DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Fabricante);
                }
            }

            if (QueryCodigo != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryCodigo + " ORDER BY Cantidad ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Codigo);
                } else {
                    QueryTemporal = QueryCodigo + " ORDER BY Cantidad DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Codigo);
                }
            }

            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            rs = PrSt.executeQuery();
            ResultSetMetaData result = rs.getMetaData();
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

            while (rs.next()) {
                Object[] filas = new Object[Columnas];
                for (int i = 0; i < Columnas; i++) {
                    filas[i] = rs.getObject(i + 1);

                }
                modelo.addRow(filas);
            }
            PrSt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_BotonCantidadActionPerformed

    private void BotonPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPrecioActionPerformed
        try {
            PreparedStatement PrSt = null;
            ResultSet rs = null;
            if (QueryTodos != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryTodos + " ORDER BY Precio ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                } else {
                    QueryTemporal = QueryTodos + " ORDER BY Precio DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                }

            }
            if (QueryNombre != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryNombre + " ORDER BY Precio ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Nombre);
                } else {
                    QueryTemporal = QueryNombre + " ORDER BY Precio DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Nombre);
                }
            }
            if (QueryFabricante != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryFabricante + " ORDER BY Precio ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Fabricante);
                } else {
                    QueryTemporal = QueryFabricante + " ORDER BY Precio DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Fabricante);
                }
            }

            if (QueryCodigo != null) {
                String QueryTemporal;
                int opcion = JOptionPane.showConfirmDialog(null, "SI = Ascendente | NO = Descendente");
                if (opcion == JOptionPane.YES_OPTION) {
                    QueryTemporal = QueryCodigo + " ORDER BY Precio ASC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Codigo);
                } else {
                    QueryTemporal = QueryCodigo + " ORDER BY Precio DESC";
                    PrSt = conexion.prepareStatement(QueryTemporal);
                    PrSt.setString(1, Codigo);
                }
            }

            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            rs = PrSt.executeQuery();
            ResultSetMetaData result = rs.getMetaData();
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

            while (rs.next()) {
                Object[] filas = new Object[Columnas];
                for (int i = 0; i < Columnas; i++) {
                    filas[i] = rs.getObject(i + 1);

                }
                modelo.addRow(filas);
            }
            PrSt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_BotonPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(Catalogo_Producto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogo_Producto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogo_Producto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogo_Producto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogo_Producto(conexion).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCantidad;
    private javax.swing.JButton BotonCodigo;
    private javax.swing.JButton BotonFabricante;
    private javax.swing.JButton BotonListar;
    private javax.swing.JButton BotonListarCodigo;
    private javax.swing.JButton BotonListarFabricante;
    private javax.swing.JButton BotonListarNombre;
    private javax.swing.JButton BotonNombre;
    private javax.swing.JButton BotonPrecio;
    private javax.swing.JTable Tabla1;
    private javax.swing.JTextField Texto1;
    private javax.swing.JTextField Texto2;
    private javax.swing.JTextField Texto3;
    private javax.swing.JTextField TextoCodigo;
    private javax.swing.JTextField TextoFabricante;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoSub;
    private javax.swing.JTextField Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField11;
    // End of variables declaration//GEN-END:variables
}
