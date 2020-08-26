package acciones;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Entrega extends javax.swing.JFrame {

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
    private String IDPedido;
    private String EstadoPedido;
    private String FechaIngresoDePedido;
    private String FechaDeLlegada;
    private java.sql.Date FechaPrevista;
    private java.sql.Date FechaIngresada;
    private java.sql.Date FechaEntrada;

    /**
     * Inicializa un Objeto de tipo entrega
     *
     * @param conexion La conexion con la base de datos
     * @param Codigo_Tienda El codigo de la tienda en la que estamos
     */
    public Entrega(Connection conexion, String Codigo_Tienda) {
        initComponents();
        this.conexion = conexion;
        this.Codigo_Tienda = Codigo_Tienda;
        this.setLocationRelativeTo(null);

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
        TextoAcciones = new javax.swing.JTextField();
        BotonLimpiar = new javax.swing.JButton();
        TextoHorario1 = new javax.swing.JTextField();
        TextoAnticipo = new javax.swing.JTextField();
        Texto8 = new javax.swing.JTextField();
        Texto9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        Texto11 = new javax.swing.JTextField();
        TextoCredito = new javax.swing.JTextField();
        Texto10 = new javax.swing.JTextField();
        BotonListar = new javax.swing.JButton();
        BotonPedidoListo = new javax.swing.JButton();
        BotonIngresarPedido = new javax.swing.JButton();
        BotonEntregarPedido = new javax.swing.JButton();
        BotonPedidoFinalizado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informacion");

        Titulo.setEditable(false);
        Titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo.setText("Entregas");

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

        Texto1.setEditable(false);

        Texto3.setEditable(false);

        Texto4.setEditable(false);

        Texto5.setEditable(false);

        Texto6.setEditable(false);

        Texto2.setEditable(false);

        Texto7.setEditable(false);

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

        Texto9.setEditable(false);

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

        Texto10.setEditable(false);

        BotonListar.setText("Pedidos en Curso");
        BotonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarActionPerformed(evt);
            }
        });

        BotonPedidoListo.setText("Pedidos Listos");
        BotonPedidoListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPedidoListoActionPerformed(evt);
            }
        });

        BotonIngresarPedido.setText("Ingresar Pedido");
        BotonIngresarPedido.setEnabled(false);
        BotonIngresarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarPedidoActionPerformed(evt);
            }
        });

        BotonEntregarPedido.setText("Entregar Pedido");
        BotonEntregarPedido.setEnabled(false);
        BotonEntregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEntregarPedidoActionPerformed(evt);
            }
        });

        BotonPedidoFinalizado.setText("Pedidos Finalizados");
        BotonPedidoFinalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPedidoFinalizadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                                .addComponent(TextoAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto6, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto7, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto8, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto10, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto9, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotonListar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(BotonPedidoListo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotonPedidoFinalizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Texto11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(BotonIngresarPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotonEntregarPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(216, 216, 216))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1)
                .addContainerGap())
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
                    .addComponent(TextoAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonListar)
                    .addComponent(BotonIngresarPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonPedidoListo)
                    .addComponent(BotonEntregarPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonPedidoFinalizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(Texto9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Limpia las cajas de texto de la interfaz
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
        Texto10.setText(null);
        Texto11.setText(null);
        EstadoPedido = null;
        FechaIngresoDePedido = null;
    }

    /**
     * LLama ak metodo para limpiar
     *
     * @param evt
     */
    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_BotonLimpiarActionPerformed
    /**
     * Obtiene los datos de la fila seleccionada y los guarda en las cajas de
     * texto
     *
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
                Texto1.setText(resultado.getString("Codigo_Pedido"));
                Texto2.setText(resultado.getString("Codigo_Tienda1"));
                Texto3.setText(resultado.getString("Codigo_Tienda2"));
                Texto4.setText(resultado.getString("Fecha"));
                Texto5.setText(resultado.getString("NIT_Cliente"));
                Texto6.setText(resultado.getString("Codigo_Producto"));
                Texto7.setText(resultado.getString("Cantidad"));
                Texto8.setText(resultado.getString("Total"));
                Texto9.setText(resultado.getString("Anticipo"));
                Texto10.setText(resultado.getString("Credito"));
                EstadoPedido = resultado.getString("Estado");
                FechaIngresoDePedido = resultado.getString("FechaDeEntrega");
            }
            PrSt.close();
            resultado.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Tabla1MouseClicked

    /**
     * Lista todos los pedidos de la tienda que estan pendiendes de ingresar
     * @param evt 
     */
    private void BotonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarActionPerformed
        BotonIngresarPedido.setEnabled(true);
        BotonEntregarPedido.setEnabled(false);
        Limpiar();
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Pedido WHERE Estado IS NULL AND Codigo_Tienda2 = ?";

            PrSt = conexion.prepareStatement(ComandoSQL);
            PrSt.setString(1, Codigo_Tienda);
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
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BotonListarActionPerformed
    /**
     * Habilita el boton para ingresar un pedido
     * @param evt 
     */
    private void BotonPedidoListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPedidoListoActionPerformed
        BotonIngresarPedido.setEnabled(false);
        BotonEntregarPedido.setEnabled(true);
        Limpiar();
        ActualizarDatos();

    }//GEN-LAST:event_BotonPedidoListoActionPerformed
    /**
     * Lista todos los pedidos que estan finalizados y entregados al cliente
     * @param evt 
     */
    private void BotonPedidoFinalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPedidoFinalizadoActionPerformed
        BotonIngresarPedido.setEnabled(false);
        BotonEntregarPedido.setEnabled(false);
        Limpiar();
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Pedido WHERE Estado = 'Finalizado'";

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
    }//GEN-LAST:event_BotonPedidoFinalizadoActionPerformed
    /**
     * Ingresa un pedido que ha llegado a la tienda.
     * El programa determina si el pedido llego a tiempo o esta atrasado
     * @param evt 
     */
    private void BotonIngresarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarPedidoActionPerformed
        try {
            FechaDeLlegada = JOptionPane.showInputDialog(null, "Ingresa la Fecha de llegada (AAAA-MM-DD)");
            int Guion[] = new int[2];
            int x = 0;
            for (int i = 0; i < FechaDeLlegada.length(); i++) {
                int j = i + 1;
                if ("-".equals(FechaDeLlegada.substring(i, j))) {
                    Guion[x] = i;
                    x++;
                }
            }
            int Año = Integer.parseInt(FechaDeLlegada.substring(0, Guion[0]));
            if (FechaDeLlegada.substring(0, Guion[0]).length() == 4) {
                int Mes = Integer.parseInt(FechaDeLlegada.substring(Guion[0] + 1, Guion[1]));
                if (Mes <= 12 && Mes > 0) {
                    int Dia = Integer.parseInt(FechaDeLlegada.substring(Guion[1] + 1, FechaDeLlegada.length()));
                    if (Dia <= 30 && Dia > 0) {
                        FechaIngresada = new java.sql.Date(Año - 1900, Mes - 1, Dia);
                        ObtenerDatos();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al ingresar el dia");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error al ingresar el mes");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al ingresar el año");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

    }//GEN-LAST:event_BotonIngresarPedidoActionPerformed
    /**
     * Entrega un pedido al cliente, lo marca como finalizado.
     * Ingresa la venta correspondiente
     * Y comprueba si al cliente se le atribuye un credito, y si es asi, se lo ingresa.
     * @param evt 
     */
    private void BotonEntregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEntregarPedidoActionPerformed
        try {
            String Credito1;
            CodigoPedido = Texto1.getText();
            TiendaOrigen = Texto2.getText();
            Fecha = Texto4.getText();
            NITCliente = Texto5.getText();
            CodigoProducto = Texto6.getText();
            Cantidad = Integer.parseInt(Texto7.getText());
            Total = Double.parseDouble(Texto8.getText());
            Anticipo = Double.parseDouble(Texto9.getText());
            Credito1 = Texto10.getText();
            IDPedido = Texto11.getText();

            if ("".equals(Credito1)) {
                Credito = 0;
            } else {
                Credito = Double.parseDouble(Credito1);
            }

            double Resto = Total - Anticipo;
            if (Resto > 0) {
                JOptionPane.showMessageDialog(null, "El cliente debe pagar: Q" + Resto);
            } else if (Resto == 0) {
                JOptionPane.showMessageDialog(null, "El pedido ya esta pagado");
            }
            PreparedStatement PreSt;
            String SQLQuery = "INSERT INTO Venta (Codigo_Producto, Codigo_Tienda, NIT_Cliente, Cantidad, Pago, Credito, Fecha) VALUES(?,?,?,?,?,?,?)";
            PreSt = conexion.prepareStatement(SQLQuery);
            PreSt.setString(1, CodigoProducto);
            PreSt.setString(2, TiendaOrigen);
            PreSt.setString(3, NITCliente);
            PreSt.setInt(4, Cantidad);
            PreSt.setDouble(5, (Total - Credito));
            PreSt.setDouble(6, Credito);
            PreSt.setDate(7, Date.valueOf(FechaIngresoDePedido));
            int resultado = PreSt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Venta realizada");
                String Query2 = "UPDATE Pedido SET Estado = 'Finalizado' WHERE ID_Pedido = ?";
                PreSt = conexion.prepareStatement(Query2);
                PreSt.setString(1, IDPedido);
                int Ejecucion = PreSt.executeUpdate();
                if (Ejecucion > 0) {
                    ResultSet RS = null;
                    String Query3 = "SELECT * FROM Cliente WHERE NIT = ?";
                    PreSt = conexion.prepareStatement(Query3);
                    PreSt.setString(1, NITCliente);
                    RS = PreSt.executeQuery();
                    if (RS.next()) {
                        double CreditoDeCliente = RS.getDouble("Credito");
                        if ("Atrasado".equals(EstadoPedido)) {
                            if (Resto > 0) {
                                CreditoDeCliente = CreditoDeCliente + (0.02 * Total);
                                JOptionPane.showMessageDialog(null, "Se le ha acreditado Q" + 0.02 * Total + " de credito al cliente");
                            } else if (Resto == 0) {
                                CreditoDeCliente = CreditoDeCliente + 0.05 * Total;
                                JOptionPane.showMessageDialog(null, "Se le ha acreditado Q" + 0.05 * Total + " de credito al cliente");
                            }
                            String Query4 = "UPDATE Cliente SET Credito = ? WHERE NIT = ?";
                            PreSt = conexion.prepareStatement(Query4);
                            PreSt.setDouble(1, CreditoDeCliente);
                            PreSt.setString(2, NITCliente);
                            int IngresoDeCredito = PreSt.executeUpdate();
                            ActualizarDatos();
                        } else {
                            JOptionPane.showMessageDialog(null, "Entrega Finalizada");
                            ActualizarDatos();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Fallo al obtener el credito");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Fallo al actualizar el pedido");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fallo al realizar venta");
            }
            PreSt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_BotonEntregarPedidoActionPerformed
    /**
     * Actualiza columna de pedidos ingresados 
     */
    private void ActualizarDatos() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla1.setModel(modelo);
            PreparedStatement PrSt;
            ResultSet resultado = null;
            String ComandoSQL = "SELECT * FROM Pedido WHERE Estado != 'Finalizado' AND Codigo_Tienda2 = ?";

            PrSt = conexion.prepareStatement(ComandoSQL);
            PrSt.setString(1, Codigo_Tienda);
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    /**
     * Comprueba el tiempo entre las dos tiendas en las que se realizo el pedido
     * Manda esos dias al metodo de SumarDias
     */
    private void ObtenerDatos() {
        try {
            String Credito1;
            CodigoPedido = Texto1.getText();
            TiendaOrigen = Texto2.getText();
            Fecha = Texto4.getText();
            NITCliente = Texto5.getText();
            CodigoProducto = Texto6.getText();
            Cantidad = Integer.parseInt(Texto7.getText());
            Total = Double.parseDouble(Texto8.getText());
            Anticipo = Double.parseDouble(Texto9.getText());
            Credito1 = Texto10.getText();
            IDPedido = Texto11.getText();

            if ("".equals(Credito1)) {
                Credito = 0;
            } else {
                Credito = Double.parseDouble(Credito1);
            }
            PreparedStatement PrSt;
            ResultSet resultado1 = null;
            ResultSet resultado2 = null;
            String SQLQuery = "SELECT * FROM Tiempo WHERE Codigo_Tienda1 = ? AND Codigo_Tienda2 = ?";
            PrSt = conexion.prepareStatement(SQLQuery);
            PrSt.setString(1, Codigo_Tienda);
            PrSt.setString(2, TiendaOrigen);
            resultado1 = PrSt.executeQuery();
            if (resultado1.next()) {
                int Dias = resultado1.getInt("Tiempo");
                SumarDias(Dias);
            } else {
                String SQLQuery2 = "SELECT * FROM Tiempo WHERE Codigo_Tienda1 = ? AND Codigo_Tienda2 = ?";
                PrSt = conexion.prepareStatement(SQLQuery);
                PrSt.setString(1, TiendaOrigen);
                PrSt.setString(2, Codigo_Tienda);
                resultado2 = PrSt.executeQuery();
                if (resultado2.next()) {
                    int Dias = resultado2.getInt("Tiempo");
                    SumarDias(Dias);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay un tiempo estipulado");
                    SumarDias(0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    /**
     * Suma los dias estipulados en el tiempo entre tiendas y genera la fecha prevista de entrega del pedido
     * Indica si el pedido llego con retraso o a tiempo.
     * @param dias 
     */
    private void SumarDias(int dias) {
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
        if (FechaIngresada.before(FechaEntrada)) {
            JOptionPane.showMessageDialog(null, "La fecha ingresada es anterior a la fecha en que se hizo el pedido");
        } else {

            Dia = Dia + dias;
            if (Dia > 30) {
                Dia = Dia - 30;
                Mes++;
                if (Mes > 12) {
                    Mes = 1;
                    Año++;
                }
            }

            FechaPrevista = new java.sql.Date(Año - 1900, Mes - 1, Dia);
            if (FechaIngresada.before(FechaPrevista) || FechaIngresada.equals(FechaPrevista)) {
                JOptionPane.showMessageDialog(null, "El pedido llego a tiempo");
                IngresarPedido("Entregado");
            } else {
                JOptionPane.showMessageDialog(null, "El pedido esta atrasado");
                IngresarPedido("Atrasado");
            }
        }
    }
    /**
     * Ingresa un pedido llegado a la tienda
     * @param Estado Muestra si el pedido llego atrasado o a tiempo
     */
    private void IngresarPedido(String Estado) {

        try {
            PreparedStatement PrSt;
            String Query = "UPDATE Pedido SET Estado = ?, FechaDeEntrega = ? WHERE ID_Pedido = ?";
            PrSt = conexion.prepareStatement(Query);
            PrSt.setString(1, Estado);
            PrSt.setDate(2, FechaIngresada);
            PrSt.setString(3, IDPedido);
            int resultado = PrSt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Pedido Ingresado");
                DefaultTableModel modelo = new DefaultTableModel();
                Tabla1.setModel(modelo);
                PreparedStatement parametro;
                ResultSet resultado2 = null;
                String ComandoSQL = "SELECT * FROM Pedido WHERE Estado IS NULL AND Codigo_Tienda2 = ?";

                parametro = conexion.prepareStatement(ComandoSQL);
                parametro.setString(1, Codigo_Tienda);
                resultado2 = parametro.executeQuery();

                ResultSetMetaData result = resultado2.getMetaData();
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

                while (resultado2.next()) {
                    Object[] filas = new Object[Columnas];
                    for (int i = 0; i < Columnas; i++) {
                        filas[i] = resultado2.getObject(i + 1);

                    }
                    modelo.addRow(filas);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al ingresar");
            }
            PrSt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    /**
     * Ejecuta la Tienda
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
            java.util.logging.Logger.getLogger(Entrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrega(conexion, Codigo_Tienda).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEntregarPedido;
    private javax.swing.JButton BotonIngresarPedido;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonListar;
    private javax.swing.JButton BotonPedidoFinalizado;
    private javax.swing.JButton BotonPedidoListo;
    private javax.swing.JTable Tabla1;
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
    private javax.swing.JTextField TextoDireccion;
    private javax.swing.JTextField TextoHorario;
    private javax.swing.JTextField TextoHorario1;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoTel1;
    private javax.swing.JTextField TextoTel2;
    private javax.swing.JTextField Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
