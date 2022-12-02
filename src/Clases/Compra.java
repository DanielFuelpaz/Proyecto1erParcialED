package Clases;
import java.util.ArrayList;

public class Compra {
    public ArrayList<Auto> autCom;
    public String fecha;
    public Double valorCompra;

    public Compra(ArrayList<Auto> autCom, String fecha, Double valorCompra) {
        this.autCom = autCom;
        this.fecha = fecha;
        this.valorCompra = valorCompra;
    }

    public ArrayList<Auto> getAutCom() {
        return autCom;
    }

    public void setAutCom(ArrayList<Auto> autCom) {
        this.autCom = autCom;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
}