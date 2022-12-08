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
            System.out.println("Cliente " + (i + 1) + GestorClientes.super.get(i).toString());
        }
    }

    // Establecimiento
    public void establecerCliente(String temp, Validacion val, Scanner leer, Cliente c1, GestorClientes GC) {
        this.establecerCedula(temp, val, leer, false, c1, GC);
        System.out.println("Ingrese su nombre:");
        this.establecerNombre(temp, val, leer, false, c1);
        System.out.println("Ingrese su Apellido:");
        this.establecerApellido(temp, val, leer, false, c1);
        System.out.println("Ingrese su # de telefono:");
        this.establecerTelefono(temp, val, leer, false, c1,GC);
        System.out.println("Ingrese su dirección:");
        this.establecerDireccion(temp, leer, c1);
        c1.fechaVisita = LocalDate.now();
        this.add(c1);
    }

    public void establecerCedula(String temp, Validacion val, Scanner leer, boolean validacion, Cliente c1,GestorClientes GC) {
        System.out.println("Ingrese su número de cedula:");
        do {
            temp = leer.nextLine();
            if(GC.size()>0){
                for (int i = 0; i < GC.size(); i++) {
                        if (val.validarCedula(temp)&& !GC.get(i).getCedula().equals(temp)) {
                        c1.setCedula(temp);
                        validacion = true;
                        return;
                    }else if(GC.get(i).getCedula().equals(temp)){
                        System.out.println("Número de teléfono mal ingresado o ya existe, ingrese otro número de teléfono");
                        validacion = false;
                        break;
                    }    
                }
            }else{
            if (val.validarCedula(temp = leer.nextLine())) {
                c1.setCedula(temp);
                validacion = true;
            } else {
                System.out.println("cedula mal ingresada, ingrese otra vez");
                validacion = false;
            }
        }
        } while (validacion == false);

    }

    public void establecerNombre(String temp, Validacion val, Scanner leer, boolean validacion, Cliente c1) {
        do {
            if (val.validarPersona(temp = leer.nextLine())) {
                c1.setNombre(temp);

                validacion = true;
            } else {
                System.out.println("Nombre mal ingresado, ingrese otra vez");
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
                System.out.println("Apellido mal ingresado, ingrese otra vez");
                validacion = false;
            }
        } while (validacion == false);

    }

    public void establecerTelefono(String temp, Validacion val, Scanner leer, boolean validacion, Cliente c1, GestorClientes GC) {
        do {
            temp = leer.nextLine();
            if(GC.size()>0){
                for (int i = 0; i < GC.size(); i++) {
                        if (val.validarTelefono(temp)&& !GC.get(i).getTelefono().equals(temp)) {
                        c1.setTelefono(temp);
                        validacion = true;
                        return;
                    }else if(GC.get(i).getTelefono().equals(temp)){
                        System.out.println("Número de teléfono mal ingresado o ya existe, ingrese otro número de teléfono");
                        validacion = false;
                    }    
                }
            }else{
                if (val.validarTelefono(temp)) {
                    c1.setTelefono(temp);
                    validacion = true;
                    return;
                }else {
                    System.out.println("Número de teléfono mal ingresado, ingrese otra vez");
                    validacion = false;
                }    
            }
        } while (validacion == false);
    }

    public void establecerDireccion(String temp, Scanner leer, Cliente c1) {
        c1.setDirección(temp = leer.nextLine());
    }

}
