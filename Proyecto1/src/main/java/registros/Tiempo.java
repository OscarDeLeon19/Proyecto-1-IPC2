
package registros;


public class Tiempo {
    
    private String CodigoTienda1;
    private String CodigoTienda2;
    private int Dias;

    public Tiempo(String CodigoTienda1, String CodigoTienda2, int Dias) {
        this.CodigoTienda1 = CodigoTienda1;
        this.CodigoTienda2 = CodigoTienda2;
        this.Dias = Dias;
    }

    public String getCodigoTienda1() {
        return CodigoTienda1;
    }

    public void setCodigoTienda1(String CodigoTienda1) {
        this.CodigoTienda1 = CodigoTienda1;
    }

    public String getCodigoTienda2() {
        return CodigoTienda2;
    }

    public void setCodigoTienda2(String CodigoTienda2) {
        this.CodigoTienda2 = CodigoTienda2;
    }

    public int getDias() {
        return Dias;
    }

    public void setDias(int Dias) {
        this.Dias = Dias;
    }
    
    
}
