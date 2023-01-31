import Utiles.Validacion;

import java.util.ArrayList;
import java.util.Scanner;

import Clases.Auto;
import Clases.Tipo;
import Gestion.GestionVehiculos;

public class MainAuto {

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
}
