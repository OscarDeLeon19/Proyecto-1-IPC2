package principal;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;
    private static boolean Conexion_Exitosa;
    

    public Conexion(String URL, String USERNAME, String PASSWORD) {
        this.URL = URL;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
    }

    public boolean isConexion_Exitosa() {
        return Conexion_Exitosa;
    }
    
    

    public static Connection getConnection() {

        Connection con = null;
        try {
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
    
    public static Connection getConnection2() {

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Conexion_Exitosa = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Conexion_Exitosa = false;
        }
        return con;
    }
}
