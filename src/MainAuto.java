import Gestion.GestorAuto;
import java.util.ArrayList;
import java.util.Scanner;

import Clases.Auto;

public class MainAuto {
    public static void main(String[] args) {
        /*ArrayList<Auto> Camioneta=new ArrayList<>();
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
        coso.Buscar(Suv, 0); */


    }
    
    public void crearAuto(){
        Scanner coso=new Scanner(System.in);
        int dato;
        String placa,color,marca,año;
        ArrayList<ArrayList<Auto>> lista= new ArrayList<>();
        GestorAuto listalista=new GestorAuto(lista);
        System.out.println("Seleccione el tipo de vehiculo");
        System.out.println("1.-Camioneta \n2.-Suv \n3.-Sedan \n4.-Deportivo");
        System.out.println("Coloque solo el numero de la opcion deseada");
        dato=coso.nextInt();
        switch (dato) {
            case 1:
                ArrayList<Auto> Camioneta=new ArrayList<>();
                System.out.println("Ingrese la placa");
                placa=coso.nextLine();
                System.out.println("Ingrese el color");
                color=coso.nextLine();
                System.out.println("Ingrese la marca");
                marca=coso.nextLine();
                System.out.println("Ingrese el año");
                año=coso.nextLine();
                Auto camioneta=new Auto(placa,color,marca,año);
                listalista.InsertarFinal(Camioneta, camioneta);
                System.out.println("desea agreagr otro auto? (s/n)");
                String des=coso.nextLine();
                if (des.equals("s")) {
                    crearAuto();
                }
                break;
            
            case 2:
                ArrayList<Auto> Suv=new ArrayList<>();
                System.out.println("Ingrese la placa");
                placa=coso.nextLine();
                System.out.println("Ingrese el color");
                color=coso.nextLine();
                System.out.println("Ingrese la marca");
                marca=coso.nextLine();
                System.out.println("Ingrese el año");
                año=coso.nextLine();
                Auto suv=new Auto(placa,color,marca,año);
                listalista.InsertarFinal(Suv, suv);
                System.out.println("desea agreagr otro auto? (s/n)");
                String des=coso.nextLine();
                if (des.equals("s")) {
                    crearAuto();
                }
                break;
            case 3:
                ArrayList<Auto> Sedan=new ArrayList<>();
                System.out.println("Ingrese la placa");
                placa=coso.nextLine();
                System.out.println("Ingrese el color");
                color=coso.nextLine();
                System.out.println("Ingrese la marca");
                marca=coso.nextLine();
                System.out.println("Ingrese el año");
                año=coso.nextLine();
                Auto sedan=new Auto(placa,color,marca,año);
                listalista.InsertarFinal(Sedan, sedan);
                System.out.println("desea agreagr otro auto? (s/n)");
                String des=coso.nextLine();
                if (des.equals("s")) {
                    crearAuto();
                }
                break;
            case 4:
                ArrayList<Auto> Deportivo=new ArrayList<>();
                System.out.println("Ingrese la placa");
                placa=coso.nextLine();
                System.out.println("Ingrese el color");
                color=coso.nextLine();
                System.out.println("Ingrese la marca");
                marca=coso.nextLine();
                System.out.println("Ingrese el año");
                año=coso.nextLine();
                Auto deportivo=new Auto(placa,color,marca,año);
                listalista.InsertarFinal(Deportivo, deportivo);
                System.out.println("desea agreagr otro auto? (s/n)");
                String des=coso.nextLine();
                if (des.equals("s")) {
                    crearAuto();
                }
                break;
            default:
                System.out.println("Dato no valido");
                crearAuto();
                break;
        }
    }
}   
