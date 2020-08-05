
package registros;


public class Producto {
    
    private String NombreProducto;
    private String Fabricante;
    private String Codigo;
    private int Cantidad;
    private int Precio;
    private String CodigoTienda;

    public Producto(String NombreProducto, String Fabricante, String Codigo, int Cantidad, int Precio, String CodigoTienda) {
        this.NombreProducto = NombreProducto;
        this.Fabricante = Fabricante;
        this.Codigo = Codigo;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.CodigoTienda = CodigoTienda;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getCodigoTienda() {
        return CodigoTienda;
    }

    public void setCodigoTienda(String CodigoTienda) {
        this.CodigoTienda = CodigoTienda;
    }
    
    
}
