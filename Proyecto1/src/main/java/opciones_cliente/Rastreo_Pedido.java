package opciones_cliente;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Rastreo_Pedido extends javax.swing.JFrame {

    private int ID_Pedido;
    private Connection conexion;
    private Date FechaIngresada;
    private String FechaIngresada1;
    /**
     * Inicializa un objeto de tipo RastreoProducto
     * @param conexion La conexion con la base de datos
     */
    public Rastreo_Pedido(Connection conexion) {
        initComponents();
        this.conexion = conexion;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        Texto0 = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        Texto1 = new javax.swing.JTextField();
        Texto2 = new javax.swing.JTextField();
        Texto3 = new javax.swing.JTextField();
        Texto4 = new javax.swing.JTextField();
        Texto5 = new javax.swing.JTextField();
        Texto7 = new javax.swing.JTextField();
        Texto6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Rastreo de Pedidos");

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Ingresa el ID del pedido");

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Dias restantes ");

        jTextField5.setEditable(false);
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Producto");

        jTextField6.setEditable(false);
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Cantidad de productos");

        jTextField7.setEditable(false);
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Anticipo realizado");

        jTextField8.setEditable(false);
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("Pago restante ");

        jTextField9.setEditable(false);
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Tienda Origen");

        jTextField10.setEditable(false);
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Tienda donde debe recojerse");

        Texto1.setEditable(false);

        Texto2.setEditable(false);

        Texto3.setEditable(false);

        Texto4.setEditable(false);

        Texto5.setEditable(false);

        Texto7.setEditable(false);

        Texto6.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Texto0, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Texto2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Texto3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Texto4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Texto5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Texto6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Texto7, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(161, 161, 161)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Este boton llama a todos los metodos para la busqueda de un pedido
     * Comienza pidiendo la fecha para comprobar que es valida.
     * Busca el producto con la base de datos de acuerdo a su ID
     * Al buscarlo agrega los parametros requeridos a las cajas de texto
     * @param evt 
     */
    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        Limpiar();
        try {

            String Fecha1 = JOptionPane.showInputDialog("Ingresa la fecha: (AAAA-MM-DD)");
            boolean comprobacion = ComprobarFecha(Fecha1);
            if (comprobacion == true) {
                ID_Pedido = Integer.parseInt(Texto0.getText());
                PreparedStatement PrSt;
                ResultSet resultado = null;
                PrSt = conexion.prepareStatement("SELECT * FROM Pedido WHERE ID_Pedido = ? AND Estado IS NULL");
                PrSt.setInt(1, ID_Pedido);
                resultado = PrSt.executeQuery();

                if (resultado.next()) {
                    int Dias = ObtenerTiempo(resultado.getString("Codigo_Tienda1"), resultado.getString("Codigo_Tienda2"));
                    boolean DiasRestantes = EncontrarDias(resultado.getString("Fecha"), Dias);
                    if (DiasRestantes == true) {
                        ObtenerProducto();
                        Texto3.setText(resultado.getString("Cantidad"));
                        Texto4.setText(resultado.getString("Anticipo"));
                        double Pago = resultado.getDouble("Total") - resultado.getDouble("Anticipo");
                        Texto5.setText(String.valueOf(Pago));
                        String TiendaOrigen = ObtenerTienda(resultado.getString("Codigo_Tienda1"));
                        String TiendaDestino = ObtenerTienda(resultado.getString("Codigo_Tienda2"));
                        Texto6.setText(TiendaOrigen);
                        Texto7.setText(TiendaDestino);
                    } else {
                        System.out.println("Fallo");
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "No existe el pedido");
                }
                PrSt.close();
                resultado.close();
            } else {
                JOptionPane.showMessageDialog(null, "No hubo fecha para comprobar");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed
    /**
     * Limpia las cajas de texto
     */
    public void Limpiar() {
        Texto1.setText(null);
        Texto2.setText(null);
        Texto3.setText(null);
        Texto4.setText(null);
        Texto5.setText(null);
        Texto6.setText(null);
        Texto7.setText(null);
    }
    /**
     * Obtiene el tiempo entre las tiendas en la que se realizo el pedido
     * @param TiendaO La tienda origen
     * @param TiendaD La tienda donde se debe recojer el pedido
     * @return El tiempo que tarda en llegar el pedido
     */
    public int ObtenerTiempo(String TiendaO, String TiendaD) {
        int Dias = 0;
        try {
            PreparedStatement PrSt;
            ResultSet resultado1 = null;
            ResultSet resultado2 = null;
            String SQLQuery = "SELECT * FROM Tiempo WHERE Codigo_Tienda1 = ? AND Codigo_Tienda2 = ?";
            PrSt = conexion.prepareStatement(SQLQuery);
            PrSt.setString(1, TiendaO);
            PrSt.setString(2, TiendaD);
            resultado1 = PrSt.executeQuery();
            if (resultado1.next()) {
                Dias = resultado1.getInt("Tiempo");
            } else {
                String SQLQuery2 = "SELECT * FROM Tiempo WHERE Codigo_Tienda1 = ? AND Codigo_Tienda2 = ?";
                PrSt = conexion.prepareStatement(SQLQuery);
                PrSt.setString(1, TiendaD);
                PrSt.setString(2, TiendaO);
                resultado2 = PrSt.executeQuery();
                if (resultado2.next()) {
                    Dias = resultado2.getInt("Tiempo");
                } else {
                    JOptionPane.showMessageDialog(null, "No hay un tiempo estipulado");
                    Dias = 0;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return Dias;
    }
    /**
     * Comprueba que la fecha ingresada sea valida
     * @param Fecha La fecha ingresada
     * @return Si la fecha es valida o no
     */
    public boolean ComprobarFecha(String Fecha) {
        boolean comprobar = false;
        try {
            boolean regreso = false;
            int Guion[] = new int[2];
            int x = 0;
            for (int i = 0; i < Fecha.length(); i++) {
                int j = i + 1;
                if ("-".equals(Fecha.substring(i, j))) {
                    Guion[x] = i;
                    x++;
                }
            }
            int Año = Integer.parseInt(Fecha.substring(0, Guion[0]));
            int Mes = Integer.parseInt(Fecha.substring(Guion[0] + 1, Guion[1]));
            int Dia = Integer.parseInt(Fecha.substring(Guion[1] + 1, Fecha.length()));
            FechaIngresada = new java.sql.Date(Año - 1900, Mes - 1, Dia);
            FechaIngresada1 = Fecha;
            comprobar = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Fecha Erronea");
            comprobar = false;
        }
        return comprobar;
    }
    /**
     * Calcula cuandos dias faltan para que llegue el pedido a la tienda.
     * @param Fecha La fecha en la que se hizo el pedido
     * @param dias Los dias que dura la llegada de el pedido
     * @return Si se encontro los dias o no
     */
    public boolean EncontrarDias(String Fecha, int dias) {
        boolean regreso = false;
        int Guion[] = new int[2];
        int x = 0;
        for (int i = 0; i < Fecha.length(); i++) {
            int j = i + 1;
            if ("-".equals(Fecha.substring(i, j))) {
                Guion[x] = i;
                x++;
            }
        }
        int Año = Integer.parseInt(Fecha.substring(0, Guion[0]));
        int Mes = Integer.parseInt(Fecha.substring(Guion[0] + 1, Guion[1]));
        int Dia = Integer.parseInt(Fecha.substring(Guion[1] + 1, Fecha.length()));
        java.sql.Date FechaInicial = new java.sql.Date(Año - 1900, Mes - 1, Dia);

        Dia = Dia + dias;
        if (Dia > 30) {
            Dia = Dia - 30;
            Mes++;
            if (Mes > 12) {
                Mes = 1;
                Año++;
            }
        }
        java.sql.Date FechaPrevista = new java.sql.Date(Año - 1900, Mes - 1, Dia);
        if (FechaIngresada.before(FechaInicial)) {
            JOptionPane.showMessageDialog(null, "La fecha ingresada es anterior a la del pedido");
            regreso = false;
        } else {
            if (FechaIngresada.after(FechaPrevista)) {
                Texto1.setText("Atrasado");
                regreso = true;
            } else {
                int Año1 = Integer.parseInt(FechaIngresada1.substring(0, Guion[0]));
                int Mes1 = Integer.parseInt(FechaIngresada1.substring(Guion[0] + 1, Guion[1]));
                int Dia1 = Integer.parseInt(FechaIngresada1.substring(Guion[1] + 1, Fecha.length()));

                int DiasRestantes = 0;
                if (Dia1 > Dia) {
                    DiasRestantes = Dia - Dia1;
                    DiasRestantes = 30 + DiasRestantes;
                } else {
                    DiasRestantes = Dia - Dia1;
                }

                if (DiasRestantes == 0) {
                    Texto1.setText("En Tienda");
                } else {
                    Texto1.setText(String.valueOf(DiasRestantes));
                }
                regreso = true;
            }
        }
        return regreso;
    }
    /**
     * Obtiene el nombre de el producto que viene en el pedido
     */
    public void ObtenerProducto() {
        try {
            String Query = "SELECT Producto.Nombre FROM Pedido INNER JOIN Producto ON Pedido.Codigo_Producto = Producto.Codigo and ID_Pedido = ? LIMIT 1";
            PreparedStatement PrSt;
            ResultSet Rs;
            PrSt = conexion.prepareStatement(Query);
            PrSt.setInt(1, ID_Pedido);
            Rs = PrSt.executeQuery();
            if (Rs.next()) {
                Texto2.setText(Rs.getString("Nombre"));
            }
            PrSt.close();
            Rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    /**
     * Obtiene el nombre de la tienda segun su codigo
     * @param CodigoTienda El codigo de la tienda 
     * @return El nombre de la tienda
     */
    public String ObtenerTienda(String CodigoTienda) {
        String NombreTienda = null;
        try {
            String Query = "SELECT * FROM Tienda WHERE Codigo = ?";
            PreparedStatement PrSt;
            ResultSet Rs;
            PrSt = conexion.prepareStatement(Query);
            PrSt.setString(1, CodigoTienda);
            Rs = PrSt.executeQuery();
            if (Rs.next()) {
                NombreTienda = Rs.getString("Nombre");
            }
            PrSt.close();
            Rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return NombreTienda;

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
            java.util.logging.Logger.getLogger(Rastreo_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rastreo_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rastreo_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rastreo_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rastreo_Pedido(conexion).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JTextField Texto0;
    private javax.swing.JTextField Texto1;
    private javax.swing.JTextField Texto2;
    private javax.swing.JTextField Texto3;
    private javax.swing.JTextField Texto4;
    private javax.swing.JTextField Texto5;
    private javax.swing.JTextField Texto6;
    private javax.swing.JTextField Texto7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
