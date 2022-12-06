import Gestion.GestorAuto;
import java.util.ArrayList;
import java.util.Scanner;

import Clases.Auto;

public class MainAuto {
    public static void main(String[] args) {
        ArrayList<ArrayList<Auto>> lista = new ArrayList<>();
        GestorAuto listalista = new GestorAuto(lista);
        menuPrincipal(listalista);
        /*
         * ArrayList<Auto> Camioneta=new ArrayList<>();
         * ArrayList<Auto> Suv=new ArrayList<>();
         * ArrayList<ArrayList<Auto>> lista= new ArrayList<>();
         * Auto mercedes=new Auto("tgy125","rojo","mercedes","2001");
         * Auto spark=new Auto("pcm125","rojo","chevrolet","2001");
         * Camioneta.add(mercedes);
         * GestorAuto coso=new GestorAuto(lista);
         * coso.lista.add(Camioneta);
         * coso.InsertarFinal(Camioneta, mercedes);
         * coso.InsertarInicio(Suv, spark);
         * coso.ImprimirTodo();
         * coso.Modificar(Suv, mercedes,"color","plomo");
         * coso.ImprimirTodo();
         * coso.Buscar(Suv, 0);
         */

    }

    public static void menuPrincipal(GestorAuto b) {
        crearAuto(b);
        ImprimirTodo(b);
    }

    public static void crearAuto(GestorAuto b) {
        Scanner coso = new Scanner(System.in);
        int dato;
        String placa, color, marca, año, des;

        System.out.println("Seleccione el tipo de vehiculo que desea agregar");
        System.out.println("1.-Camioneta \n2.-Suv \n3.-Sedan \n4.-Deportivo");
        System.out.println("Coloque solo el numero de la opcion deseada");
        dato = coso.nextInt();
        switch (dato) {
            case 1:
                ArrayList<Auto> Camioneta = new ArrayList<>();
                System.out.println("Ingrese la placa");
                placa = coso.next();
                System.out.println("Ingrese el color");
                color = coso.next();
                System.out.println("Ingrese la marca");
                marca = coso.next();
                System.out.println("Ingrese el año");
                año = coso.next();
                Auto camioneta = new Auto(placa, color, marca, año);
                b.InsertarFinal(Camioneta, camioneta);
                System.out.println("desea agreagr otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    crearAuto(b);
                }
                menuPrincipal(b);
                break;

            case 2:
                ArrayList<Auto> Suv = new ArrayList<>();
                System.out.println("Ingrese la placa");
                placa = coso.next();
                System.out.println("Ingrese el color");
                color = coso.next();
                System.out.println("Ingrese la marca");
                marca = coso.next();
                System.out.println("Ingrese el año");
                año = coso.next();
                Auto suv = new Auto(placa, color, marca, año);
                b.InsertarFinal(Suv, suv);
                System.out.println("desea agreagr otro auto? (s/n)");
                des = coso.nextLine().toUpperCase();
                if (des.equals("S")) {
                    crearAuto(b);
                }
                menuPrincipal(b);
                break;
            case 3:
                ArrayList<Auto> Sedan = new ArrayList<>();
                System.out.println("Ingrese la placa");
                placa = coso.next();
                System.out.println("Ingrese el color");
                color = coso.next();
                System.out.println("Ingrese la marca");
                marca = coso.next();
                System.out.println("Ingrese el año");
                año = coso.next();
                Auto sedan = new Auto(placa, color, marca, año);
                b.InsertarFinal(Sedan, sedan);
                System.out.println("desea agreagr otro auto? (s/n)");
                des = coso.nextLine().toUpperCase();
                if (des.equals("S")) {
                    crearAuto(b);
                }
                menuPrincipal(b);
                break;
            case 4:
                ArrayList<Auto> Deportivo = new ArrayList<>();
                System.out.println("Ingrese la placa");
                placa = coso.next();
                System.out.println("Ingrese el color");
                color = coso.next();
                System.out.println("Ingrese la marca");
                marca = coso.next();
                System.out.println("Ingrese el año");
                año = coso.next();
                Auto deportivo = new Auto(placa, color, marca, año);
                b.InsertarFinal(Deportivo, deportivo);
                System.out.println("desea agreagr otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    crearAuto(b);
                }
                menuPrincipal(b);
                break;
            default:
                System.out.println("Dato no valido");
                crearAuto(b);
                break;
        }
    }

    public static void ImprimirTodo(GestorAuto b) {
        b.ImprimirTodo();
        System.out.println("\n");
        menuPrincipal(b);
    }

    public static void Moodificar(GestorAuto b) {
        Scanner coso = new Scanner(System.in);
        int dato,num;
        String placa, color, marca, año,des,respuesta;
        System.out.println("Seleccione el tipo de vehiculo que quiere modificar");
        System.out.println("1.-Camioneta \n2.-Suv \n3.-Sedan \n4.-Deportivo");
        System.out.println("Coloque solo el numero de la opcion deseada");
        dato = coso.nextInt();
        switch (dato) {
            case 1:
                ArrayList<Auto> Camioneta = new ArrayList<>();
                b.ImprimirLista(Camioneta);
                System.out.println("Ingrese el número del vehiculo que desea modificar");
                num = coso.nextInt();
                System.out.println("Desea modificar la matricula? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la placa");
                    placa = coso.next();
                    b.Modificar(Camioneta, num, "placa", placa);
                }
                System.out.println("Desea modificar el color? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el color");
                    color = coso.next();
                    b.Modificar(Camioneta, num, "color", color);
                }
                System.out.println("Desea modificar la marca? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la marca");
                    marca = coso.next();
                    b.Modificar(Camioneta, num, "marca", marca);
                }
                System.out.println("Desea modificar el año? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el año");
                    año = coso.next();
                    b.Modificar(Camioneta, num, "año", año);
                }  
                System.out.println("Desea Modificar otro auto? (s/n)");
                des = coso.next();
                if (des.equals("s")) {
                    Moodificar(b);;
                }
                menuPrincipal(b);
                break;

            case 2:
                ArrayList<Auto> Suv = new ArrayList<>();
                b.ImprimirLista(Suv);
                System.out.println("Ingrese el número del vehiculo que desea modificar");
                num = coso.nextInt();
                System.out.println("Desea modificar la matricula? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la placa");
                    placa = coso.next();
                    b.Modificar(Suv, num, "placa", placa);
                }
                System.out.println("Desea modificar el color? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el color");
                    color = coso.next();
                    b.Modificar(Suv, num, "color", color);
                }
                System.out.println("Desea modificar la marca? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la marca");
                    marca = coso.next();
                    b.Modificar(Suv, num, "marca", marca);
                }
                System.out.println("Desea modificar el año? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el año");
                    año = coso.next();
                    b.Modificar(Suv, num, "año", año);
                }  
                System.out.println("Desea Modificar otro auto? (s/n)");
                des = coso.next();
                if (des.equals("s")) {
                    Moodificar(b);;
                }
                menuPrincipal(b);
                break;
            case 3:
                ArrayList<Auto> Sedan = new ArrayList<>();
                b.ImprimirLista(Sedan);
                System.out.println("Ingrese el número del vehiculo que desea modificar");
                num = coso.nextInt();
                System.out.println("Desea modificar la matricula? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la placa");
                    placa = coso.next();
                    b.Modificar(Sedan, num, "placa", placa);
                }
                System.out.println("Desea modificar el color? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el color");
                    color = coso.next();
                    b.Modificar(Sedan, num, "color", color);
                }
                System.out.println("Desea modificar la marca? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la marca");
                    marca = coso.next();
                    b.Modificar(Sedan, num, "marca", marca);
                }
                System.out.println("Desea modificar el año? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el año");
                    año = coso.next();
                    b.Modificar(Sedan, num, "año", año);
                }  
                System.out.println("Desea Modificar otro auto? (s/n)");
                des = coso.next();
                if (des.equals("s")) {
                    Moodificar(b);;
                }
                menuPrincipal(b);
                break;
            case 4:
                ArrayList<Auto> Deportivo = new ArrayList<>();
                b.ImprimirLista(Deportivo);
                System.out.println("Ingrese el número del vehiculo que desea modificar");
                num = coso.nextInt();
                System.out.println("Desea modificar la matricula? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la placa");
                    placa = coso.next();
                    b.Modificar(Deportivo, num, "placa", placa);
                }
                System.out.println("Desea modificar el color? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el color");
                    color = coso.next();
                    b.Modificar(Deportivo, num, "color", color);
                }
                System.out.println("Desea modificar la marca? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la marca");
                    marca = coso.next();
                    b.Modificar(Deportivo, num, "marca", marca);
                }
                System.out.println("Desea modificar el año? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el año");
                    año = coso.next();
                    b.Modificar(Deportivo, num, "año", año);
                }  
                System.out.println("Desea Modificar otro auto? (s/n)");
                des = coso.next();
                if (des.equals("s")) {
                    Moodificar(b);;
                }
                menuPrincipal(b);
                break;
            default:
                System.out.println("Dato no valido");
                crearAuto(b);
                break;
        }
    }

    public static void Buscar(GestorAuto b){
        Scanner coso = new Scanner(System.in);
        int dato;
        String des;

        System.out.println("Seleccione el tipo de vehiculo que desea Buscar");
        System.out.println("1.-Camioneta \n2.-Suv \n3.-Sedan \n4.-Deportivo");
        System.out.println("Coloque solo el número de la opcion deseada");
        dato = coso.nextInt();
        switch (dato) {
            case 1:
                ArrayList<Auto> Camioneta = new ArrayList<>();
                System.out.println("ingrese la posicion del auto que desea Buscar");
                dato=coso.nextInt();
                b.Buscar(Camioneta, dato);
                System.out.println("desea Buscar otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    Buscar(b);
                }
                menuPrincipal(b);
                break;

            case 2:
                ArrayList<Auto> Suv = new ArrayList<>();
                System.out.println("ingrese la posicion del auto que desea Buscar");
                dato=coso.nextInt();
                b.Buscar(Suv, dato);
                System.out.println("desea Buscar otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    Buscar(b);
                }
                menuPrincipal(b);
                break;
            case 3:
                ArrayList<Auto> Sedan = new ArrayList<>();
                System.out.println("ingrese la posicion del auto que desea Buscar");
                dato=coso.nextInt();
                b.Buscar(Sedan, dato);
                System.out.println("desea Buscar otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    Buscar(b);
                }
                menuPrincipal(b);
                break;
            case 4:
                ArrayList<Auto> Deportivo = new ArrayList<>();
                System.out.println("ingrese la posicion del auto que desea Buscar");
                dato=coso.nextInt();
                b.Buscar(Deportivo, dato);
                System.out.println("desea Buscar otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    Buscar(b);
                }
                menuPrincipal(b);
                break;
            default:
                System.out.println("Dato no valido");
                crearAuto(b);
                break;
        }
    }
}
