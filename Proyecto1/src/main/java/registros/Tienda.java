
package registros;

public class Tienda {
    
    private String Nombre;
    private String Direccion;
    private String Codigo;
    private int Telefono;

    public Tienda(String Nombre, String Direccion, String Codigo, int Telefono) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Codigo = Codigo;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    
}
