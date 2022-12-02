package Gestion;
import java.util.ArrayList;

import Clases.Auto;
import Clases.Compra;

public class GestionCompra {
    ArrayList<Auto> respaldo;

    public boolean GenerarFactura(String b,Double c){
        Compra factura = new Compra(this.respaldo,b,c);
        return true;
    }

    public boolean Agregar(Auto a){
        this.respaldo.add(a);
        return true;
    }


}
