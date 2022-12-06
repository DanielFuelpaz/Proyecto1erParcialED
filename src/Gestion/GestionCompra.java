package Gestion;
import java.util.ArrayList;
import Clases.Compra;

import Clases.Auto;
import Clases.Compra;

public class GestionCompra {
    ArrayList<Auto> respaldo;
    Compra factura;

    public GestionCompra(ArrayList<Auto> respaldo) {
        this.respaldo = respaldo;
    }
    
    
    public void Agregar(Auto a){
        this.respaldo.add(a);
    }
    
     public void GenerarFactura(String fecha,Double valor){
        ArrayList<Auto> lista= new ArrayList(this.respaldo);
        factura=new Compra(lista,fecha,valor);
    }

    public void ImprimirFactura(){
        factura.toString();
    }

}
