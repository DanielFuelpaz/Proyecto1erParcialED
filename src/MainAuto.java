import Gestion.GestorAuto;
import java.util.ArrayList;

import Clases.Auto;

public class MainAuto {
    public static void main(String[] args) {
        ArrayList<Auto> Camioneta=new ArrayList<>();
        ArrayList<Auto> Suv=new ArrayList<>();
        ArrayList<ArrayList<Auto>> lista= new ArrayList<>();
        Auto mercedes=new Auto("tgy125","rojo","mercedes","2001");
        Auto spark=new Auto("pcm125","rojo","chevrolet","2001");
        Camioneta.add(mercedes);
        GestorAuto coso=new GestorAuto(lista);
        coso.lista.add(Camioneta);
        coso.InsertarFinal(Camioneta, mercedes);
        coso.InsertarInicio(Suv, spark);
        coso.ImprimirTodo();
        coso.Modificar(Suv, mercedes,"color","plomo");
        coso.ImprimirTodo();
        coso.Buscar(Suv, 0);
    }
}   