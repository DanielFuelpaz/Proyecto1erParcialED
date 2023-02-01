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
        ArrayList<Auto> listacompras = new ArrayList<>();
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

                                    // consola.imprimir("Ingrese un cliente \n -----------------");
                                    // String cédula = "";
                                    // do {
                                    // consola.imprimir("Ingrese la cédula del cliente");
                                    // cédula = consola.ingresar();
                                    // } while (!validar.validarCedula(cédula, GClientes));
                                    // String nombre = "";
                                    // do {
                                    // consola.imprimir("Ingrese el nombre del cliente");
                                    // nombre = consola.ingresar();
                                    // } while (!validar.validarPersona(nombre));

                                    // String apellido = "";
                                    // do {
                                    // consola.imprimir("Ingrese el apellido del cliente");
                                    // apellido = consola.ingresar();
                                    // } while (!validar.validarPersona(apellido));
                                    // String teléfono = "";
                                    // do {
                                    // consola.imprimir("Ingrese el teléfono del cliente");
                                    // teléfono = consola.ingresar();
                                    // } while (!validar.validarTelefono(teléfono, GClientes));
                                    // consola.imprimir("Ingrese la dirección del cliente");
                                    // String direccion = consola.ingresar();
                                    // c1 = new Cliente(cédula, nombre, apellido, teléfono, direccion);
                                    // c1.historial.add(new Visita());
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
                                // consola.imprimir("Elija el número del cliente que desea modificar");
                                // int numClienteModificar;
                                // do {
                                // numClienteModificar = consola.ingresarEntero();
                                // } while (numClienteModificar > GClientes.clientes.size());

                                // consola.imprimir(
                                // "Ingrese lo que desea modificar del cliente: \n 1:Modificar cédula \n
                                // 2:Modificar nombre \n 3:Modificar apellido \n 4:Modificar teléfono \n
                                // 5:Modificar dirección \n 6:Salir");
                                // int AModificar = consola.ingresarEntero();
                                // switch (AModificar) {
                                // case 1:
                                // consola.imprimir("Ingrese la nueva cédula");
                                // GClientes.clientes.get(numClienteModificar - 1).cedula = consola.ingresar();
                                // break;
                                // case 2:
                                // consola.imprimir("Ingrese el nuevo nombre");
                                // GClientes.clientes.get(numClienteModificar - 1).nombre = consola.ingresar();
                                // break;
                                // case 3:
                                // consola.imprimir("Ingrese el nuevo apellido");
                                // GClientes.clientes.get(numClienteModificar - 1).apellido =
                                // consola.ingresar();
                                // break;
                                // case 4:
                                // consola.imprimir("Ingrese el nuevo teléfono");
                                // GClientes.clientes.get(numClienteModificar - 1).telefono =
                                // consola.ingresar();
                                // break;
                                // case 5:
                                // consola.imprimir("Ingrese la nueva dirección");
                                // GClientes.clientes.get(numClienteModificar - 1).dirección =
                                // consola.ingresar();
                                // break;
                                // case 6:
                                // break;
                                // default:
                                // consola.imprimir("Opcion no valida");
                                // break;
                                // }
                                break;
                            case "3":
                                GClientes.eliminarCliente();
                                // if (GClientes.clientes.size() != 0) {
                                // GClientes.Listar();
                                // consola.imprimir("Elija el número del cliente que desea eliminar");
                                // int numClienteCambio;
                                // do {
                                // numClienteCambio = consola.ingresarEntero();
                                // } while (numClienteCambio - 1 > GClientes.clientes.size()
                                // || numClienteCambio - 1 <= 0);
                                // GClientes.clientes.remove(numClienteCambio - 1);
                                // GClientes.Listar();
                                // } else {
                                // consola.imprimir("Debe crear un cliente primero");
                                // }
                                break;
                            case "4":
                                GClientes.Listar();
                                GClientes.buscarCliente();
                                // int n;
                                // do {
                                // consola.imprimirS("Elija el número del cliente que desea buscar: ");
                                // n = consola.ingresarEntero();
                                // } while (n < 0 || n > GClientes.clientes.size());
                                // consola.imprimir(GClientes.clientes.get(n - 1).toString());
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
                                1: Ver vehículos.
                                2: Eliminar vehículos de interés.
                                3:Comprar vehículo(s).
                                4:Ir al menú principal
                                """);
                        respuestaCaso2 = consola.ingresar();
                        switch (respuestaCaso2) {
                            case "1":
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
                            case "2":
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
                                                    GClientes.clientes.get(0).historial.get(0).autosDeInterés));
                                    do {
                                        consola.imprimir(
                                                "¿Desea eliminar otro vehiculos de la lista de interes? \n Si:si N:no");
                                        masClientes = consola.ingresar();
                                    } while (!(masClientes.equalsIgnoreCase("Si")
                                            || masClientes.equalsIgnoreCase("No")));
                                } while (masClientes.equalsIgnoreCase("Si"));

                                break;
                            case "3":

                                GCompras.compraVehiculo(GClientes.clientes.get(0).historial.get(0).autosDeInterés);

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
                    consola.imprimir("Ingrese el número del cliente del que desea saber su historial");
                    int numCliente = consola.ingresarEntero();
                    consola.imprimir("Historial del cliente " + numCliente);
                    for (int index = 0; index < GClientes.clientes.get(numCliente - 1).historial.size(); index++) {
                        consola.imprimir("Visita: " + index + 1);
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
