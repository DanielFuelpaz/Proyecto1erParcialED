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
        return nombre.matches("[A-Z]([a-z]){2,}");
    }

    public boolean validarDirección(String dirección) {
        return dirección.matches("[(A-Za-z)(0-9) ]{3,}");
    }

    public boolean validarNúmeroDecimal(String numero) {
        return numero.matches("^[0-9]+(,[0-9]+)?$");
    }
    
    
    public boolean validarDia(int opcion) {
        return opcion <= 31 && opcion > 0;
    }

    public boolean validarMes(int opcion) {
        return opcion <= 12 && opcion > 0;
    }

    public boolean validarAño(int opcion) {
        return opcion >= 2000;
    }

    public boolean validarNúmero(String numero) {
        return numero.matches("[0-9]*");
    }
    public boolean validarTipos(String cadena) {
        return cadena.matches("([A-Z])*");
    }

    public boolean validarMatricula(String cadena) {
        return cadena.matches("^[a-zA-Z]{3}-[0-9]{4}$");
    }

    public boolean validarColor(String cadena) {
        return cadena.matches("([A-Z])*");
    }

    public int validarOpcion() {
        String op;
        do {
            op = consola.ingresar();
            if (!this.validarNúmero(op)) {
                consola.imprimir("Tipo de dato invalido o negativo");
            }
        } while (!this.validarNúmero(op));
        if (op.length() > 0) {
            return Integer.parseInt(op);
        }
        return -1;
    }

}
