package Clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compra {
    public ArrayList<Auto> autCom;
    public LocalDate fechaCompra;
    public String valorCompra;

    public Compra( LocalDate fechaCompra, String valorCompra) {
        this.autCom = new ArrayList<>();
        this.fechaCompra = fechaCompra;
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
