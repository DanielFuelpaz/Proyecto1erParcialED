package Clases;

import java.util.ArrayList;

import Gestion.GestionCompra;
import Gestion.GestionVehiculos;
import Gestion.GestorClientes;
import Utiles.Interfaz;
import Utiles.Validacion;

public class Concesionario {
    public static void main(String[] args) {
        ArrayList<Auto> auto = new ArrayList<>();
        GestorClientes GClientes = new GestorClientes();
        GestionCompra GCompras = new GestionCompra(auto);
        GestionVehiculos GVehiculos = new GestionVehiculos();
        Interfaz consola = new Interfaz();
        Concesionario c = new Concesionario();
        consola.imprimir("Bienvenido al Concesionario FISEI");
        String masClientes = "";
        Validacion validar = new Validacion();
        String respuesta1;
        do {

            consola.imprimir(
                    """
                                    Elija lo que desea hacer:
                                    1:Manipulación de clientes y carros
                                    2: Clientes interesados en un modelo/marca de carro dado cuya última compra no sea de los últimos tres años.
                                    3:  Historial de un cliente
                                    4: Carros vendidos en un margen de tiempo dado (fecha inicial a fecha final). Incluir en este informe estadísticas de cantidad de carros y valor total facturado
                                    5: Salir
                            """);
            respuesta1 = consola.ingresar();
            switch (respuesta1) {
                case "1":
                    String respuesta2;
                    do {
                        consola.imprimir(
                                "Elija lo que quiere hacer del cliente: \n1: Crear cliente. \n2: Ver vehículos. \n3: Eliminar vehículos de interés. \n4:Comprar vehículo(s). \n5:Ir al menú principal");
                        respuesta2 = consola.ingresar();
                        switch (respuesta2) {
                            case "1":
                                do {
                                    Cliente c1;
                                    consola.imprimir("Ingrese un cliente \n -----------------1");
                                    String cédula = "";
                                    do {
                                        consola.imprimir("Ingrese la cédula del cliente");
                                        cédula = consola.ingresar();
                                    } while (!validar.validarCedula(cédula, GClientes));
                                    String nombre = "";
                                    do {
                                        consola.imprimir("Ingrese el nombre del cliente");
                                        nombre = consola.ingresar();
                                    } while (!validar.validarPersona(nombre));

                                    String apellido = "";
                                    do {
                                        consola.imprimir("Ingrese el apellido del cliente");
                                        apellido = consola.ingresar();
                                    } while (!validar.validarPersona(apellido));
                                    String teléfono = "";
                                    do {
                                        consola.imprimir("Ingrese el teléfono del cliente");
                                        teléfono = consola.ingresar();
                                    } while (!validar.validarTelefono(teléfono, GClientes));
                                    consola.imprimir("Ingrese la dirección del cliente");
                                    String direccion = consola.ingresar();
                                    c1 = new Cliente(cédula, nombre, apellido, teléfono, direccion);
                                    c1.historial.add(new Visita());
                                    GClientes.clientes.add(c1);
                                    do {
                                        consola.imprimir("¿Desea ingresar más clientes? \n Si:si N:no");
                                        masClientes = consola.ingresar();
                                    } while (!(masClientes.equalsIgnoreCase("Si")
                                            || masClientes.equalsIgnoreCase("No")));
                                } while (masClientes.equalsIgnoreCase("Si"));

                                break;
                            case "2":
                                // Presenta los vehículos al cliente según sus necesidades, se agrega el
                                // vehículo de interés a la lista de visita. (Carlos usa
                                // cliente.historial.get(i).autosDeInterés;)
                                break;
                            case "3":
                                // Elimina un carro de la lista de interés de visita
                                break;
                            case "4":
                                // Compra los vehículos de la lista de interés.
                                break;
                            case "5":
                                respuesta2 = "5";
                                break;
                            default:
                                consola.imprimir("Elija un número del 1 al 5");
                                break;
                        }
                    } while (respuesta2 != "5");
                    break;
                case "2":
                    //
                    break;

                case "3":
                    break;
                case "4":

                    break;
                case "5":
                    respuesta1 = "5";
                    break;
                default:
                    consola.imprimir("Escoja un número del 1 al 5");
                    break;

            }
            // Para saber que ya salio preguntar si desea comprar o no.

        } while (respuesta1 != "5");
    }
}
