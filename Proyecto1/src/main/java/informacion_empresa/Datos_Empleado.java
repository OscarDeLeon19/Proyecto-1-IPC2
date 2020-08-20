package informacion_empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.Conexion;

public class Datos_Empleado extends javax.swing.JFrame {

    private Connection conexion;

    public Datos_Empleado(Connection conexion) {
        initComponents();
        this.conexion = conexion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JTextField();
        TextoNombre = new javax.swing.JTextField();
        TextoDireccion = new javax.swing.JTextField();
        TextoCodigo = new javax.swing.JTextField();
        TextoTel1 = new javax.swing.JTextField();
        TextoNIT = new javax.swing.JTextField();
        TextoDPI = new javax.swing.JTextField();
        TextoCorreo = new javax.swing.JTextField();
        Texto1 = new javax.swing.JTextField();
        Texto3 = new javax.swing.JTextField();
        Texto4 = new javax.swing.JTextField();
        Texto5 = new javax.swing.JTextField();
        Texto6 = new javax.swing.JTextField();
        Texto2 = new javax.swing.JTextField();
        Texto7 = new javax.swing.JTextField();
        BotonListarCodigo = new javax.swing.JButton();
        BotonListarNombre = new javax.swing.JButton();
        BotonListar = new javax.swing.JButton();
        BotonIngresar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        TextoAcciones = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        BotonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informacion");

        Titulo.setEditable(false);
        Titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo.setText("Informacion sobre los empleados");

        TextoNombre.setEditable(false);
        TextoNombre.setForeground(new java.awt.Color(14, 7, 7));
        TextoNombre.setText("Nombre");

        TextoDireccion.setEditable(false);
        TextoDireccion.setText("Direcion");

        TextoCodigo.setEditable(false);
        TextoCodigo.setText("Codigo");

        TextoTel1.setEditable(false);
        TextoTel1.setText("Telefono");

        TextoNIT.setEditable(false);
        TextoNIT.setText("NIT");

        TextoDPI.setEditable(false);
        TextoDPI.setText("DPI");

        TextoCorreo.setEditable(false);
        TextoCorreo.setText("Correo");

        BotonListarCodigo.setText("Listar");
        BotonListarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarCodigoActionPerformed(evt);
            }
        });

        BotonListarNombre.setText("Listar");
        BotonListarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarNombreActionPerformed(evt);
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

        TextoAcciones.setEditable(false);
        TextoAcciones.setForeground(new java.awt.Color(14, 7, 7));
        TextoAcciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoAcciones.setText("Acciones");

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo_Empleado", "Nombre", "Telefono", "NIT", "DPI", "Correo", "Direccion"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextoDireccion)
                    .addComponent(TextoDPI)
                    .addComponent(TextoCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoNIT)
                    .addComponent(TextoNombre)
                    .addComponent(TextoTel1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(TextoCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonListarCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Texto6, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto7, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonListarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(TextoAcciones)
                            .addComponent(BotonListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(BotonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(41, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonListarCodigo)
                    .addComponent(TextoAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonListar)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonListarNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonIngresar)
                    .addComponent(TextoTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonModificar)
                    .addComponent(TextoNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonLimpiar)
                    .addComponent(TextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarActionPerformed
        try {

            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Empleado ORDER BY Codigo_Empleado ASC";

            PrSt = conexion.prepareStatement(ComandoSQL);
            resultado = PrSt.executeQuery();

            ResultSetMetaData result = resultado.getMetaData();
            int Columnas = result.getColumnCount();

            modelo.addColumn("Codigo_Empleado");
            modelo.addColumn("Nombre");
            modelo.addColumn("Telefono");
            modelo.addColumn("NIT");
            modelo.addColumn("DPI");
            modelo.addColumn("Correo");
            modelo.addColumn("Direccion");

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

    private void BotonListarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarCodigoActionPerformed
        try {
            String Codigo = Texto1.getText();
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Empleado WHERE Codigo_Empleado = ? ORDER BY Codigo_Empleado ASC";

            PrSt = conexion.prepareStatement(ComandoSQL);
            PrSt.setString(1, Codigo);
            resultado = PrSt.executeQuery();

            ResultSetMetaData result = resultado.getMetaData();
            int Columnas = result.getColumnCount();

            modelo.addColumn("Codigo_Empleado");
            modelo.addColumn("Nombre");
            modelo.addColumn("Telefono");
            modelo.addColumn("NIT");
            modelo.addColumn("DPI");
            modelo.addColumn("Correo");
            modelo.addColumn("Direccion");

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

    private void BotonListarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarNombreActionPerformed
        try {
            String Nombre = Texto2.getText();
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Empleado WHERE Nombre = ? ORDER BY Codigo_Empleado ASC";

            PrSt = conexion.prepareStatement(ComandoSQL);
            PrSt.setString(1, Nombre);
            resultado = PrSt.executeQuery();

            ResultSetMetaData result = resultado.getMetaData();
            int Columnas = result.getColumnCount();

            modelo.addColumn("Codigo_Empleado");
            modelo.addColumn("Nombre");
            modelo.addColumn("Telefono");
            modelo.addColumn("NIT");
            modelo.addColumn("DPI");
            modelo.addColumn("Correo");
            modelo.addColumn("Direccion");

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

    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked

        try {
            PreparedStatement PrSt;
            ResultSet resultado = null;
            int Fila = Tabla1.getSelectedRow();
            String Codigo = Tabla1.getValueAt(Fila, 0).toString();
            PrSt = conexion.prepareStatement("SELECT * FROM Empleado WHERE Codigo_Empleado = ?");
            PrSt.setString(1, Codigo);
            resultado = PrSt.executeQuery();

            while (resultado.next()) {
                Texto1.setText(resultado.getString("Codigo_Empleado"));
                Texto2.setText(resultado.getString("Nombre"));
                Texto3.setText(resultado.getString("Telefono"));
                Texto4.setText(resultado.getString("NIT"));
                Texto5.setText(resultado.getString("DPI"));
                Texto6.setText(resultado.getString("Correo"));
                Texto7.setText(resultado.getString("Direccion"));
            }
            PrSt.close();
            resultado.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Tabla1MouseClicked

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        
        String Codigo_Empleado = Texto1.getText();
        String Nombre = Texto2.getText();
        String Telefono = Texto3.getText();
        String NIT = Texto4.getText();
        String DPI = Texto5.getText();
        String Correo = Texto6.getText();
        String Direccion = Texto7.getText();

        if ("".equals(Codigo_Empleado)) {
            Codigo_Empleado = null;
        }
        if ("".equals(Nombre)) {
            Nombre = null;
        }
        if ("".equals(Telefono)) {
            Telefono = null;
        }
        if ("".equals(NIT)) {
            NIT = null;
        }
        if ("".equals(DPI)) {
            DPI = null;
        }
        if ("".equals(Correo)) {
            Correo = null;
        }
        if ("".equals(Direccion)) {
            Direccion = null;
        }
        try {
            PreparedStatement PrSt;
            String SQLQuery = "INSERT INTO Empleado (Codigo_Empleado, Nombre, Telefono, NIT, DPI, Correo, Direccion) VALUES(?,?,?,?,?,?,?)";
            PrSt = conexion.prepareStatement(SQLQuery);
            PrSt.setString(1, Codigo_Empleado);
            PrSt.setString(2, Nombre);
            PrSt.setString(3, Telefono);
            PrSt.setString(4, NIT);
            PrSt.setString(5, DPI);
            PrSt.setString(6, Correo);
            PrSt.setString(7, Direccion);

            int resultado = PrSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informacion Ingresada");
            PrSt.close();
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
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        
        String Codigo_Empleado = Texto1.getText();
        String Nombre = Texto2.getText();
        String Telefono = Texto3.getText();
        String NIT = Texto4.getText();
        String DPI = Texto5.getText();
        String Correo = Texto6.getText();
        String Direccion = Texto7.getText();

        if ("".equals(Codigo_Empleado)) {
            Codigo_Empleado = null;
        }
        if ("".equals(Nombre)) {
            Nombre = null;
        }
        if ("".equals(Telefono)) {
            Telefono = null;
        }
        if ("".equals(NIT)) {
            NIT = null;
        }
        if ("".equals(DPI)) {
            DPI = null;
        }
        if ("".equals(Correo)) {
            Correo = null;
        }
        if ("".equals(Direccion)) {
            Direccion = null;
        }
        try {
            PreparedStatement PrSt;
            String SQLQuery = "UPDATE Empleado SET Nombre =?, Telefono =?, NIT =?, DPI =?, Correo =?, Direccion =? WHERE Codigo_Empleado =?";
            PrSt = conexion.prepareStatement(SQLQuery);
            PrSt.setString(1, Nombre);
            PrSt.setString(2, Telefono);
            PrSt.setString(3, NIT);
            PrSt.setString(4, DPI);
            PrSt.setString(5, Correo);
            PrSt.setString(6, Direccion);
            PrSt.setString(7, Codigo_Empleado);

            int resultado = PrSt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Informacion Modificada");
                Texto1.setText(null);
                Texto2.setText(null);
                Texto3.setText(null);
                Texto4.setText(null);
                Texto5.setText(null);
                Texto6.setText(null);
                Texto7.setText(null);
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
            String SQLQuery = "DELETE FROM Empleado WHERE Codigo_Empleado = ?";
            PrSt = conexion.prepareStatement(SQLQuery);

            PrSt.setString(1, Texto1.getText());

            int resultado = PrSt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Informacion Eliminada");
                Texto1.setText(null);
                Texto2.setText(null);
                Texto3.setText(null);
                Texto4.setText(null);
                Texto5.setText(null);
                Texto6.setText(null);
                Texto7.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "Fallo al Eliminar");
            }
            PrSt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Datos_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos_Empleado(conexion).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonListar;
    private javax.swing.JButton BotonListarCodigo;
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
    private javax.swing.JTextField TextoAcciones;
    private javax.swing.JTextField TextoCodigo;
    private javax.swing.JTextField TextoCorreo;
    private javax.swing.JTextField TextoDPI;
    private javax.swing.JTextField TextoDireccion;
    private javax.swing.JTextField TextoNIT;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoTel1;
    private javax.swing.JTextField Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
