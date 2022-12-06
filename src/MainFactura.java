import java.util.ArrayList;

import Clases.Auto;
import Gestion.GestionCompra;

public class MainFactura {
    public static void main(String[] args) {
        ArrayList<Auto> interes= new ArrayList();
        GestionCompra coso= new GestionCompra(interes);
        Auto Audi =new Auto("das5465", "Azul", "Audi", "2018");
        Auto Mercedes =new Auto("csi1245", "Azul", "Mercedes", "2015");
        Auto Mclaren =new Auto("ghf1346", "Azul", "Maclaren", "2013");
        coso.Agregar(Audi);
        coso.Agregar(Mclaren);
        coso.Agregar(Mercedes);
        coso.MostrarLista();
        coso.BorrarCarro(2);
        coso.GenerarFactura("21/12/2022", "12346.231");
        coso.ImprimirFactura();
    }
}
