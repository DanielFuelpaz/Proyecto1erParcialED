import Utiles.Validacion;

import java.util.ArrayList;
import java.util.Scanner;

import Clases.Auto;
import Clases.Tipo;
import Gestion.GestionVehiculos;

public class MainAuto {
    public static void main(String[] args) {
        ArrayList<Tipo> catalogo=new ArrayList<>();
        menuPrincipal(catalogo);
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

    public static void menuPrincipal(ArrayList<Tipo> catalogo) {
        GestionVehiculos a=new GestionVehiculos();
        Scanner coso = new Scanner(System.in);
        String dato;
        System.out.println("======Menú Vehiculos======\n");
        System.out.println(
                "1.-Agregar Tipo \n2.-Agregar Auto \n3.-Mostrar Todos los vehiculos \n4.-Buscar un vehiculo\n5.-Borrar un vehiculo\n");
        System.out.println("Seleccione la Opcion que desea ejecutar");
        System.out.println("utilice solo números");
        dato = coso.next();

        switch (dato) {
            case "1":
                crearTipo(a,catalogo);
                break;
            case "2":
                crearAuto(a,catalogo);
                break;

            case "3":
                ImprimirTodo(a,catalogo);
                break;

            /*case "4":
                Buscar();
                break;

            case "5":
                Borrar(b);
                ;
                break;*/
            default:
                System.out.println(
                        "Opcion seleccionada fuera de rango\nPor favor ocupar un numero dentor del rango de opciones\n");
                menuPrincipal(catalogo);
                break;
        }

    }

    public static boolean crearTipo(GestionVehiculos a,ArrayList<Tipo> catalogo){
        ArrayList<Auto> lista=new ArrayList<>();
        Scanner coso = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese un tipo de vehiculo");
        nombre=coso.next();
        if(a.crearTipo(nombre, lista)==null){
            return crearTipo(a, catalogo);
        }
        else{
            catalogo.add(a.crearTipo(nombre, lista));
            menuPrincipal(catalogo);
        }
        return false;
    }
    public static boolean crearAuto(GestionVehiculos a,ArrayList<Tipo> catalogo) {
        Scanner coso = new Scanner(System.in);
        String placa, color, marca, año;
        System.out.println("Ingrese la placa del Automovil");
        placa=coso.next();
        System.out.println("Ingrese el Color del Automovil");
        color=coso.next();
        System.out.println("Ingrese la marca del Automovil");
        marca=coso.next();
        System.out.println("Ingrese el año del Automovil");
        año=coso.next();
        
        menuPrincipal(a.cearVehiculo(placa, color, marca, año, catalogo));
        return true; 
    }
    public static boolean ImprimirTodo(GestionVehiculos a,ArrayList<Tipo> catalogo){
        return a.ImprimirTodo(catalogo);
        
    }
    public static void Buscar(Tipo b) {
        Validacion validacion = new Validacion();
        Scanner coso = new Scanner(System.in);
        boolean estado = false;
        String op;
        String des, tipo;
        int dato;
        String val;
        System.out.println("Seleccione el tipo de vehiculo que desea Buscar");
        System.out.println("1.-Camioneta \n2.-Suv \n3.-Sedan \n4.-Deportivo");
        System.out.println("Coloque solo el número de la opcion deseada");
        op = coso.next();
        switch (op) {
            case "1":
                tipo = "Camioneta";
                do {
                    System.out.println("Ingrese la posicion del auto que desea Buscar");
                    val = coso.next();
                    if (validacion.validarNúmero(val)) {
                        dato = Integer.parseInt(val);
                        b.Buscar(tipo, dato);
                        estado = true;
                    } else {
                        System.out.println("Dato no valido.\nProfavor ingrese un Dato válido");
                    }

                } while (estado == false);
                System.out.println("desea Buscar otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    Buscar(b);
                }
                menuPrincipal(b);
                break;

            case "2":
                tipo = "Suv";
                do {
                    System.out.println("Ingrese la posicion del auto que desea Buscar");
                    val = coso.next();
                    if (validacion.validarNúmero(val)) {
                        dato = Integer.parseInt(val);
                        b.Buscar(tipo, dato);
                        estado = true;
                    } else {
                        System.out.println("Dato no valido.\nProfavor ingrese un Dato válido");
                    }

                } while (estado == false);
                System.out.println("desea Buscar otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    Buscar(b);
                }
                menuPrincipal(b);
                break;
            case "3":
                tipo = "Sedan";
                do {
                    System.out.println("Ingrese la posicion del auto que desea Buscar");
                    val = coso.next();
                    if (validacion.validarNúmero(val)) {
                        dato = Integer.parseInt(val);
                        b.Buscar(tipo, dato);
                        estado = true;
                    } else {
                        System.out.println("Dato no valido.\nProfavor ingrese un Dato válido");
                    }

                } while (estado == false);
                System.out.println("desea Buscar otro auto? (s/n)");
                des = coso.next().toUpperCase();
                if (des.equals("S")) {
                    Buscar(b);
                }
                menuPrincipal(b);
                break;
            case "4":
                tipo = "Deportivo";
                do {
                    System.out.println("Ingrese la posicion del auto que desea Buscar");
                    val = coso.next();
                    if (validacion.validarNúmero(val)) {
                        dato = Integer.parseInt(val);
                        b.Buscar(tipo, dato);
                        estado = true;
                    } else {
                        System.out.println("Dato no valido.\nProfavor ingrese un Dato válido");
                    }

                } while (estado == false);
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

    public static void Borrar(Tipo b) {
        Validacion validacion = new Validacion();
        Scanner coso = new Scanner(System.in);
        int num;
        boolean estado = false;
        String dato, tipo;
        String placa, color, marca, año, des, respuesta, val;
        System.out.println("Seleccione el tipo de vehiculo que quiere Eliminar");
        System.out.println("1.-Camioneta \n2.-Suv \n3.-Sedan \n4.-Deportivo");
        System.out.println("Coloque solo el numero de la opcion deseada");
        dato = coso.next();
        switch (dato) {
            case "1":
                tipo = "Camioneta";
                b.ImprimirLista(tipo);
                do {
                    System.out.println("Ingrese la posicion del auto que desea Eliminar");
                    val = coso.next();
                    if (validacion.validarNúmero(val)) {
                        num = Integer.parseInt(val);
                        b.Eliminarporpos(tipo, num);
                        estado = true;
                    } else {
                        System.out.println("Dato no valido.\nProfavor ingrese un Dato válido");
                    }

                } while (estado == false);
                System.out.println("Desea eliminar otro vehiculo? (s/n)");
                des = coso.next().toUpperCase();
                if (des == "S") {
                    Borrar(b);
                }
                menuPrincipal(b);
                break;

            case "2":
                tipo = "Suv";
                b.ImprimirLista(tipo);
                do {
                    System.out.println("Ingrese la posicion del auto que desea Eliminar");
                    val = coso.next();
                    if (validacion.validarNúmero(val)) {
                        num = Integer.parseInt(val);
                        b.Eliminarporpos(tipo, num);
                        estado = true;
                    } else {
                        System.out.println("Dato no valido.\nProfavor ingrese un Dato válido");
                    }

                } while (estado == false);
                System.out.println("Desea eliminar otro vehiculo? (s/n)");
                des = coso.next().toUpperCase();
                if (des == "S") {
                    Borrar(b);
                }
                menuPrincipal(b);
                break;

            case "3":
                tipo = "Sedan";
                b.ImprimirLista(tipo);
                do {
                    System.out.println("Ingrese la posicion del auto que desea Eliminar");
                    val = coso.next();
                    if (validacion.validarNúmero(val)) {
                        num = Integer.parseInt(val);
                        b.Eliminarporpos(tipo, num);
                        estado = true;
                    } else {
                        System.out.println("Dato no valido.\nProfavor ingrese un Dato válido");
                    }

                } while (estado == false);
                System.out.println("Desea eliminar otro vehiculo? (s/n)");
                des = coso.next().toUpperCase();
                if (des == "S") {
                    Borrar(b);
                }
                menuPrincipal(b);
                break;

            case "4":
                tipo = "Deportivo";
                b.ImprimirLista(tipo);
                do {
                    System.out.println("Ingrese la posicion del auto que desea Eliminar");
                    val = coso.next();
                    if (validacion.validarNúmero(val)) {
                        num = Integer.parseInt(val);
                        b.Eliminarporpos(tipo, num);
                        estado = true;
                    } else {
                        System.out.println("Dato no valido.\nProfavor ingrese un Dato válido");
                    }

                } while (estado == false);
                System.out.println("Desea eliminar otro vehiculo? (s/n)");
                des = coso.next().toUpperCase();
                if (des == "S") {
                    Borrar(b);
                }
                menuPrincipal(b);
                break;
        }
    }
}
