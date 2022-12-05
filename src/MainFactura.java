import java.util.ArrayList;

import Clases.Auto;
import Clases.Compra;
import Gestion.GestionCompra;

public class MainFactura {
    public static void main(String[] args) {
        
        GestionCompra coso=new GestionCompra();
        Auto vehiculo =new Auto("das5465", "Azul", "Audi", "2018");
        ArrayList<Auto> lista =new ArrayList();
        lista.add(vehiculo);
        Compra a=new Compra(lista, "1/12/2022", 40000.50);
        coso.ImprimirFactura(a);
    }
}
