package Clases;

import java.time.LocalDate;
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
        Fecha fecha=new Fecha();
        consola.imprimir("Bienvenido al Concesionario FISEI");
        String masClientes = "";
        int op;
        do {
            consola.imprimir(
                    """
                            Elija lo que desea hacer:
                            1:Manipulación de clientes.
                            2:Manipulación de autos.
                            3:Historial de un cliente
                            4:Clientes interesados en un modelo/marca de carro dado cuya última compra no sea de los últimos tres años.
                            5:Carros vendidos en un margen de tiempo dado (fecha inicial a fecha final).
                            Incluir en este informe estadísticas de cantidad de carros y valor total facturado
                            6: Salir
                            """);
            op = r.validarOpcion();

            switch (op) {
                case 1:
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
                                        consola.imprimir("¿Desea ingresar más clientes? \n Si/No");
                                        masClientes = consola.ingresar();
                                    } while (!(masClientes.equalsIgnoreCase("Si")
                                            || masClientes.equalsIgnoreCase("No")));
                                } while (masClientes.equalsIgnoreCase("Si"));

                                break;
                            case "2":
                                GClientes.Listar();
                                GClientes.modificarCliente();
                                GClientes.Listar();
                                break;
                            case "3":
                                GClientes.eliminarCliente();

                                break;
                            case "4":
                                GClientes.Listar();
                                try {
                                    consola.imprimir("Datos del cliente:");
                                    consola.imprimir(GClientes.buscarCliente().toString());
                                } catch (Exception e) {
                                    consola.imprimir("La lista está vacía");
                                }
                                break;
                            case "5":
                                GClientes.Listar();
                                break;
                            case "6":
                                GClientes.Listar();
                                if (GClientes.clientes.size() > 0) {
                                    consola.imprimir(
                                            "Ingrese el número del cliente del que desea agregar una nueva visita");

                                    int numCliente = consola.ingresarEntero();
                                    GClientes.clientes.get(numCliente - 1).historial.add(new Visita());
                                } else {
                                    consola.imprimir("No existen clientes, primero debe crear uno");
                                }

                                break;

                            case "7":
                                break;
                            default:
                                consola.imprimir("Elija un número del 1 al 7");
                                break;
                        }
                    } while (!respuesta2.equals("7"));
                    break;
                case 2:
                    String respuestaCaso2;
                    String num = "";
                    String num2 = "";
                    do {
                        consola.imprimir("""
                                Elija lo que quiere hacer con el auto.
                                1:Crear Tipo
                                2:Crear Vehiculo
                                3:Ver vehículos.
                                4:Agregar vehiculos a la lista de interes
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
                                                "¿Desea agregar otro tipo de vehículo? \n Si:si N:no");
                                        masClientes = consola.ingresar();
                                    } while (!(masClientes.equalsIgnoreCase("Si")
                                            || masClientes.equalsIgnoreCase("No")));
                                } while (masClientes.equalsIgnoreCase("Si"));

                                break;

                            case "2":
                                do {
                                    GVehiculos.crearVehiculo();
                                    do {
                                        consola.imprimir(
                                                "¿Desea agregar otro de vehículo? \n Si:si N:no");
                                        masClientes = consola.ingresar();
                                    } while (!(masClientes.equalsIgnoreCase("Si")
                                            || masClientes.equalsIgnoreCase("No")));
                                } while (masClientes.equalsIgnoreCase("Si"));
                                break;

                            case "3":
                                GVehiculos.ImprimirTodo();
                                break;

                            case "4":
                                if (GClientes.clientes.isEmpty()) {
                                    consola.imprimir("No existen clientes para poder agregar a sus listas de interes");
                                    break;
                                }
                                GClientes.Listar();
                                do {
                                    do {
                                        consola.imprimir("Ingrese el numero de cliente que desea ver la visita");
                                        num = consola.ingresar();
                                        if (!r.validarNúmero(num)) {
                                            consola.imprimir("Solo se permiten valores númericos");
                                        }
                                    } while (!r.validarNúmero(num));
                                    if (Integer.parseInt(num) > GClientes.clientes.size()
                                            || Integer.parseInt(num) <= 0) {
                                        consola.imprimir("El valor ingresado está fuera del rango de opciones");
                                        num = "ª";
                                    }

                                } while (!r.validarNúmero(num));
                                for (int i = 0; i < GClientes.clientes.get(Integer.parseInt(num) - 1).historial
                                        .size(); i++) {
                                    consola.imprimir(
                                            (i + 1) + ": " + GClientes.clientes.get(Integer.parseInt(num) - 1).historial
                                                    .get(i).fechaVisita);
                                }
                                do {
                                    do {
                                        consola.imprimir(
                                                "Ingrese el número de la visita que desea registar los vehiculos");
                                        num2 = consola.ingresar();
                                        if (!r.validarNúmero(num2)) {
                                            consola.imprimir("Solo se permiten valores númericos");
                                        }
                                    } while (!r.validarNúmero(num2));
                                    if (Integer.parseInt(num2) > GClientes.clientes.get(Integer.parseInt(num)-1).historial.size()
                                            || Integer.parseInt(num2) <= 0) {
                                        consola.imprimir("El valor ingresado esta fuera del rango de opciones");
                                        num2 = "ª";
                                    }
                                } while (!r.validarNúmero(num2));

                                do {
                                    GClientes.clientes.get(Integer.parseInt(num) - 1).historial
                                            .get(Integer.parseInt(num2) - 1).autosDeInterés
                                            .add(GVehiculos.AgregarAListaDeInteres());
                                    do {
                                        consola.imprimir(
                                                "¿Desea agregar mas vehiculos a la lista de interes? \n Si:si No:no");
                                        masClientes = consola.ingresar();
                                    } while (!(masClientes.equalsIgnoreCase("Si")
                                            || masClientes.equalsIgnoreCase("No")));
                                } while (masClientes.equalsIgnoreCase("Si"));

                                break;

                            case "5":
                                if (GClientes.clientes.isEmpty()) {
                                    consola.imprimir("No exiten clientes para realizar una compra");
                                    break;
                                }
                                do {
                                    do {
                                        GClientes.Listar();
                                        consola.imprimir(
                                                "Ingres el número del cliente que desea realizar la compra de vehículos");
                                        num = consola.ingresar();
                                        if (!r.validarNúmero(num)) {
                                            consola.imprimir("Solo se permiten valores numéricos");
                                        }
                                    } while (!r.validarNúmero(num));
                                    if (Integer.parseInt(num) > GClientes.clientes.size()
                                            || Integer.parseInt(num) <= 0) {
                                        consola.imprimir("El valor ingresado esta fuera del rango de opciones");
                                        num = "ª";
                                    }
                                } while (!r.validarNúmero(num));
                                for (int i = 0; i < GClientes.clientes.get(Integer.parseInt(num) - 1).historial
                                        .size(); i++) {
                                    consola.imprimir(
                                            (i + 1) + ": " + GClientes.clientes.get(Integer.parseInt(num) - 1).historial
                                                    .get(i).fechaVisita);
                                }
                                do {
                                    do {
                                        consola.imprimir(
                                                "Ingrese el número de la visita la que desea comprar los vehiculos");
                                        num2 = consola.ingresar();
                                        if (!r.validarNúmero(num2)) {
                                            consola.imprimir("Solo se permiten valores númericos");
                                        }
                                    } while (!r.validarNúmero(num2));

                                    if (Integer.parseInt(num2) <= 0 || Integer.parseInt(
                                            num2) > GClientes.clientes.get(Integer.parseInt(num) - 1).historial
                                                    .size()) {
                                        consola.imprimir("El valor ingresado esta fuera del rango de opciones");
                                        num2 = "ª";
                                    }
                                } while (!r.validarNúmero(num2));
                                GClientes.clientes.get(Integer.parseInt(num) - 1).historial
                                        .get(Integer.parseInt(num2) - 1).compras
                                        .add(GCompras
                                                .crearCompra(GClientes.clientes.get(Integer.parseInt(num) - 1).historial
                                                        .get(Integer.parseInt(num2) - 1).autosDeInterés));
                                break;

                            case "6":
                                break;

                            default:
                                consola.imprimir("Ingrese un número del 1 al 6");
                                break;
                        }
                    } while (!respuestaCaso2.equals("7"));
                    break;
                case 3:
                    if (GClientes.clientes.isEmpty()) {
                        consola.imprimir("No hay clientes existentes");
                        break;
                    }
                    GClientes.Listar();
                    do {
                        consola.imprimir("Ingrese el número del cliente que desea ver el historial");
                        masClientes = consola.ingresar();
                        if (!r.validarNúmero(masClientes)) {
                            consola.imprimir("Solo se permiten datos numericos");
                        }
                        if (r.validarNúmero(masClientes)) {
                            if (Integer.parseInt(masClientes) > GClientes.clientes.size()
                                    || Integer.parseInt(masClientes) < 0) {
                                consola.imprimir("El valor ingresado se encuentra fuera del rango de datos");
                                masClientes = "ª";
                            }
                        }
                    } while (!r.validarNúmero(masClientes));
                    if (GClientes.clientes.get(Integer.parseInt(masClientes) - 1).historial.isEmpty()) {
                        consola.imprimir("""
                                El cliente aun no ha comprado o ha estado interesado en ningun automovil
                                Por consecuente no existe ningun registro en su historial""");
                        break;
                    }
                    for (int i = 0; i < GClientes.clientes.get(Integer.parseInt(masClientes) - 1).historial
                            .size(); i++) {
                        consola.imprimir(
                                GClientes.clientes.get(Integer.parseInt(masClientes) - 1).historial.get(i).fechaVisita
                                        .toString());
                        consola.imprimir("Autos de Interes: ");
                        for (int j = 0; j < GClientes.clientes.get(Integer.parseInt(masClientes) - 1).historial
                                .get(i).autosDeInterés.size(); j++) {
                            consola.imprimir(GClientes.clientes.get(Integer.parseInt(masClientes) - 1).historial
                                    .get(i).autosDeInterés.get(j)
                                    .toString());
                        }
                        consola.imprimir("Autos Comprados: ");
                        for (int k = 0; k < GClientes.clientes.get(Integer.parseInt(masClientes) - 1).historial
                                .get(i).compras.size(); k++) {
                            for (int l = 0; l < GClientes.clientes.get(Integer.parseInt(masClientes) - 1).historial
                                    .get(i).compras.get(k).autCom.size(); l++) {
                                consola.imprimir(GClientes.clientes.get(Integer.parseInt(masClientes) - 1).historial
                                        .get(i).compras
                                        .get(k).autCom.get(l).toString());
                            }
                            consola.imprimir(
                                    GClientes.clientes.get(Integer.parseInt(masClientes) - 1).historial.get(i).compras
                                            .get(k).fechaCompra.toString());
                        }
                    }

                    break;
                case 4:
                    GVehiculos.imprimirMarcas(GVehiculos.listarMarcas());
                    consola.imprimir("Seleccione una marca de la Lista:");
                    String marca = GVehiculos.listarMarcas().get(consola.ingresarEntero() - 1);
                    consola.imprimir("Historial clientes interesados:\n");
                    for (Cliente c : GClientes.clientes) {
                        LocalDate fechaBase = LocalDate.now().minusYears(3);
                        for (Visita v : c.historial) {
                            for (Auto a : v.autosDeInterés) {
                                if (a.marca.equals(marca)) {
                                    for (Compra compra : v.compras) {
                                        if (compra.fechaCompra.isBefore(fechaBase)) {
                                            consola.imprimir(c.toString());
                                        }
                                    }
                                }
                            }
                        }
                    }

                    break;
                case 5:
                    // Carros vendidos en un margen de tiempo dado (fecha inicial a fecha final).
                    // Incluir en este informe estadísticas de:
                    // Cantidad de carros
                    // Valor total facturado.
                    int autosComprados = 0;
                    int totalFacturado = 0;
                    consola.imprimir("Fecha inicial: ");
                    LocalDate fInicial = fecha.crearFecha();
                    consola.imprimir("Fecha final: ");
                    LocalDate fFinal = fecha.crearFecha();
                    for (Cliente c : GClientes.clientes) {
                        for (Visita v : c.historial) {
                            for (Compra com : v.compras) {
                                if (com.fechaCompra.isAfter(fInicial) && com.fechaCompra.isBefore(fFinal)) {
                                    autosComprados =+com.autCom.size();
                                    int pAux = Integer.parseInt(com.valorCompra);
                                    totalFacturado =+pAux;
                                }
                            }
                        }
                    }
                    consola.imprimir("Autos Comprados: " + autosComprados);
                    consola.imprimir("Total Facturado " + totalFacturado);
                    break;
                case 6:
                    System.out.println("Gracias por visitarnos :)");
                    break;
                default:
                    consola.imprimir("Escoja un número del 1 al 6");
                    break;

            }
        } while (op != 6);
    }
}
