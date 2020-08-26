
package principal;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Exportacion {
    
    private String TextoExportar;
    /**
     * Constructor de la clase Exportacion
     * @param TextoExportar El texto que se va a exportar al archivo HTML
     */
    public Exportacion(String TextoExportar) {
        this.TextoExportar = TextoExportar;
    }
    /**
     * Metodo que exporta el texto recibido a un archuvo HTML
     */
    public void ExportarReporte(){
         try {
            FileWriter escribir;
            PrintWriter linea;
            JFileChooser seleccionar = new JFileChooser();
            File fichero;
            int Guardar = seleccionar.showDialog(null, "Guardar");

            if (Guardar == JFileChooser.APPROVE_OPTION) {
                fichero = seleccionar.getSelectedFile();
                if (fichero.getName().endsWith(".html")) {
                    if (fichero.exists()) {
                        int opcion = JOptionPane.showConfirmDialog(null, "Deseas sobrescribir");
                        if (opcion == JOptionPane.YES_OPTION) {
                            fichero.createNewFile();
                            escribir = new FileWriter(fichero, false);
                            escribir.write("<HTML>\n"
                                    + "   <HEAD>\n"
                                    + "      <TITLE>Reportes de la Empresa </TITLE>\n"
                                    + "   </HEAD>\n"
                                    + "   <BODY>\n"
                                    + "      <P> " + TextoExportar + "</P>\n"
                                    + "   </BODY>\n"
                                    + "</HTML>");
                            escribir.close();
                            JOptionPane.showMessageDialog(null, "Reporte Exportado");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se guardo el archivo");
                        }
                    } else {
                        fichero.createNewFile();
                        escribir = new FileWriter(fichero, false);
                        escribir.write("<HTML>\n"
                                + "   <HEAD>\n"
                                + "      <TITLE>Reportes de la Empresa </TITLE>\n"
                                + "   </HEAD>\n"
                                + "   <BODY>\n"
                                + "      <P> " + TextoExportar + "</P>\n"
                                + "   </BODY>\n"
                                + "</HTML>");
                        escribir.close();
                        JOptionPane.showMessageDialog(null, "Reporte Exportado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No es un archivo .html");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
    }
}
