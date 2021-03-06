package ventanas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class CargarArchivo extends javax.swing.JFrame {

    private File fichero;
    private String Fallo[] = new String[100];
    private int fallos;
    private Connection conexion;

    /**
     * Constructor de la Clase Cargar Archivo
     *
     * @param conexion La conexion con la base de datos
     */
    public CargarArchivo(Connection conexion) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.conexion = conexion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        BotonAbrir = new javax.swing.JButton();
        BotonCargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Area1.setColumns(20);
        Area1.setForeground(new java.awt.Color(17, 9, 9));
        Area1.setRows(5);
        Area1.setEnabled(false);
        jScrollPane1.setViewportView(Area1);

        BotonAbrir.setForeground(new java.awt.Color(10, 3, 3));
        BotonAbrir.setText("Abrir");
        BotonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbrirActionPerformed(evt);
            }
        });

        BotonCargar.setForeground(new java.awt.Color(21, 9, 9));
        BotonCargar.setText("Cargar Datos");
        BotonCargar.setEnabled(false);
        BotonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(BotonAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(BotonCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodo para buscar un archivo de texto dentro de la computadora
     *
     * @param evt
     */
    private void BotonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbrirActionPerformed
        Area1.setText("");
        JFileChooser seleccionar = new JFileChooser();
        seleccionar.showOpenDialog(null);
        fichero = seleccionar.getSelectedFile();
        if (fichero.getName().endsWith("txt")) {
            try {
                FileReader Lector = new FileReader(fichero);
                BufferedReader bufer = new BufferedReader(Lector);
                String linea = "";

                while ((linea = bufer.readLine()) != null) {
                    Area1.append(linea);
                    Area1.append("\n");
                }
                BotonCargar.setEnabled(true);

            } catch (Exception e) {
                Area1.setText("No se encontro el archivo");
                BotonCargar.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Archivo incorrecto");
        }
    }//GEN-LAST:event_BotonAbrirActionPerformed
    /**
     * Carga los archivos elejidos a el Area de Texto y lee linea por linea.
     * Si la linea tiene un registro valido el metodo lee a que tabla debe agregar el registro.
     * @param evt 
     */
    private void BotonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargarActionPerformed
        fallos = 0;
        try {
            FileReader Lector = new FileReader(fichero);
            BufferedReader bufer = new BufferedReader(Lector);
            String linea = "";

            while ((linea = bufer.readLine()) != null) {
                int Comas[] = new int[15];
                int x = 0;
                for (int i = 0; i < linea.length() - 1; i++) {
                    int j = i + 1;
                    if (",".equals(linea.substring(i, j))) {
                        Comas[x] = i;
                        x++;
                    }
                }

                if ("TIENDA".equals(linea.substring(0, Comas[0])) && !(x >= 5)) {
                    AgregarTienda(linea, Comas);
                } else if ("TIEMPO".equals(linea.substring(0, Comas[0])) && !(x >= 4)) {
                    AgregarTiempo(linea, Comas);
                } else if ("PRODUCTO".equals(linea.substring(0, Comas[0])) && !(x >= 7)) {
                    AgregarProducto(linea, Comas);
                } else if ("EMPLEADO".equals(linea.substring(0, Comas[0])) && !(x >= 5)) {
                    AgregarEmpleado(linea, Comas);
                } else if ("CLIENTE".equals(linea.substring(0, Comas[0])) && !(x >= 5)) {
                    AgregarCliente(linea, Comas);
                } else if ("PEDIDO".equals(linea.substring(0, Comas[0])) && !(x >= 10)) {
                    AgregarPedido(linea, Comas);
                } else {
                    Fallo[fallos] = linea;
                    fallos++;
                }
            }
            Area1.setText(null);
            Area1.append("Se ha finalizado de agregar los registros");
            Area1.append("\n");
            Area1.append("\n");
            Area1.append("Registros ignorados:");
            Area1.append("\n");
            for (int i = 0; i < fallos; i++) {
                Area1.append(Fallo[i]);
                Area1.append("\n");
            }
            BotonCargar.setEnabled(false);
            BotonAbrir.setEnabled(false);
        } catch (Exception e) {
            Area1.setText("No se encontro el archivo");
        }
    }//GEN-LAST:event_BotonCargarActionPerformed
    /**
     * Inserta un registro de tienda a la base de datos
     * @param Linea La linea de registro del archivo de texto
     * @param Comas Arreglo que guarda la separacion entre cada parte del registro
     */
    private void AgregarTienda(String Linea, int Comas[]) {
        
        try {
            PreparedStatement ps;
            ps = conexion.prepareStatement("INSERT INTO Tienda (Nombre, Direccion, Codigo, Telefono_1, Telefono_2, Correo, Horario) VALUES(?,?,?,?,?,?,?) ");
            ps.setString(1, Linea.substring(Comas[0] + 1, Comas[1]));
            ps.setString(2, Linea.substring(Comas[1] + 1, Comas[2]));
            ps.setString(3, Linea.substring(Comas[2] + 1, Comas[3]));
            ps.setString(4, Linea.substring(Comas[3] + 1, Linea.length()));
            ps.setString(5, null);
            ps.setString(6, null);
            ps.setString(7, null);
            int res = ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Fallo[fallos] = Linea;
            fallos++;
        }
    }
    /**
     * Agrega un registro de tiempo a la base de datos.
     * @param Linea La linea de registro del archivo de texto
     * @param Comas Arreglo que guarda la separacion entre cada parte del registro
     */
    private void AgregarTiempo(String Linea, int Comas[]) {

        try {
            PreparedStatement ps;
            ps = conexion.prepareStatement("INSERT INTO Tiempo (Codigo_Tienda1, Codigo_Tienda2, Tiempo) VALUES(?,?,?) ");
            ps.setString(1, Linea.substring(Comas[0] + 1, Comas[1]));
            ps.setString(2, Linea.substring(Comas[1] + 1, Comas[2]));
            ps.setInt(3, Integer.parseInt(Linea.substring(Comas[2] + 1, Linea.length())));
            int res = ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Fallo[fallos] = Linea;
            fallos++;
        }

    }
    /**
     * Agrega un registro de producto a la base de datos
     * @param Linea La linea de registro del archivo de texto
     * @param Comas Arreglo que guarda la separacion entre cada parte del registro
     */
    private void AgregarProducto(String Linea, int Comas[]) {
        try {
            PreparedStatement ps;
            ps = conexion.prepareStatement("INSERT INTO Producto (Nombre, Fabricante, Codigo, Cantidad, Precio, Codigo_Tienda, Descripcion, Garantia) VALUES(?,?,?,?,?,?,?,?) ");
            ps.setString(1, Linea.substring(Comas[0] + 1, Comas[1]));
            ps.setString(2, Linea.substring(Comas[1] + 1, Comas[2]));
            ps.setString(3, Linea.substring(Comas[2] + 1, Comas[3]));
            ps.setInt(4, Integer.parseInt(Linea.substring(Comas[3] + 1, Comas[4])));
            ps.setDouble(5, Double.parseDouble(Linea.substring(Comas[4] + 1, Comas[5])));
            ps.setString(6, Linea.substring(Comas[5] + 1, Linea.length()));
            ps.setString(7, null);
            ps.setString(8, null);
            int res = ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Fallo[fallos] = Linea;
            fallos++;
        }

    }
    /**
     * Agrega un registro de empleado a la base de datos
     * @param Linea La linea de registro del archivo de texto
     * @param Comas Arreglo que guarda la separacion entre cada parte del registro
     */
    private void AgregarEmpleado(String Linea, int Comas[]) {

        try {
            PreparedStatement ps;
            ps = (PreparedStatement) conexion.prepareStatement("INSERT INTO Empleado (Codigo_Empleado, Nombre, Telefono, NIT, DPI, Correo, Direccion) VALUES(?,?,?,?,?,?,?) ");
            ps.setString(1, Linea.substring(Comas[1] + 1, Comas[2]));
            ps.setString(2, Linea.substring(Comas[0] + 1, Comas[1]));
            ps.setString(3, Linea.substring(Comas[2] + 1, Comas[3]));
            ps.setString(4, null);
            ps.setString(5, Linea.substring(Comas[3] + 1, Linea.length()));
            ps.setString(6, null);
            ps.setString(7, null);
            int res = ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Fallo[fallos] = Linea;
            fallos++;
        }
    }
    /**
     * Agrega un registro de cliente a la base de datos
     * @param Linea La linea de registro del archivo de texto
     * @param Comas Arreglo que guarda la separacion entre cada parte del registro
     */
    private void AgregarCliente(String Linea, int Comas[]) {

        try {
            PreparedStatement ps;
            ps = conexion.prepareStatement("INSERT INTO Cliente (Nombre, Telefono, NIT, DPI, Credito, Correo, Direccion) VALUES(?,?,?,?,?,?,?) ");
            ps.setString(1, Linea.substring(Comas[0] + 1, Comas[1]));
            ps.setString(2, Linea.substring(Comas[2] + 1, Comas[3]));
            ps.setString(3, Linea.substring(Comas[1] + 1, Comas[2]));
            ps.setString(4, null);
            ps.setString(5, Linea.substring(Comas[3] + 1, Linea.length()));
            ps.setString(6, null);
            ps.setString(7, null);
            int res = ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Fallo[fallos] = Linea;
            fallos++;
        }

    }
    /**
     * Agrega un registro de Pedido a la base de datos
     * @param Linea La linea de registro del archivo de texto
     * @param Comas Arreglo que guarda la separacion entre cada parte del registro
     */
    private void AgregarPedido(String Linea, int Comas[]) {

        try {
            PreparedStatement ps;
            ps = conexion.prepareStatement("INSERT INTO Pedido (Codigo_Pedido, Codigo_Tienda1, Codigo_Tienda2, Fecha, NIT_Cliente, Codigo_Producto, Cantidad, Total, Anticipo) VALUES(?,?,?,?,?,?,?,?,?) ");
            ps.setString(1, Linea.substring(Comas[0] + 1, Comas[1]));
            ps.setString(2, Linea.substring(Comas[1] + 1, Comas[2]));
            ps.setString(3, Linea.substring(Comas[2] + 1, Comas[3]));
            ps.setDate(4, Date.valueOf(Linea.substring(Comas[3] + 1, Comas[4])));
            ps.setString(5, Linea.substring(Comas[4] + 1, Comas[5]));
            ps.setString(6, Linea.substring(Comas[5] + 1, Comas[6]));
            ps.setInt(7, Integer.parseInt(Linea.substring(Comas[6] + 1, Comas[7])));
            ps.setDouble(8, Double.parseDouble(Linea.substring(Comas[7] + 1, Comas[8])));
            ps.setDouble(9, Double.parseDouble(Linea.substring(Comas[8] + 1, Linea.length())));
            int res = ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Fallo[fallos] = Linea;
            fallos++;
        }

    }
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
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarArchivo(conexion).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JButton BotonAbrir;
    private javax.swing.JButton BotonCargar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
