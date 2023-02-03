package Clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compra {
    public ArrayList<Auto> autCom;
    public LocalDate fechaCompra;
    public String valorCompra;

    public Compra( ) {
        this.autCom = new ArrayList<>();
    }

    
    public ArrayList<Auto> getAutCom() {
        return autCom;
    }


    public void setAutCom(ArrayList<Auto> autCom) {
        this.autCom = autCom;
    }


    public LocalDate getFechaCompra() {
        return fechaCompra;
    }


    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }


    public String getValorCompra() {
        return valorCompra;
    }


    public void setValorCompra(String valorCompra) {
        this.valorCompra = valorCompra;
    }


    @Override
    public String toString() {
        System.out.println("Fecha: " + fechaCompra.toString() + "\n");
        for (int i = 0; i < autCom.size(); i++) {
            System.out.println(autCom.get(i).toString());
        }
        System.out.println("Total: " + this.valorCompra);
        return "";
    }
}
