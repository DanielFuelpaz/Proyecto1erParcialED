package Gestion;
import java.util.ArrayList;
import Clases.Compra;

import Clases.Auto;

public class GestionCompra {
    ArrayList<Auto> respaldo;

    public boolean GenerarFactura(String fecha,Double valor){
        Compra factura = new Compra(this.respaldo,fecha,valor);
        return true;
    }

    public boolean Agregar(Auto a){
        this.respaldo.add(a);
        return true;
    }

    public void ImprimirFactura(Compra a){
        a.toString();
    }
}
