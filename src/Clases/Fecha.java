package Clases;

import java.time.LocalDate;
import java.time.Month;

import Utiles.Interfaz;
import Utiles.Validacion;

public class Fecha {
    Interfaz consola = new Interfaz();
    Validacion validar = new Validacion();

    public LocalDate crearFecha() {
        int dia;
        do {
            consola.imprimir("Ingrese el Dia:");
            dia = consola.ingresarEntero();

        } while (!validar.validarDia(dia));
        int mes;
        do {
            consola.imprimir("Ingrese el Mes:");
            mes = consola.ingresarEntero();
        } while (!validar.validarMes(mes));
        int año;
        do {
            consola.imprimir("Ingrese el Año:");
            año = consola.ingresarEntero();
        } while (!validar.validarAño(año));
        LocalDate fecha = LocalDate.of(año, Month.of(mes), dia);
        return fecha;
    }
}
