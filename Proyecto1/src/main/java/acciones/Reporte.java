package acciones;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import principal.Exportacion;

public class Reporte extends javax.swing.JFrame {

    private Connection conexion;
    private String TiendaActual;
    private Date FechaTemporal;
    private Date FechaIngresada;
    private Date FechaEntrada;
    /**
     * Inicia un objeto de tipo Reporte
     * @param conexion La conexion con la base de datos
     * @param TiendaActual La tienda donde estamos ubicados
     */
    public Reporte(Connection conexion, String TiendaActual) {
        initComponents();
        this.conexion = conexion;
        this.TiendaActual = TiendaActual;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        BotonExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informacion");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Generacion de Reportes");

        Boton1.setText("Lista de todos los pedidos que llegaran a la tienda");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setText("Listado de pedidos que están en tiempo de estar en la tienda pero debe verificarse su ingreso");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton3.setText("Listado de todos los pedidos atrasados que llegarán a la tienda");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        Boton4.setText("Listado de todos los pedidos que salieron de la tienda y están en tránsito");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        Boton5.setText("Listado de todas las compras realizadas por un cliente");
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });

        Boton6.setText("Listado de todos los pedidos en curso de un cliente");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });

        Boton7.setText("Listado de los diez productos más vendidos en un intervalo de tiempo");
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });

        Boton8.setText("Listado de los productos más vendidos por tienda en un intervalo de tiempo");
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });

        Boton9.setText("Listado de productos que nunca se han vendido por tienda");
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });

        Area1.setEditable(false);
        Area1.setColumns(20);
        Area1.setRows(5);
        jScrollPane1.setViewportView(Area1);

        BotonExportar.setText("Exportar Reporte");
        BotonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton2)
                            .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(BotonExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BotonExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Lista todos los pedidos que llegaran a la tienda
     * @param evt 
     */
    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        try {
            Area1.setText(null);
            Area1.append("| Pedido | ID_Pedido | Codigo_Pedido | Codigo_Tienda1 | Codigo_Tienda2 | Fecha | NIT_Cliente | Cantidad | Total | Anticipo | Credito |<br>");
            Area1.append("\n");
            PreparedStatement PrSt;
            ResultSet rs;
            String Query = "SELECT * FROM Pedido WHERE Codigo_Tienda2 = ? AND Estado IS NULL";
            PrSt = conexion.prepareStatement(Query);
            PrSt.setString(1, TiendaActual);
            rs = PrSt.executeQuery();

            while (rs.next()) {
                String ID = rs.getString("ID_Pedido");
                String Pedido = rs.getString("Codigo_Pedido");
                String Tienda1 = rs.getString("Codigo_Tienda1");
                String Tienda2 = rs.getString("Codigo_Tienda2");
                String Fecha = rs.getString("Fecha");
                String NIT = rs.getString("NIT_Cliente");
                String Cantidad = rs.getString("Cantidad");
                String Total = rs.getString("Total");
                String Anticipo = rs.getString("Anticipo");
                String Credito = rs.getString("Credito");

                String Cadena = "| Pedido | " + ID + " | " + Pedido + " | " + Tienda1 + " | " + Tienda2 + " | " + Fecha + " | " + NIT + " | " + Cantidad + " | " + Total + " | " + Anticipo + " | " + Credito + " |<br>";
                Area1.append(Cadena);
                Area1.append("\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Boton1ActionPerformed
    /**
     * Lista todos los pedidos que estan a tiempo de llegar a la tienda
     * En base a la fecha muestra resultados
     * @param evt 
     */
    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed

        try {

            String Fecha1 = JOptionPane.showInputDialog("Ingresa la fecha");
            FechaIngresada = Date.valueOf(Fecha1);
            Area1.setText(null);
            Area1.append("| Pedido | ID_Pedido | Codigo_Pedido | Codigo_Tienda1 | Codigo_Tienda2 | Fecha | NIT_Cliente | Cantidad | Total | Anticipo | Credito |<br>");
            Area1.append("\n");
            PreparedStatement PrSt;
            ResultSet rs;
            String Query = "SELECT * FROM Pedido WHERE Codigo_Tienda2 = ? AND Estado IS NULL";
            PrSt = conexion.prepareStatement(Query);
            PrSt.setString(1, TiendaActual);
            rs = PrSt.executeQuery();

            while (rs.next()) {
                String ID = rs.getString("ID_Pedido");
                String Pedido = rs.getString("Codigo_Pedido");
                String Tienda1 = rs.getString("Codigo_Tienda1");
                String Tienda2 = rs.getString("Codigo_Tienda2");
                String Fecha2 = rs.getString("Fecha");
                String NIT = rs.getString("NIT_Cliente");
                String Cantidad = rs.getString("Cantidad");
                String Total = rs.getString("Total");
                String Anticipo = rs.getString("Anticipo");
                String Credito = rs.getString("Credito");

                int Dias = ObtenerTiempo(Tienda1, Tienda2);
                boolean comprobacion = SumarDias(Fecha2, Dias);
                if (comprobacion == true) {
                    String Cadena = "| Pedido | " + ID + " | " + Pedido + " | " + Tienda1 + " | " + Tienda2 + " | " + Fecha2 + " | " + NIT + " | " + Cantidad + " | " + Total + " | " + Anticipo + " | " + Credito + " |<br>";
                    Area1.append(Cadena);
                    Area1.append("\n");

                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Boton2ActionPerformed
    /**
     * Muestra todos los pedidos que han salido de la tienda en la que estamos ubicados
     * @param evt 
     */
    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        try {
            Area1.setText(null);
            Area1.append("| Pedido | ID_Pedido | Codigo_Pedido | Codigo_Tienda1 | Codigo_Tienda2 | Fecha | NIT_Cliente | Cantidad | Total | Anticipo | Credito |<br>");
            Area1.append("\n");
            PreparedStatement PrSt;
            ResultSet rs;
            String Query = "SELECT * FROM Pedido WHERE Codigo_Tienda1 = ? AND Estado IS NULL";
            PrSt = conexion.prepareStatement(Query);
            PrSt.setString(1, TiendaActual);
            rs = PrSt.executeQuery();

            while (rs.next()) {
                String ID = rs.getString("ID_Pedido");
                String Pedido = rs.getString("Codigo_Pedido");
                String Tienda1 = rs.getString("Codigo_Tienda1");
                String Tienda2 = rs.getString("Codigo_Tienda2");
                String Fecha = rs.getString("Fecha");
                String NIT = rs.getString("NIT_Cliente");
                String Cantidad = rs.getString("Cantidad");
                String Total = rs.getString("Total");
                String Anticipo = rs.getString("Anticipo");
                String Credito = rs.getString("Credito");

                String Cadena = "| Pedido | " + ID + " | " + Pedido + " | " + Tienda1 + " | " + Tienda2 + " | " + Fecha + " | " + NIT + " | " + Cantidad + " | " + Total + " | " + Anticipo + " | " + Credito + " |<br>";
                Area1.append(Cadena);
                Area1.append("\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Boton4ActionPerformed
    /**
     * Muestra todos las compras que ha realizado un cliente en la empresa. 
     * @param evt 
     */
    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        String Nit = JOptionPane.showInputDialog("Ingresa el NIT del cliente");
        try {
            Area1.setText(null);
            Area1.append("| Venta | ID_Venta | Codigo_Producto | Codigo_Tienda | NIT_Cliente | Cantidad | Pago | Credito | Fecha |<br>");
            Area1.append("\n");
            PreparedStatement PrSt;
            ResultSet rs;
            String Query = "SELECT * FROM Venta WHERE NIT_Cliente = ? ";
            PrSt = conexion.prepareStatement(Query);
            PrSt.setString(1, Nit);
            rs = PrSt.executeQuery();

            while (rs.next()) {
                String ID = rs.getString("ID_Venta");
                String Producto = rs.getString("Codigo_Producto");
                String Tienda = rs.getString("Codigo_Tienda");
                String NIT = rs.getString("NIT_Cliente");
                String Cantidad = rs.getString("Cantidad");
                String Pago = rs.getString("Pago");
                String Credito = rs.getString("Credito");
                String Fecha = rs.getString("Fecha");

                String Cadena = "| Venta | " + ID + " | " + Producto + " | " + Tienda + " | " + NIT + " | " + Cantidad + " | " + Pago + " | " + Credito + " | " + Fecha + " |<br> ";
                Area1.append(Cadena);
                Area1.append("\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Boton5ActionPerformed
    /**
     * Muestra todos los pedidos que ha realizado un cliente y no han llegado a la tienda
     * @param evt 
     */
    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        String Nit = JOptionPane.showInputDialog("Ingresa el NIT del cliente");
        try {
            Area1.setText(null);
            Area1.append("| Pedido | ID_Pedido | Codigo_Pedido | Codigo_Tienda1 | Codigo_Tienda2 | Fecha | NIT_Cliente | Cantidad | Total | Anticipo | Credito |<br>");
            Area1.append("\n");
            PreparedStatement PrSt;
            ResultSet rs;
            String Query = "SELECT * FROM Pedido WHERE NIT_Cliente = ? AND Estado IS NULL";
            PrSt = conexion.prepareStatement(Query);
            PrSt.setString(1, Nit);
            rs = PrSt.executeQuery();

            while (rs.next()) {
                String ID = rs.getString("ID_Pedido");
                String Pedido = rs.getString("Codigo_Pedido");
                String Tienda1 = rs.getString("Codigo_Tienda1");
                String Tienda2 = rs.getString("Codigo_Tienda2");
                String Fecha = rs.getString("Fecha");
                String NIT = rs.getString("NIT_Cliente");
                String Cantidad = rs.getString("Cantidad");
                String Total = rs.getString("Total");
                String Anticipo = rs.getString("Anticipo");
                String Credito = rs.getString("Credito");

                String Cadena = "| Pedido | " + ID + " | " + Pedido + " | " + Tienda1 + " | " + Tienda2 + " | " + Fecha + " | " + NIT + " | " + Cantidad + " | " + Total + " | " + Anticipo + " | " + Credito + " |<br>";
                Area1.append(Cadena);
                Area1.append("\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Boton6ActionPerformed
    /**
     * Muestra los diez productos mas vendidos. Puede agregar un limite de tiempo
     * @param evt 
     */
    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed

        try {
            Area1.setText(null);
            Area1.append("| Productos_Vendidos| -- |Codigo_Producto|<br> ");
            Area1.append("\n");
            PreparedStatement PrSt = null;
            ResultSet rs;
            int confirmar = JOptionPane.showConfirmDialog(null, "¿Ingresar intervalo de tiempo?");
            if (confirmar == JOptionPane.YES_OPTION) {
                String FechaInicial = JOptionPane.showInputDialog("Ingresa la primera fecha");
                String FechaFinal = JOptionPane.showInputDialog("Ingresa la segunda fecha");
                String Query = "SELECT SUM(Cantidad) AS Productos_Vendidos, Codigo_Producto FROM Venta WHERE Fecha BETWEEN ? AND ? GROUP BY Codigo_Producto ORDER BY SUM(Cantidad) DESC LIMIT 10";
                PrSt = conexion.prepareStatement(Query);
                PrSt.setDate(1, Date.valueOf(FechaInicial));
                PrSt.setDate(2, Date.valueOf(FechaFinal));
            } else {
                String Query = "SELECT SUM(Cantidad) AS Productos_Vendidos, Codigo_Producto FROM Venta GROUP BY Codigo_Producto ORDER BY SUM(Cantidad) DESC LIMIT 10";
                PrSt = conexion.prepareStatement(Query);
            }

            rs = PrSt.executeQuery();

            while (rs.next()) {
                String ProVendidos = rs.getString("Productos_Vendidos");
                String Producto = rs.getString("Codigo_Producto");

                String Cadena = "| " + ProVendidos + " | -- | " + Producto + " |<br>";
                Area1.append(Cadena);
                Area1.append("\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Boton7ActionPerformed
    /**
     * Lista los productos mas vendidos de una tienda. Puede ser por intervalo de tiempo
     * @param evt 
     */
    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        try {
            Area1.setText(null);
            Area1.append("| Productos_Vendidos | -- | Codigo_Tienda |<br>");
            Area1.append("\n");
            PreparedStatement PrSt = null;
            ResultSet rs;
            int confirmar = JOptionPane.showConfirmDialog(null, "¿Ingresar intervalo de tiempo?");
            if (confirmar == JOptionPane.YES_OPTION) {
                String FechaInicial = JOptionPane.showInputDialog("Ingresa la primera fecha");
                String FechaFinal = JOptionPane.showInputDialog("Ingresa la segunda fecha");
                String Query = "SELECT SUM(Cantidad) AS Productos_Vendidos, Codigo_Tienda FROM Venta WHERE Fecha BETWEEN ? AND ? GROUP BY Codigo_Tienda ORDER BY SUM(Cantidad) DESC";
                PrSt = conexion.prepareStatement(Query);
                PrSt.setDate(1, Date.valueOf(FechaInicial));
                PrSt.setDate(2, Date.valueOf(FechaFinal));
            } else {
                String Query = "SELECT SUM(Cantidad) AS Productos_Vendidos, Codigo_Tienda FROM Venta GROUP BY Codigo_Tienda ORDER BY SUM(Cantidad) DESC ";
                PrSt = conexion.prepareStatement(Query);
            }

            rs = PrSt.executeQuery();

            while (rs.next()) {
                String ProVendidos = rs.getString("Productos_Vendidos");
                String Tienda = rs.getString("Codigo_Tienda");

                String Cadena = "| " + ProVendidos + " | -- | " + Tienda + " |<br>";
                Area1.append(Cadena);
                Area1.append("\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Boton8ActionPerformed
    /**
     * Muestra los productos que nunca se han vendido
     * @param evt 
     */
    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        try {
            Area1.setText(null);
            Area1.append("| Producto | ID | Nombre | Fabricante | Codigo | Cantidad | Precio | Codigo_Tienda | Descripcion | Garantia |<br>");
            Area1.append("\n");
            PreparedStatement PrSt;
            ResultSet rs;
            String Query = "SELECT * FROM Producto WHERE Codigo NOT IN (SELECT Codigo_Producto FROM Venta)";
            PrSt = conexion.prepareStatement(Query);
            rs = PrSt.executeQuery();

            while (rs.next()) {
                String ID = rs.getString("ID");
                String Nombre = rs.getString("Nombre");
                String Fabricante = rs.getString("Fabricante");
                String Codigo = rs.getString("Codigo");
                String Cantidad = rs.getString("Cantidad");
                String Precio = rs.getString("Precio");
                String Codigo_Tienda = rs.getString("Codigo_Tienda");
                String Descripcion = rs.getString("Descripcion");
                String Garantia = rs.getString("Garantia");

                String Cadena = "| Producto | " + ID + " | " + Nombre + " | " + Fabricante + " | " + Codigo + " | " + Cantidad + " | " + Precio + " | " + Codigo_Tienda + " | " + Descripcion + " | " + Garantia + " |<br>";
                Area1.append(Cadena);
                Area1.append("\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Boton9ActionPerformed
    /**
     * Lista de los productos que llegaran con retraso en base a la fecha ingresada.
     * @param evt 
     */
    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        try {

            String Fecha1 = JOptionPane.showInputDialog("Ingresa la fecha");
            FechaIngresada = Date.valueOf(Fecha1);
            Area1.setText(null);
            Area1.append("| Pedido | ID_Pedido | Codigo_Pedido | Codigo_Tienda1 | Codigo_Tienda2 | Fecha | NIT_Cliente | Cantidad | Total | Anticipo | Credito |<br>");
            Area1.append("\n");
            PreparedStatement PrSt;
            ResultSet rs;
            String Query = "SELECT * FROM Pedido WHERE Codigo_Tienda2 = ? AND Estado IS NULL";
            PrSt = conexion.prepareStatement(Query);
            PrSt.setString(1, TiendaActual);
            rs = PrSt.executeQuery();

            while (rs.next()) {
                String ID = rs.getString("ID_Pedido");
                String Pedido = rs.getString("Codigo_Pedido");
                String Tienda1 = rs.getString("Codigo_Tienda1");
                String Tienda2 = rs.getString("Codigo_Tienda2");
                String Fecha2 = rs.getString("Fecha");
                String NIT = rs.getString("NIT_Cliente");
                String Cantidad = rs.getString("Cantidad");
                String Total = rs.getString("Total");
                String Anticipo = rs.getString("Anticipo");
                String Credito = rs.getString("Credito");

                int Dias = ObtenerTiempo(Tienda1, Tienda2);
                boolean comprobacion = SumarDias(Fecha2, Dias);
                if (comprobacion == false) {
                    String Cadena = "| Pedido | " + ID + " | " + Pedido + " | " + Tienda1 + " | " + Tienda2 + " | " + Fecha2 + " | " + NIT + " | " + Cantidad + " | " + Total + " | " + Anticipo + " | " + Credito + " | <br>";
                    Area1.append(Cadena);
                    Area1.append("\n");

                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Boton3ActionPerformed
    /**
     * LLama al metodo para exportar el reporte.
     * Obtiene el contenido del area de texto.
     * @param evt 
     */
    private void BotonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonExportarActionPerformed
        String Texto = Area1.getText();
        if ("".equals(Texto)) {
             JOptionPane.showMessageDialog(null, "No hay reporte para exportar");
        } else {
            Exportacion exportar = new Exportacion(Texto);
            exportar.ExportarReporte();
        }
    }//GEN-LAST:event_BotonExportarActionPerformed
    /**
     * Obtiene el tiempo de llegada de un pedido entre dos tiendas
     * @param TiendaO Tienda Origen 
     * @param TiendaD Tienda destino del pedido
     * @return La cantidad de tiempo
     */
    private int ObtenerTiempo(String TiendaO, String TiendaD) {
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
     * Suma los dias de el tiempo entre las tiendas a la fecha en que se realizo el pedido
     * @param Fecha Fecha en que se realizo el pedido
     * @param dias Los dias que se deben sumar
     * @return Si el fecha es antes o despues de la fecha establecida de llegada.
     */
    private boolean SumarDias(String Fecha, int dias) {
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
        FechaEntrada = new java.sql.Date(Año - 1900, Mes - 1, Dia);

        Dia = Dia + dias;
        if (Dia > 30) {
            Dia = Dia - 30;
            Mes++;
            if (Mes > 12) {
                Mes = 1;
                Año++;
            }
        }

        FechaTemporal = new java.sql.Date(Año - 1900, Mes - 1, Dia);
        if (FechaIngresada.before(FechaTemporal) || FechaIngresada.equals(FechaTemporal)) {
            regreso = true;
        } else {
            regreso = false;
        }

        return regreso;
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
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte(conexion, TiendaActual).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonExportar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
