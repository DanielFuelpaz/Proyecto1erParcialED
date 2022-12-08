import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import Clases.Auto;
import Gestion.GestionCompra;
import Utiles.Validacion;

public class MainFactura {
    public static void main(String[] args) {
        ArrayList<Auto> interes = new ArrayList();
        GestionCompra coso = new GestionCompra(interes);
        Auto Audi = new Auto("TCT-3030", "Azul", "Audi", "2018");
        Auto Mercedes = new Auto("CTR-2015", "Perla", "Mercedes", "2015");
        Auto Mclaren = new Auto("QWR-2156", "Azul", "Maclaren", "2013");
        Auto Volvo = new Auto("TBD-2020","Negro","Volvo","2022");
        Auto Ferrari = new Auto("TNK-1240","Rojo","Ferrari","2018");
        Auto Bugati= new Auto("GUO-3500","Gris","Bugati","2022");
        Auto Challenger = new Auto("XSR-5896","Blanco","Challenger","1990");
      /*  coso.Agregar(Audi);
        coso.Agregar(Mclaren);
        coso.Agregar(Mercedes);
        coso.MostrarLista();
        coso.BorrarCarro(2);
        coso.GenerarFactura("21/12/2022", "12346.231");
        coso.ImprimirFactura();

        */
        Scanner leer = new Scanner(System.in);
        String fin,respuesta,agregar;
        int entrada;
        boolean validar=false;

        Validacion control = new Validacion();
            do {
               
        System.out.println("===== MENU DE FACTURACION =====\n"
                + "1. Agregar Auto Interesado\n"
                + "2. Eliminar Auto Interesado\n"
                + "3. Generar Factura\n"
                + "4. Imprimir Factura");
         entrada = leer.nextInt();
      
        switch (entrada) {
            case 1:

            do {

                System.out.println(Audi.toString());
                System.out.println(Mercedes.toString());
                System.out.println(Mclaren.toString());
                System.out.println(Volvo.toString());
                System.out.println(Ferrari.toString());
                System.out.println(Bugati.toString());
                System.out.println(Challenger.toString());


                System.out.println(" Que autos desea Ingresar");

                do {
                agregar = leer.next().toLowerCase();
                if (!control.validarOpcion(agregar)) {
                    System.out.println("== DATO INCORRECTO ==");
                    System.out.println("== Ingrese Nuevamente ==");
                    validar=false;
                } else {
                    validar=true;
                }

            } while (validar==false);

                if (agregar.equals("1")) {
                    coso.Agregar(Audi);
                }if (agregar.equals("2")) {
                    coso.Agregar(Mercedes);
                }if (agregar.equals("3")) {
                    coso.Agregar(Mclaren);
                }if (agregar.equals("4")) {
                    coso.Agregar(Volvo);
                }if (agregar.equals("5")) {
                    coso.Agregar(Ferrari);
                }if (agregar.equals("6")) {
                    coso.Agregar(Bugati);
                }if (agregar.equals("7")) {
                    coso.Agregar(Challenger);
                }
                System.out.println("Desea Agregar mas Autos? Si/No");
                respuesta = leer.next().toUpperCase();

            } while (respuesta.equals("SI"));

                break;

            case 2:

                coso.MostrarLista();
                System.out.println();
                System.out.println("Ingrese el # del Auto que desee");
                int eliminar = leer.nextInt();
                coso.BorrarCarro(eliminar);
                break;

             case 3:

                System.out.println("Ingrese la Fecha: ");
                String fecha = leer.next();
                System.out.println("Ingrese el Valor: ");
                String valor = leer.next();
                coso.GenerarFactura(fecha, valor);

                break;

            case 4:
                
                System.out.println("====== IMPRESION FACTURA =======");
                coso.ImprimirFactura();
                break;

            default:

                System.out.println("===== Opcion No Valida ======");

                break;
                
        }
        System.out.println("Desea Terminar ? Si/No");
        fin = leer.next().toLowerCase();
    } while (fin.equals("no"));
    System.out.println("TERMINADO");
    }


}
