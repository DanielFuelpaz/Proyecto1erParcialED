package Gestion;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import Clases.Auto;
import Clases.Compra;
import Utiles.Interfaz;
import Utiles.Validacion;

public class GestionCompra {
    Interfaz coso = new Interfaz();
    Validacion r = new Validacion();
    Compra c = new Compra();
    GestorClientes GClientes;

    public Compra crearCompra(ArrayList<Auto> catalogo) {
        String num = "";
        String res = "";
        String val = "";

        do {
            do {
                do {
                    for (int i = 0; i < catalogo.size(); i++) {
                        coso.imprimir("Vehículo " + (i + 1) + ": ");
                        coso.imprimir(catalogo.get(i).toString());
                    }
                    coso.imprimir("Ingrese el número de vehículo que desea comprar");
                    num = coso.ingresar();
                    if (!r.validarNúmero(num)) {
                        coso.imprimir("Solo se permiten valores numéricos");
                    }
                } while (!r.validarNúmero(num));

                if (Integer.parseInt(num) <= 0 || Integer.parseInt(num) > catalogo.size()) {
                    coso.imprimir("""
                            El valor ingresado no esta dentro del rango de opciones
                            Por favor vuelvalo a ingresar correctamente""");
                    num = "ª";
                }
            } while (!r.validarNúmero(num));
            c.autCom.add(catalogo.get(Integer.parseInt(num) - 1));
            catalogo.remove(Integer.parseInt(num) - 1);
            do {
                coso.imprimir("¿Desea ingresar más Autos? \n Si/No");
                res = coso.ingresar();
            } while (!(res.equalsIgnoreCase("Si")
                    || res.equalsIgnoreCase("No")));
                    if(catalogo.isEmpty()){
                        coso.imprimir("No existen mas vehiculos para agregar a la compra");
                        res="No";
                    }
        } while (res.equalsIgnoreCase("Si"));

        coso.imprimir("Fecha:");
        int dia;
        do {
            coso.imprimir("Ingrese el Dia:");
            dia = coso.ingresarEntero();

        } while (!r.validarDia(dia));
        int mes;
        do {
            coso.imprimir("Ingrese el Mes:");
            mes = coso.ingresarEntero();
        } while (!r.validarMes(mes));
        int a;
        do {
            coso.imprimir("Ingrese el Año:");
            a = coso.ingresarEntero();
        } while (!r.validarAño(a));

        c.setFechaCompra(LocalDate.of(a, Month.of(mes), dia));
        do {
            coso.imprimir("Ingrese el valor de la compra");
            val = coso.ingresar();
            if(!r.validarNúmero(val)){
                coso.imprimir("""
                    Solo se permiten valores numéricos
                    Ejemplo: 21,12""");
            }
        } while (!r.validarNúmeroDecimal(val));  
        c.setValorCompra(val);
        return c;
        
    }

}
