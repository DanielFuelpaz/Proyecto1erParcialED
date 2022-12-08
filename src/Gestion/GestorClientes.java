package Gestion;

import Clases.Cliente;
import Utiles.Validacion;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class GestorClientes extends LinkedList<Cliente> {

    public Cliente search(int pos) {
        if (pos < 0 || pos > GestorClientes.super.size()) {
            return null;
        } else {

            System.out.println(GestorClientes.super.get(pos - 1).toString());

        }

        return GestorClientes.super.get(pos);
    }

    public void Listar() {
        if (this.size() < 0) {
            return;
        }
        for (int i = 0; i < GestorClientes.super.size(); i++) {
            System.out.println("Cliente " + (i + 1) + "\n" + GestorClientes.super.get(i).toString());
        }
    }

    // Establecimiento
    public void establecerCliente(String temp, Validacion val, Scanner leer, Cliente c1) {
        this.establecerCedula(temp, val, leer, false, c1);
        System.out.println("Ingrese su nombre:");
        this.establecerNombre(temp, val, leer, false, c1);
        System.out.println("Ingrese su Apellido:");
        this.establecerApellido(temp, val, leer, false, c1);
        System.out.println("Ingrese su # de telefono:");
        this.establecerTelefono(temp, val, leer, false, c1);
        System.out.println("Ingrese su dirección:");
        this.establecerDireccion(temp, leer, c1);
        c1.fechaVisita = LocalDate.now();
        this.add(c1);
    }

    public void establecerCedula(String temp, Validacion val, Scanner leer, boolean validacion, Cliente c1) {
        System.out.println("Ingrese su número de cedula:");
        do {
            if (val.validarCedula(temp = leer.nextLine())) {
                c1.setCedula(temp);
                validacion = true;
            } else {
                System.out.println("cedula mal ingresada");
                validacion = false;
            }
        } while (validacion == false);

    }

    public void establecerNombre(String temp, Validacion val, Scanner leer, boolean validacion, Cliente c1) {
        do {
            if (val.validarPersona(temp = leer.nextLine())) {
                c1.setNombre(temp);

                validacion = true;
            } else {
                System.out.println("Nombre mal ingresado");
                validacion = false;
            }
        } while (validacion == false);

    }

    public void establecerApellido(String temp, Validacion val, Scanner leer, boolean validacion, Cliente c1) {
        do {

            if (val.validarPersona(temp = leer.nextLine())) {
                c1.setApellido(temp);
                validacion = true;
            } else {
                System.out.println("Apellido mal ingresado");
                validacion = false;
            }
        } while (validacion == false);

    }

    public void establecerTelefono(String temp, Validacion val, Scanner leer, boolean validacion, Cliente c1) {
        do {

            if (val.validarTelefono(temp = leer.nextLine())) {
                c1.setTelefono(temp);
                validacion = true;
            } else {
                System.out.println("Número de teléfono mal ingresado");
                validacion = false;
            }
        } while (validacion == false);
    }

    public void establecerDireccion(String temp, Scanner leer, Cliente c1) {
        c1.setDirección(temp = leer.nextLine());
    }

    public void establecerInteres(String temp, Validacion val, Scanner leer, boolean validacion, Cliente c1) {

    }

}
