package Clases;
import java.util.ArrayList;

public class Compra {
    public ArrayList<Auto> autCom;
    public String fecha;
    public String valorCompra;

    public Compra(ArrayList<Auto> autCom, String fecha, String valorCompra) {
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

    public String getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(String valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    @Override
    public String toString() {
        System.out.println("Fecha: "+this.fecha+"\n");
        for(int i=0;i<autCom.size();i++){
            System.out.println(autCom.get(i).toString());
        }
        System.out.println("Valor: "+this.valorCompra);
        return "";
    }
}
