package Utiles;

import Clases.Cliente;
import Gestion.GestorClientes;

public class Validacion {
    Interfaz consola = new Interfaz();

    public boolean validarCedula(String cedula, GestorClientes GClientes) {
        if (cedula.matches("[0-9]{10}")) {
            for (Cliente cliente : GClientes.clientes) {
                if (cedula.equals(cliente.cedula)) {
                    consola.imprimir("cédula ya existente");
                    return false;
                }
            }
            return true;
        }
        consola.imprimir("formato de cedula no válido");
        return false;
    }

    public boolean validarTelefono(String telefono, GestorClientes GClientes) {
        if (telefono.matches("[0-9]{10}")) {
            for (Cliente cliente : GClientes.clientes) {
                if (telefono.equals(cliente.telefono)) {
                    consola.imprimir("teléfono ya existente");
                    return false;
                }
            }
            return true;
        }
        consola.imprimir("formato de telefono no válido");
        return false;
    }

    public boolean validarPersona(String nombre) {
        return nombre.matches("[A-Z]([a-z])+");
    }

    public boolean validarTipos(String cadena){
        return cadena.matches("([A-Z])*");
    }

    // public boolean validarCliente(Cliente c) {
    // // validacion
    // if (c.cedula != null && c.cedula.matches("[0-9]{10}")) {
    // if (c.telefono != null && c.telefono.matches("09[0-9]{8}")) {
    // if (c.nombre != null && c.nombre.matches("[A-Z]([a-z])*")) {
    // if (c.apellido != null && c.apellido.matches("[A-Z]([a-z])*")) {
    // return true;
    // }
    // consola.imprimir("apellido no valido o vacío");
    // return false;
    // }
    // consola.imprimir("nombre no valida o vacio");
    // return false;
    // }
    // consola.imprimir("telefono no valido o vacío");
    // return false;
    // }
    // consola.imprimir("cédula no valida o vacía");
    // return false;
    // }
    public boolean validarDirección(String dirección){
        return dirección.matches("[(A-Za-z) 0-9]{3,}");
    }

    public boolean validarNúmero(String numero) {
        return numero.matches("[1-9]*");
    }

    public boolean validarOpcion(String opcion) {
        return opcion.matches("[1-7]");
    }
}
