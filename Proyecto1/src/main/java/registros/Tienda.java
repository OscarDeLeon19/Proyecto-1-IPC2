package registros;

import acciones.Entrega;
import acciones.Pedido;
import acciones.Reporte;
import acciones.Venta;
import informacion_empresa.Datos_Cliente;
import informacion_empresa.Datos_Empleado;
import informacion_empresa.Datos_Producto;
import informacion_empresa.Datos_Tiempo;
import informacion_empresa.Datos_Tienda;
import java.sql.Connection;

public class Tienda extends javax.swing.JFrame {

    private String Nombre;
    private String Direccion;
    private String Codigo;
    private String Telefono_1;
    private String Telefono_2;
    private String Correo;
    private String Horario;
    private Connection conexion;
    /**
     * Constructor de una Tienda
     * @param Nombre Nombre de la tienda
     * @param Direccion Direccion de la tienda
     * @param Codigo Codigo de la tienda
     * @param Telefono_1 Telefono de la tienda
     * @param Telefono_2 Segundo telefono de la tienda
     * @param Correo Correo de la tienda
     * @param Horario Horario de la tienda
     * @param conexion Conexion con la base de datos
     */
    public Tienda(String Nombre, String Direccion, String Codigo, String Telefono_1, String Telefono_2, String Correo, String Horario, Connection conexion) {
        initComponents();
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Codigo = Codigo;
        this.Telefono_1 = Telefono_1;
        this.Telefono_2 = Telefono_2;
        this.Correo = Correo;
        this.Horario = Horario;
        this.conexion = conexion;
        Titulo.setText(Nombre);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        BotonTiendas = new javax.swing.JButton();
        BotonEmpleados = new javax.swing.JButton();
        BotonClientes = new javax.swing.JButton();
        BotonProductos = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        BotonVentas = new javax.swing.JButton();
        BotonPedidos = new javax.swing.JButton();
        BotonEntregas = new javax.swing.JButton();
        BotonReportes = new javax.swing.JButton();
        BotonTiempo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz de la Tienda");

        Titulo.setEditable(false);

        jTextField1.setEditable(false);
        jTextField1.setText("Tienda:");

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Informacion de la empresa");

        BotonTiendas.setText("Tiendas");
        BotonTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTiendasActionPerformed(evt);
            }
        });

        BotonEmpleados.setText("Empleados");
        BotonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEmpleadosActionPerformed(evt);
            }
        });

        BotonClientes.setText("Clientes");
        BotonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClientesActionPerformed(evt);
            }
        });

        BotonProductos.setText("Productos");
        BotonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProductosActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Acciones a realizar ");

        BotonVentas.setText("Ventas");
        BotonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVentasActionPerformed(evt);
            }
        });

        BotonPedidos.setText("Pedidos");
        BotonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPedidosActionPerformed(evt);
            }
        });

        BotonEntregas.setText("Entregas");
        BotonEntregas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEntregasActionPerformed(evt);
            }
        });

        BotonReportes.setText("Reportes");
        BotonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReportesActionPerformed(evt);
            }
        });

        BotonTiempo.setText("Tiempo entre Tiendas");
        BotonTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTiempoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(BotonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BotonEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(BotonTiendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonTiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(BotonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(BotonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Crea un objeto Datos_Tienda
     * @param evt 
     */
    private void BotonTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTiendasActionPerformed
        Datos_Tienda tienda = new Datos_Tienda(conexion);
        tienda.Ejecutar();
    }//GEN-LAST:event_BotonTiendasActionPerformed
    /**
     * Crea un objeto Datos_Producto
     * @param evt 
     */
    private void BotonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProductosActionPerformed
        Datos_Producto producto = new Datos_Producto(conexion);
        producto.Ejecutar();
    }//GEN-LAST:event_BotonProductosActionPerformed
    /**
     * Crea un objeto Datos_Empleado
     * @param evt 
     */
    private void BotonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEmpleadosActionPerformed
        Datos_Empleado empleado = new Datos_Empleado(conexion);
        empleado.Ejecutar();
    }//GEN-LAST:event_BotonEmpleadosActionPerformed
    /**
     * Crea un objeto Datos_Cliente
     * @param evt 
     */
    private void BotonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClientesActionPerformed
        Datos_Cliente cliente = new Datos_Cliente(conexion);
        cliente.Ejecutar();
    }//GEN-LAST:event_BotonClientesActionPerformed
    /**
     * Crea un objeto DatosTiempo
     * @param evt 
     */
    private void BotonTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTiempoActionPerformed
        Datos_Tiempo Tiempo = new Datos_Tiempo(conexion, Codigo);
        Tiempo.Ejecutar();
    }//GEN-LAST:event_BotonTiempoActionPerformed
    /**
     * Crea un objeto Venta
     * @param evt 
     */
    private void BotonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVentasActionPerformed
        Venta venta = new Venta(conexion, Codigo);
        venta.Ejecutar();
        
    }//GEN-LAST:event_BotonVentasActionPerformed
    /**
     * Crea un objeto de tipo Pedido
     * @param evt 
     */
    private void BotonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPedidosActionPerformed
        Pedido pedido = new Pedido(conexion, Codigo);
        pedido.Ejecutar();
    }//GEN-LAST:event_BotonPedidosActionPerformed
    /**
     * Crea un objeto de tipo Entrega
     * @param evt 
     */
    private void BotonEntregasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEntregasActionPerformed
        Entrega entrega = new Entrega(conexion,Codigo);
        entrega.Ejecutar();
    }//GEN-LAST:event_BotonEntregasActionPerformed
    /**
     * Crea un objeto de tipo Reporte
     * @param evt 
     */
    private void BotonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReportesActionPerformed
        Reporte reporte = new Reporte(conexion, Codigo);
        reporte.Ejecutar();
    }//GEN-LAST:event_BotonReportesActionPerformed
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
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tienda(Nombre, Direccion, Codigo, Telefono_1, Telefono_2, Correo, Horario, conexion).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonClientes;
    private javax.swing.JButton BotonEmpleados;
    private javax.swing.JButton BotonEntregas;
    private javax.swing.JButton BotonPedidos;
    private javax.swing.JButton BotonProductos;
    private javax.swing.JButton BotonReportes;
    private javax.swing.JButton BotonTiempo;
    private javax.swing.JButton BotonTiendas;
    private javax.swing.JButton BotonVentas;
    private javax.swing.JTextField Titulo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
