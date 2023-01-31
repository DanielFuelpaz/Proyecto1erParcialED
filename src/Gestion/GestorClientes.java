package Gestion;

import java.util.LinkedList;

import Clases.Cliente;
import Clases.Visita;
import Utiles.Interfaz;
import Utiles.Validacion;

public class GestorClientes {
    public LinkedList<Cliente> clientes = new LinkedList<>();
    Interfaz consola = new Interfaz();
    Validacion validar = new Validacion();

    public Cliente crearCliente(Cliente c1) {
        consola.imprimir("Ingrese un cliente \n -----------------");
        String cédula = "";
        do {
            consola.imprimir("Ingrese la cédula del cliente");
            cédula = consola.ingresar();
        } while (!validar.validarCedula(cédula, this));
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
        } while (!validar.validarTelefono(teléfono, this));
        consola.imprimir("Ingrese la dirección del cliente");
        String direccion = consola.ingresar();
        c1 = new Cliente(cédula, nombre, apellido, teléfono, direccion);
        c1.historial.add(new Visita());

        return c1;
    }

    public void modificarCliente() {
        consola.imprimir("Elija el número del cliente que desea modificar");
        int numClienteModificar;
        do {
            numClienteModificar = consola.ingresarEntero();
        } while (numClienteModificar > this.clientes.size());

        consola.imprimir(
                "Ingrese lo que desea modificar del cliente: \n 1:Modificar cédula  \n 2:Modificar nombre \n 3:Modificar apellido \n 4:Modificar teléfono \n 5:Modificar dirección \n 6:Salir");
        int AModificar = consola.ingresarEntero();
        switch (AModificar) {
            case 1:
                consola.imprimir("Ingrese la nueva cédula");
                this.clientes.get(numClienteModificar - 1).cedula = consola.ingresar();
                break;
            case 2:
                consola.imprimir("Ingrese el nuevo nombre");
                this.clientes.get(numClienteModificar - 1).nombre = consola.ingresar();
                break;
            case 3:
                consola.imprimir("Ingrese el nuevo apellido");
                this.clientes.get(numClienteModificar - 1).apellido = consola.ingresar();
                break;
            case 4:
                consola.imprimir("Ingrese el nuevo teléfono");
                this.clientes.get(numClienteModificar - 1).telefono = consola.ingresar();
                break;
            case 5:
                consola.imprimir("Ingrese la nueva dirección");
                this.clientes.get(numClienteModificar - 1).dirección = consola.ingresar();
                break;
            case 6:
                break;
            default:
                consola.imprimir("Debe escribir las letras solicitadas");
                break;
        }
    }

    public void eliminarCliente() {
        if (this.clientes.size() != 0) {
            this.Listar();
            consola.imprimir("Elija el número del cliente que desea eliminar");
            int numClienteCambio;
            do {
                numClienteCambio = consola.ingresarEntero();
            } while (numClienteCambio - 1 > this.clientes.size()
                    || numClienteCambio - 1 <= 0);
            this.clientes.remove(numClienteCambio - 1);
            this.Listar();
        } else {
            consola.imprimir("Debe crear un cliente primero");
        }
    }

    public void buscarCliente() {
        int n;
        do {
            consola.imprimirS("Elija el número del cliente que desea buscar: ");
            n = consola.ingresarEntero();
        } while (n < 0 || n > this.clientes.size());
        consola.imprimir(this.clientes.get(n - 1).toString());
    }

    public void Listar() {
        if (clientes.size() <= 0) {
            consola.imprimir("Lista Vacia");
            return;
        } else {
            consola.imprimir("Lista Clientes");
            for (int i = 0; i < clientes.size(); i++) {
                consola.imprimir("Cliente " + (i + 1) + clientes.get(i).toString());
            }
        }
    }
}