import java.util.ArrayList;

public class MainAuto {
    public static void main(String[] args) {
        ArrayList<Auto> Camion=new ArrayList();
        ArrayList<Auto> suv=new ArrayList();
        ArrayList<ArrayList<Auto>> lista= new ArrayList();
        Auto mercedes=new Auto("taa125","rojo","mercedes","2001");
        Auto spark=new Auto("taa125","rojo","chevrolet","2001");
        Camion.add(mercedes);
        Tipo coso=new Tipo(lista);
        coso.lista.add(Camion);
        coso.InsertarFinal(Camion, mercedes);
        coso.InsertarInicio(suv, spark);
        coso.Imprimir();
        coso.Modificar(suv, mercedes,"color","plomo");
        coso.Imprimir();
        coso.Buscar(suv, 1);
    }
}   