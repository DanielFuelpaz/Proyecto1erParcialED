package Gestion;
import java.util.ArrayList;
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
    
     public void GenerarFactura(String fecha,String valor){
        ArrayList<Auto> lista= new ArrayList(this.respaldo);
        factura=new Compra(lista,fecha,valor);
    }

    public void MostrarLista(){
        for(int i=0; i<this.respaldo.size();i++){
            System.out.println(this.respaldo.get(i).toString());
        }
    }
    public boolean BorrarCarro(int a){
        this.respaldo.remove(a-1);
        return true;
    }
    public void ImprimirFactura(){
        factura.toString();
    }

}
