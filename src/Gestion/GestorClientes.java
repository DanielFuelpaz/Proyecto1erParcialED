package Gestion;

import java.util.ArrayList;
import java.util.LinkedList;

import Clases.Auto;
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
        String direccion = "";
        do{
            consola.imprimir("Ingrese la dirección del cliente");
            direccion = consola.ingresar();
    }while(!validar.validarDirección(direccion));
        c1 = new Cliente(cédula, nombre, apellido, teléfono, direccion);
        c1.historial.add(new Visita());

        return c1;
    }

    public void modificarCliente() {
        // Hay que recorrer y solo cédula y teléfono
        if (this.clientes.size() <= 0) {
            consola.imprimir("La lista está vacía, primero debe crear un cliente");
            return;
        }
        consola.imprimir("Elija el número del cliente que desea modificar");
        int numClienteModificar;
        do {
            numClienteModificar = consola.ingresarEntero();
        } while (numClienteModificar - 1 > this.clientes.size() || numClienteModificar - 1 < 0);
        int AModificar;
        do{
        consola.imprimir(        
        "Ingrese lo que desea modificar del cliente: \n 1:Modificar cédula  \n 2:Modificar nombre \n 3:Modificar apellido \n 4:Modificar teléfono \n 5:Modificar dirección \n 6:Salir");
        AModificar = consola.ingresarEntero();
        switch (AModificar) {
            case 1:
            String nuevaCedula;
            boolean existeCedula = false;
            do {
                consola.imprimir("Ingrese la nueva cédula");
                nuevaCedula = consola.ingresar();
                for (Cliente c:this.clientes) {
                    if (c.telefono.equals(nuevaCedula)) {
                        consola.imprimir("La cédula ya existe");
                        existeCedula = true;
                    } else {
                        if (validar.validarTelefono(nuevaCedula, this)) {
                            this.clientes.get(numClienteModificar - 1).cedula = nuevaCedula;
                            existeCedula = true;
                        }
                        existeCedula = false;
                    }
                }
            } while (existeCedula);
            break;
            case 2:
                consola.imprimir("Ingrese el nuevo nombre");
                String nuevoNombre = consola.ingresar();
                if (validar.validarPersona(nuevoNombre)) {
                    this.clientes.get(numClienteModificar - 1).nombre = nuevoNombre;
                }
                break;
            case 3:
                consola.imprimir("Ingrese el nuevo apellido");
                String nuevoApellido = consola.ingresar();
                if (validar.validarPersona(nuevoApellido)) {
                    this.clientes.get(numClienteModificar - 1).apellido = nuevoApellido;
                }
                break;
            case 4:
                String nuevoTelefono;
                boolean existeTelefono = false;
                do {
                    consola.imprimir("Ingrese el nuevo teléfono");
                    nuevoTelefono = consola.ingresar();
                    for (Cliente c:this.clientes) {
                        if (c.telefono.equals(nuevoTelefono)) {
                            consola.imprimir("El teléfono ya existe");
                            existeTelefono = true;
                        } else {
                            if (validar.validarTelefono(nuevoTelefono, this)) {
                                this.clientes.get(numClienteModificar - 1).telefono = nuevoTelefono;
                                existeTelefono = true;
                            }
                            existeTelefono = false;
                        }
                    }
                } while (existeTelefono);
                break;
            case 5:
                consola.imprimir("Ingrese la nueva dirección");
                this.clientes.get(numClienteModificar - 1).dirección = consola.ingresar();
                break;
            case 6:
                break;
            default:
                consola.imprimir("Debe escribir un número del 1 al 6");
                break;
        }
    }while(AModificar != 6);
    }

    public void eliminarCliente() {
        if (this.clientes.size() != 0) {
            this.Listar();
            int numClienteCambio = 0;
            do {
                consola.imprimir("Elija el número del cliente que desea eliminar");
                numClienteCambio = consola.ingresarEntero();
            } while (numClienteCambio - 1 >= this.clientes.size()
                    || numClienteCambio - 1 < 0);
            this.clientes.remove(numClienteCambio - 1);
            this.Listar();
        } else {
            consola.imprimir("Debe crear un cliente primero");
        }
    }

    public Cliente buscarCliente() {
        int n;
        if (this.clientes.size() > 0) {
            do {
                consola.imprimirS("Elija el número del cliente que desea buscar: ");
                n = consola.ingresarEntero();
            } while (n-1 < 0 || n-1 >= this.clientes.size());
            return this.clientes.get(n - 1);
        }
        return null;
    }

    public Visita buscarVisita(Cliente c) {
        ArrayList<Visita> aux = c.historial;
        consola.imprimir("Seleccione la visita de la que sacar la lista de autos de interes:");
        int n = 1;
        for (Visita visita : aux) {

            consola.imprimir("Visita " + n + " " + visita.toString());
            n++;
        }
        n = consola.ingresarEntero();
        return aux.get(n-1);

    }

    public ArrayList<Auto> buscarAutosInteres() {
        ArrayList<Visita> aux = this.buscarCliente().historial;
        consola.imprimir("Seleccione la visita de la que sacar la lista de autos de interes:");
        int n = 1;
        for (Visita visita : aux) {

            consola.imprimir("Visita " + n + " " + visita.toString());
            n++;
        }
        n = consola.ingresarEntero();
        return aux.get(n-1).autosDeInterés;

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