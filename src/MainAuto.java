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
        Scanner coso = new Scanner(System.in);
        String dato;
        System.out.println("======Menú Vehiculos======\n");
        System.out.println(
                "1.-Agregar Auto \n2.-Mostrar Todos los vehiculos \n3.-Modificar un vehiculo \n4.-Buscar un vehiculo\n");
        System.out.println("Seleccione la Opcion que desea ejecutar");
        System.out.println("utilice solo números");
        dato = coso.next();

        switch (dato) {
            case "1":
                crearAuto(b);
                break;

            case "2":
                ImprimirTodo(b);
                break;

            case "3":
                Moodificar(b);
                break;

            case "4":
                Buscar(b);
                break;

            case "5":
                Buscar(b);
                break;
            default:
                System.out.println(
                        "Opcion seleccionada fuera de rango\nPor favor ocupar un numero dentor del rango de opciones\n");
                menuPrincipal(b);
                break;
        }

    }

    public static void crearAuto(GestorAuto b) {
        Scanner coso = new Scanner(System.in);
        String dato;
        String placa, color, marca, año, des, tipo;

        System.out.println("Seleccione el tipo de vehiculo que desea agregar");
        System.out.println("1.-Camioneta \n2.-Suv \n3.-Sedan \n4.-Deportivo");
        System.out.println("Coloque solo el numero de la opcion deseada");
        dato = coso.next();
        switch (dato) {
            case "1":
                tipo = "Camioneta";
                System.out.println("Ingrese la placa");
                placa = coso.next();
                System.out.println("Ingrese el color");
                color = coso.next();
                System.out.println("Ingrese la marca");
                marca = coso.next();
                System.out.println("Ingrese el año");
                año = coso.next();
                Auto camioneta = new Auto(placa, color, marca, año);
                b.InsertarFinal(tipo, camioneta);
                System.out.println("desea agreagr otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    crearAuto(b);
                }
                menuPrincipal(b);
                break;

            case "2":
                tipo = "Suv";
                System.out.println("Ingrese la placa");
                placa = coso.next();
                System.out.println("Ingrese el color");
                color = coso.next();
                System.out.println("Ingrese la marca");
                marca = coso.next();
                System.out.println("Ingrese el año");
                año = coso.next();
                Auto suv = new Auto(placa, color, marca, año);
                b.InsertarFinal(tipo, suv);
                System.out.println("desea agreagr otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    crearAuto(b);
                }
                menuPrincipal(b);
                break;
            case "3":
                tipo = "Sedan";
                System.out.println("Ingrese la placa");
                placa = coso.next();
                System.out.println("Ingrese el color");
                color = coso.next();
                System.out.println("Ingrese la marca");
                marca = coso.next();
                System.out.println("Ingrese el año");
                año = coso.next();
                Auto sedan = new Auto(placa, color, marca, año);
                b.InsertarFinal(tipo, sedan);
                System.out.println("desea agreagr otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    crearAuto(b);
                }
                menuPrincipal(b);
                break;
            case "4":
                tipo = "Deportivo";
                System.out.println("Ingrese la placa");
                placa = coso.next();
                System.out.println("Ingrese el color");
                color = coso.next();
                System.out.println("Ingrese la marca");
                marca = coso.next();
                System.out.println("Ingrese el año");
                año = coso.next();
                Auto deportivo = new Auto(placa, color, marca, año);
                b.InsertarFinal(tipo, deportivo);
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
        int num;
        String dato, tipo;
        String placa, color, marca, año, des, respuesta;
        System.out.println("Seleccione el tipo de vehiculo que quiere modificar");
        System.out.println("1.-Camioneta \n2.-Suv \n3.-Sedan \n4.-Deportivo");
        System.out.println("Coloque solo el numero de la opcion deseada");
        dato = coso.next();
        switch (dato) {
            case "1":
                tipo = "Camioneta";
                b.ImprimirLista(tipo);
                System.out.println("\nIngrese el número del vehiculo que desea modificar");
                num = coso.nextInt();
                System.out.println("Desea modificar la matricula? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la placa");
                    placa = coso.next();
                    b.Modificar(tipo, num, "placa", placa);
                }
                System.out.println("Desea modificar el color? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el color");
                    color = coso.next();
                    b.Modificar(tipo, num, "color", color);
                }
                System.out.println("Desea modificar la marca? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la marca");
                    marca = coso.next();
                    b.Modificar(tipo, num, "marca", marca);
                }
                System.out.println("Desea modificar el año? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el año");
                    año = coso.next();
                    b.Modificar(tipo, num, "año", año);
                }
                System.out.println("Desea Modificar otro auto? (s/n)");
                des = coso.next();
                if (des.equals("s")) {
                    Moodificar(b);
                    ;
                }
                menuPrincipal(b);
                break;

            case "2":
                tipo = "Suv";
                b.ImprimirLista(tipo);
                System.out.println("\nIngrese el número del vehiculo que desea modificar");
                num = coso.nextInt();
                System.out.println("Desea modificar la matricula? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la placa");
                    placa = coso.next();
                    b.Modificar(tipo, num, "placa", placa);
                }
                System.out.println("Desea modificar el color? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el color");
                    color = coso.next();
                    b.Modificar(tipo, num, "color", color);
                }
                System.out.println("Desea modificar la marca? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la marca");
                    marca = coso.next();
                    b.Modificar(tipo, num, "marca", marca);
                }
                System.out.println("Desea modificar el año? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el año");
                    año = coso.next();
                    b.Modificar(tipo, num, "año", año);
                }
                System.out.println("Desea Modificar otro auto? (s/n)");
                des = coso.next();
                if (des.equals("s")) {
                    Moodificar(b);
                    ;
                }
                menuPrincipal(b);
                break;

            case "3":
                tipo = "Sedan";
                b.ImprimirLista(tipo);
                System.out.println("\nIngrese el número del vehiculo que desea modificar");
                num = coso.nextInt();
                System.out.println("Desea modificar la matricula? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la placa");
                    placa = coso.next();
                    b.Modificar(tipo, num, "placa", placa);
                }
                System.out.println("Desea modificar el color? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el color");
                    color = coso.next();
                    b.Modificar(tipo, num, "color", color);
                }
                System.out.println("Desea modificar la marca? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la marca");
                    marca = coso.next();
                    b.Modificar(tipo, num, "marca", marca);
                }
                System.out.println("Desea modificar el año? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el año");
                    año = coso.next();
                    b.Modificar(tipo, num, "año", año);
                }
                System.out.println("Desea Modificar otro auto? (s/n)");
                des = coso.next();
                if (des.equals("s")) {
                    Moodificar(b);
                    ;
                }
                menuPrincipal(b);
                break;

            case "4":
                tipo = "Deportivo";
                b.ImprimirLista(tipo);
                System.out.println("\nIngrese el número del vehiculo que desea modificar");
                num = coso.nextInt();
                System.out.println("Desea modificar la matricula? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la placa");
                    placa = coso.next();
                    b.Modificar(tipo, num, "placa", placa);
                }
                System.out.println("Desea modificar el color? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el color");
                    color = coso.next();
                    b.Modificar(tipo, num, "color", color);
                }
                System.out.println("Desea modificar la marca? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese la marca");
                    marca = coso.next();
                    b.Modificar(tipo, num, "marca", marca);
                }
                System.out.println("Desea modificar el año? (s/n)");
                respuesta = coso.next().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Ingrese el año");
                    año = coso.next();
                    b.Modificar(tipo, num, "año", año);
                }
                System.out.println("Desea Modificar otro auto? (s/n)");
                des = coso.next();
                if (des.equals("s")) {
                    Moodificar(b);
                    ;
                }
                menuPrincipal(b);
                break;
        }
    }

    public static void Buscar(GestorAuto b) {
        Scanner coso = new Scanner(System.in);
        String op;
        String des, tipo;
        int dato;
        System.out.println("Seleccione el tipo de vehiculo que desea Buscar");
        System.out.println("1.-Camioneta \n2.-Suv \n3.-Sedan \n4.-Deportivo");
        System.out.println("Coloque solo el número de la opcion deseada");
        op = coso.next();
        switch (op) {
            case "1":
                tipo = "Camioneta";
                System.out.println("ingrese la posicion del auto que desea Buscar");
                dato = coso.nextInt();
                b.Buscar(tipo, dato);
                System.out.println("desea Buscar otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    Buscar(b);
                }
                menuPrincipal(b);
                break;

            case "2":
                tipo = "Suv";
                System.out.println("ingrese la posicion del auto que desea Buscar");
                dato = coso.nextInt();
                b.Buscar(tipo, dato);
                System.out.println("desea Buscar otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    Buscar(b);
                }
                menuPrincipal(b);
                break;
            case "3":
                tipo = "Sedan";
                System.out.println("ingrese la posicion del auto que desea Buscar");
                dato = coso.nextInt();
                b.Buscar(tipo, dato);
                System.out.println("desea Buscar otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    Buscar(b);
                }
                menuPrincipal(b);
                break;
            case "4":
                tipo = "Deportivo";
                System.out.println("ingrese la posicion del auto que desea Buscar");
                dato = coso.nextInt();
                b.Buscar(tipo, dato);
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

    public static void Borrar(GestorAuto b){
        Scanner coso = new Scanner(System.in);
        int num;
        String dato, tipo;
        String placa, color, marca, año, des, respuesta;
        System.out.println("Seleccione el tipo de vehiculo que quiere Eliminar");
        System.out.println("1.-Camioneta \n2.-Suv \n3.-Sedan \n4.-Deportivo");
        System.out.println("Coloque solo el numero de la opcion deseada");
        dato = coso.next();
        switch (dato) {
            case "1":
                tipo = "Camioneta";
                b.ImprimirLista(tipo);
                System.out.println("\nIngrese el número del vehiculo que desea Eliminar");
                num = coso.nextInt();
                b.Eliminarporpos(tipo, num);
                System.out.println("Desea eliminar otro vehiculo? (s/n)");
                des=coso.next().toUpperCase();
                if(des=="S"){
                    Borrar(b);
                }
                menuPrincipal(b);
                break;

            case "2":
                tipo = "Suv";
                b.ImprimirLista(tipo);
                System.out.println("\nIngrese el número del vehiculo que desea Eliminar");
                num = coso.nextInt();
                b.Eliminarporpos(tipo, num);
                System.out.println("Desea eliminar otro vehiculo? (s/n)");
                des=coso.next().toUpperCase();
                if(des=="S"){
                    Borrar(b);
                }
                menuPrincipal(b);
                break;

            case "3":
                tipo = "Sedan";
                b.ImprimirLista(tipo);
                System.out.println("\nIngrese el número del vehiculo que desea Eliminar");
                num = coso.nextInt();
                b.Eliminarporpos(tipo, num);
                System.out.println("Desea eliminar otro vehiculo? (s/n)");
                des=coso.next().toUpperCase();
                if(des=="S"){
                    Borrar(b);
                }
                menuPrincipal(b);
                break;

            case "4":
                tipo = "Deportivo";
                b.ImprimirLista(tipo);
                System.out.println("\nIngrese el número del vehiculo que desea Eliminar");
                num = coso.nextInt();
                b.Eliminarporpos(tipo, num);
                System.out.println("Desea eliminar otro vehiculo? (s/n)");
                des=coso.next().toUpperCase();
                if(des=="S"){
                    Borrar(b);
                }
                menuPrincipal(b);
                break;
        }
    }
}
