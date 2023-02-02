package Clases;

import java.util.ArrayList;

import Gestion.GestionCompra;
import Gestion.GestionVehiculos;
import Gestion.GestorClientes;
import Utiles.Interfaz;
import Utiles.Validacion;

public class Concesionario {
    public static void main(String[] args) {
        GestorClientes GClientes = new GestorClientes();
        GestionCompra GCompras = new GestionCompra();
        GestionVehiculos GVehiculos = new GestionVehiculos();
        Validacion r = new Validacion();
        Interfaz consola = new Interfaz();
        consola.imprimir("Bienvenido al Concesionario FISEI");
        String masClientes = "";
        String respuesta1;
        do {

            consola.imprimir(
                    """
                            Elija lo que desea hacer:
                            1:Manipulación de clientes.
                            2:Manipulación de autos.
                            3:Clientes interesados en un modelo/marca de carro dado cuya última compra no sea de los últimos tres años.
                            4:Historial de un cliente
                            5:Carros vendidos en un margen de tiempo dado (fecha inicial a fecha final).
                            Incluir en este informe estadísticas de cantidad de carros y valor total facturado
                            6: Salir
                            """);
            respuesta1 = consola.ingresar();
            switch (respuesta1) {
                case "1":
                    String respuesta2;
                    do {
                        consola.imprimir("""
                                Elija lo que quiere hacer del cliente:
                                1: Crear cliente.
                                2: Modificar cliente.
                                3: Eliminar cliente.
                                4: Buscar clientes.
                                5: Listar clientes.
                                6: Añadir visita.
                                7: Salir al menú.
                                """);
                        respuesta2 = consola.ingresar();
                        switch (respuesta2) {
                            case "1":
                                do {
                                    Cliente c1 = null;
                                    GClientes.clientes.add(GClientes.crearCliente(c1));
                                    do {
                                        consola.imprimir("¿Desea ingresar más clientes? \n Si:si N:no");
                                        masClientes = consola.ingresar();
                                    } while (!(masClientes.equalsIgnoreCase("Si")
                                            || masClientes.equalsIgnoreCase("No")));
                                } while (masClientes.equalsIgnoreCase("Si"));

                                break;
                            case "2":
                                GClientes.Listar();
                                GClientes.modificarCliente();

                                break;
                            case "3":
                                GClientes.eliminarCliente();

                                break;
                            case "4":
                                GClientes.Listar();
                                consola.imprimir(GClientes.buscarCliente().toString());
                                break;
                            case "5":
                                GClientes.Listar();
                                break;
                            case "6":
                                GClientes.Listar();
                                consola.imprimir(
                                        "Ingrese el número del cliente del que desea agregar una nueva visita");
                                int numCliente = consola.ingresarEntero();
                                GClientes.clientes.get(numCliente - 1).historial.add(new Visita());
                                break;
                            default:
                                consola.imprimir("Elija un número del 1 al 7");
                                break;
                        }
                    } while (respuesta2.equals("7"));
                    break;
                case "2":
                    String respuestaCaso2;
                    String num = "";
                    String num2 = "";
                    do {
                        consola.imprimir("""
                                Elija lo que quiere hacer con el auto.
                                1:Crear Tipo
                                2:Crear Vehiculo
                                3:Ver vehículos.
                                4:Eliminar vehículos de interés.
                                5:Comprar vehículo(s).
                                6:Ir al menú principal
                                """);
                        respuestaCaso2 = consola.ingresar();
                        switch (respuestaCaso2) {
                            case "1":
                                do {
                                    GVehiculos.crearTipo();
                                    do {
                                        consola.imprimir(
                                                "¿Desea agrgar otro tipo de vehículo? \n Si:si N:no");
                                        masClientes = consola.ingresar();
                                    } while (!(masClientes.equalsIgnoreCase("Si")
                                            || masClientes.equalsIgnoreCase("No")));
                                } while (masClientes.equalsIgnoreCase("Si"));

                                break;
                            case "2":
                                do {
                                    GVehiculos.cearVehiculo();
                                    do {
                                        consola.imprimir(
                                                "¿Desea agrgar otro de vehículo? \n Si:si N:no");
                                        masClientes = consola.ingresar();
                                    } while (!(masClientes.equalsIgnoreCase("Si")
                                            || masClientes.equalsIgnoreCase("No")));
                                } while (masClientes.equalsIgnoreCase("Si"));

                                break;
                            case "3":
                                if (GClientes.clientes.isEmpty()) {
                                    consola.imprimir("No existen clientes");
                                    break;
                                }
                                GClientes.Listar();
                                do {
                                    consola.imprimir("Ingrese el numero de cliente que desea ver la visita");
                                    num = consola.ingresar();
                                    if (!r.validarNúmero(num)) {
                                        consola.imprimir("Solo se permiten valores númericos");
                                    }
                                } while (!r.validarNúmero(num));
                                for (int i = 0; i < GClientes.clientes.get(Integer.parseInt(num)).historial
                                        .size(); i++) {
                                    consola.imprimir(
                                            (i + 1) + ": " + GClientes.clientes.get(Integer.parseInt(num)).historial
                                                    .get(i).fechaVisita);
                                }
                                do {
                                    consola.imprimir("Ingrese el numero de la visita que desea registar los vehiculos");
                                    num2 = consola.ingresar();
                                    if (!r.validarNúmero(num2)) {
                                        consola.imprimir("Solo se permiten valores númericos");
                                    }
                                } while (!r.validarNúmero(num2));

                                do {
                                    GClientes.clientes.get(Integer.parseInt(num)).historial
                                            .get(Integer.parseInt(num2)).autosDeInterés
                                            .add(GVehiculos.AgregsrAListaDeInteres());
                                    do {
                                        consola.imprimir(
                                                "¿Desea agrgar mas vehiculos a la lista de interes? \n Si:si N:no");
                                        masClientes = consola.ingresar();
                                    } while (!(masClientes.equalsIgnoreCase("Si")
                                            || masClientes.equalsIgnoreCase("No")));
                                } while (masClientes.equalsIgnoreCase("Si"));
                                // Presenta los vehículos al cliente según sus necesidades, se agrega el
                                // vehículo de interés a la lista de visita.
                                // (Carlos usa cliente.historial.get(i).autosDeInterés;)
                                break;
                            case "4":
                                if (GClientes.clientes.isEmpty()) {
                                    consola.imprimir("No existen clientes");
                                    break;
                                }
                                GClientes.Listar();
                                do {
                                    consola.imprimir("Ingrese el numero de cliente que desea ver la visita");
                                    num = consola.ingresar();
                                    if (!r.validarNúmero(num)) {
                                        consola.imprimir("Solo se permiten valores númericos");
                                    }
                                } while (!r.validarNúmero(num));
                                for (int i = 0; i < GClientes.clientes.get(Integer.parseInt(num)).historial
                                        .size(); i++) {
                                    consola.imprimir(
                                            (i + 1) + ": " + GClientes.clientes.get(Integer.parseInt(num)).historial
                                                    .get(i).fechaVisita);
                                }
                                do {
                                    consola.imprimir("Ingrese el numero de la visita que desea registar los vehiculos");
                                    num2 = consola.ingresar();
                                    if (!r.validarNúmero(num2)) {
                                        consola.imprimir("Solo se permiten valores númericos");
                                    }
                                } while (!r.validarNúmero(num2));
                                // Elimina un carro de la lista de interés de visita
                                do {
                                    GClientes.clientes.get(Integer.parseInt(num)).historial
                                            .get(Integer.parseInt(num2)).autosDeInterés
                                            .remove(GVehiculos.BorrarVehiculoInteres(
                                                    GClientes.clientes.get(Integer.parseInt(num)).historial
                                                            .get(Integer.parseInt(num2)).autosDeInterés));
                                    do {
                                        consola.imprimir( "¿Desea eliminar otro vehiculos de la lista de interes? \n Si:si N:no");
                                        masClientes = consola.ingresar();
                                    } while (!(masClientes.equalsIgnoreCase("Si")
                                            || masClientes.equalsIgnoreCase("No")));
                                } while (masClientes.equalsIgnoreCase("Si"));

                                break;
                            case "5":
                                consola.imprimir("---------Compras------");
                                GCompras.crearCompra(GClientes);

                                break;
                            default:
                                consola.imprimir("Ingrese un número del 1 al 4");
                                break;
                        }
                    } while (!respuestaCaso2.equals("4"));
                    break;

                case "3":
                    // Historial de un cliente
                    GClientes.Listar();
                    GClientes.buscarAutosInteres();
                    consola.imprimir("Ingrese el número del cliente del que desea saber su historial");
                    int numCliente = consola.ingresarEntero();
                    consola.imprimir("Historial del cliente " + numCliente);
                    for (int index = 0; index < GClientes.clientes.get(numCliente - 1).historial.size(); index++) {
                        consola.imprimir("Visita: " + (index + 1));
                        consola.imprimir("Fecha:" + String.valueOf(
                                GClientes.clientes.get(numCliente - 1).historial.get(index).fechaVisita + "\n"));
                        consola.imprimir("Autos de Interés:"
                                + GClientes.clientes.get(numCliente - 1).historial.get(index).autosDeInterés
                                        .toString());
                    }
                    break;
                case "4":

                    break;
                case "5":
                    break;
                case "6":
                    break;
                default:
                    consola.imprimir("Escoja un número del 1 al 5");
                    break;

            }
            // Para saber que ya salio preguntar si desea comprar o no.

        } while (respuesta1 != "6");
    }
}
