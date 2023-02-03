package Gestion;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import Clases.Auto;
import Clases.Cliente;
import Clases.Compra;
import Utiles.Interfaz;
import Utiles.Validacion;

public class GestionCompra {
    ArrayList<Compra> compras;
    Interfaz consola = new Interfaz();
    Validacion validar = new Validacion();
    Compra c = null;

    public void crearCompra(GestorClientes GClientes) {
        Cliente aux = GClientes.buscarCliente();
        ArrayList<Auto> autosInteres = GClientes.buscarAutosInteres();
        int in;
        GClientes.Listar();
        consola.imprimir("Ingrese el indice del auto a comprar:");
        in = consola.ingresarEntero();

        consola.imprimir("Fecha:");
        int dia;
        do {
            consola.imprimir("Ingrese el Dia:");
            dia = consola.ingresarEntero();
        } while (validar.validarDia(dia));
        int mes;
        do {
            consola.imprimir("Ingrese el Mes:");
            mes = consola.ingresarEntero();
        } while (validar.validarMes(mes));
        int a;
        do {
            consola.imprimir("Ingrese el Año:");
            a = consola.ingresarEntero();
        } while (validar.validarAño(a));

        c = new Compra(LocalDate.of(consola.ingresarEntero(), Month.of(consola.ingresarEntero()), consola.ingresarEntero()), null);
        c.autCom.add(autosInteres.get(in));
        GClientes.buscarVisita(aux).compras.add(c);
        GClientes.buscarVisita(aux).autosDeInterés.remove(in);
    }

}
