package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;
    private static boolean Conexion_Exitosa;

    /**
     * Constructor de la clase conexion
     *
     * @param URL Direccion de la base de datos
     * @param USERNAME Usuario de la base de datos
     * @param PASSWORD Contraseña de el usuario
     */
    public Conexion(String URL, String USERNAME, String PASSWORD) {
        this.URL = URL;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
    }

    /**
     * Regresa un valor para comprobar que la conexion fue exitosa
     *
     * @return El valor de la conexion
     */
    public boolean isConexion_Exitosa() {
        return Conexion_Exitosa;
    }
    
    /**
     * Metodo que conecta la aplicacion con la base de datos
     * @return La conexion entre la aplicacion y la base de datos
     */
    public static Connection getConnection() {

        Connection con = null;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
            Conexion_Exitosa = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Conexion_Exitosa = false;
        }
        return con;
    }

}
